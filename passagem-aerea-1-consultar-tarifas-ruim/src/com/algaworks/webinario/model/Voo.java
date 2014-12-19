package com.algaworks.webinario.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {

	private static final BigDecimal FATOR_TARIFA_BASICA_DE_1_A_3_DIAS = new BigDecimal("1.8");
	private static final BigDecimal FATOR_TARIFA_BASICA_DE_4_A_15_DIAS = new BigDecimal("1.6");
	private static final BigDecimal FATOR_TARIFA_BASICA_DE_16_A_60_DIAS = new BigDecimal("1.3");
	private static final BigDecimal FATOR_TARIFA_BASICA_MAIS_DE_60_DIAS = BigDecimal.ONE;

	private static final BigDecimal FATOR_TARIFA_FLEX_DE_1_A_3_DIAS = new BigDecimal("1.9");
	private static final BigDecimal FATOR_TARIFA_FLEX_DE_4_A_15_DIAS = new BigDecimal("1.7");
	private static final BigDecimal FATOR_TARIFA_FLEX_DE_16_A_60_DIAS = new BigDecimal("1.4");
	private static final BigDecimal FATOR_TARIFA_FLEX_MAIS_DE_60_DIAS = new BigDecimal("1.1");

	private String numero;
	private String origem;
	private String destino;
	private LocalDateTime dataPartida;
	private LocalDateTime dataChegada;
	private BigDecimal precoBase;

	public Voo() {
	}

	public Voo(LocalDateTime dataPartida, BigDecimal precoBase) {
		this.dataPartida = dataPartida;
		this.precoBase = precoBase;
	}

	public Voo(String numero, String origem, String destino, LocalDateTime dataPartida, LocalDateTime dataChegada, BigDecimal precoBase) {
		this.numero = numero;
		this.origem = origem;
		this.destino = destino;
		this.dataPartida = dataPartida;
		this.dataChegada = dataChegada;
		this.precoBase = precoBase;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDateTime getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(LocalDateTime dataPartida) {
		this.dataPartida = dataPartida;
	}

	public LocalDateTime getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(LocalDateTime dataChegada) {
		this.dataChegada = dataChegada;
	}

	public BigDecimal getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(BigDecimal precoBase) {
		this.precoBase = precoBase;
	}

	public List<TarifaVoo> getTarifas() {
		List<TarifaVoo> tarifas = new ArrayList<>();

		long diasParaAViagem = Duration.between(LocalDateTime.now(), dataPartida).toDays();

		for (TipoTarifa tipoTarifa : TipoTarifa.values()) {
			TarifaVoo tarifa = new TarifaVoo();
			BigDecimal fator = null;

			switch (tipoTarifa) {
			case BASICO:
				if (diasParaAViagem <= 3) {
					fator = FATOR_TARIFA_BASICA_DE_1_A_3_DIAS;
				} else if (diasParaAViagem >= 4 && diasParaAViagem <= 15) {
					fator = FATOR_TARIFA_BASICA_DE_4_A_15_DIAS;
				} else if (diasParaAViagem >= 16 && diasParaAViagem <= 60) {
					fator = FATOR_TARIFA_BASICA_DE_16_A_60_DIAS;
				} else {
					fator = FATOR_TARIFA_BASICA_MAIS_DE_60_DIAS;
				}

				break;
			case FLEX:
				if (diasParaAViagem <= 3) {
					fator = FATOR_TARIFA_FLEX_DE_1_A_3_DIAS;
				} else if (diasParaAViagem >= 4 && diasParaAViagem <= 15) {
					fator = FATOR_TARIFA_FLEX_DE_4_A_15_DIAS;
				} else if (diasParaAViagem >= 16 && diasParaAViagem <= 60) {
					fator = FATOR_TARIFA_FLEX_DE_16_A_60_DIAS;
				} else {
					fator = FATOR_TARIFA_FLEX_MAIS_DE_60_DIAS;
				}

				break;
			}

			tarifa.setPreco(precoBase.multiply(fator));
			tarifas.add(tarifa);
		}

		return tarifas;
	}

}
