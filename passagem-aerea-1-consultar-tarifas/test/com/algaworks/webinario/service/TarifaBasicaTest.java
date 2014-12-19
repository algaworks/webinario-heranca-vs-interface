package com.algaworks.webinario.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.webinario.model.TarifaVoo;
import com.algaworks.webinario.model.Voo;

public class TarifaBasicaTest {

	private TarifaBasica tarifaBasica;

	@Before
	public void inicializar() {
		this.tarifaBasica = new TarifaBasica();
	}

	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre1e3Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(1), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaBasica.calcular(voo);

		assertEquals(180.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre4e15Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(10), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaBasica.calcular(voo);

		assertEquals(160.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre16e60Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(40), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaBasica.calcular(voo);

		assertEquals(130.0, tarifa.getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEmMaisDe60Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(80), new BigDecimal("100.00"));
		TarifaVoo tarifa = tarifaBasica.calcular(voo);

		assertEquals(100.0, tarifa.getPreco().doubleValue(), 0.0001);
	}

}
