package com.algaworks.webinario.service;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

import com.algaworks.webinario.model.TarifaVoo;
import com.algaworks.webinario.model.Voo;

public class TarifaFlex implements CalculadoraTarifa {

	private static final BigDecimal FATOR_DE_1_A_3_DIAS = new BigDecimal("1.9");
	private static final BigDecimal FATOR_DE_4_A_15_DIAS = new BigDecimal("1.7");
	private static final BigDecimal FATOR_DE_16_A_60_DIAS = new BigDecimal("1.4");
	private static final BigDecimal FATOR_MAIS_DE_60_DIAS = new BigDecimal("1.1");
	
	@Override
	public TarifaVoo calcular(Voo voo) {
		TarifaVoo tarifa = new TarifaVoo();
		
		BigDecimal precoBase = voo.getPrecoBase();
		LocalDateTime dataPartida = voo.getDataPartida();
		
		long diasParaAViagem = Duration.between(LocalDateTime.now(), dataPartida).toDays();
		
		BigDecimal fator = FATOR_MAIS_DE_60_DIAS;
		if (diasParaAViagem <= 3) {
			fator = FATOR_DE_1_A_3_DIAS;
		} else if (diasParaAViagem >= 4 && diasParaAViagem <= 15) {
			fator = FATOR_DE_4_A_15_DIAS;
		} else if (diasParaAViagem >= 16 && diasParaAViagem <= 60) {
			fator = FATOR_DE_16_A_60_DIAS;
		} 
		
		tarifa.setPreco(precoBase.multiply(fator));
		return tarifa;
	}

}
