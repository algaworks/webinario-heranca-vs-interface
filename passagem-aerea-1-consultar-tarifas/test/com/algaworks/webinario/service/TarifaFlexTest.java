package com.algaworks.webinario.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.webinario.model.TarifaVoo;
import com.algaworks.webinario.model.Voo;

public class TarifaFlexTest {
	
	private TarifaFlex tarifaFlex;

	@Before
	public void inicializar() {
		this.tarifaFlex = new TarifaFlex();
	}

	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre1e3Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(1), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaFlex.calcular(voo);

		assertEquals(190.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre4e15Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(10), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaFlex.calcular(voo);

		assertEquals(170.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre16e60Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(40), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaFlex.calcular(voo);

		assertEquals(140.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEmMaisDe60Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(80), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaFlex.calcular(voo);

		assertEquals(110.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
}
