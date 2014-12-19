package com.algaworks.webinario.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

public class VooTest {

	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre1e3Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(2), new BigDecimal("100"));
		
		List<TarifaVoo> tarifas = voo.getTarifas();
		assertEquals(180.0, tarifas.get(0).getPreco().doubleValue(), 0.0001);
		assertEquals(190.0, tarifas.get(1).getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre4e15Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(8), new BigDecimal("100"));
		
		List<TarifaVoo> tarifas = voo.getTarifas();
		assertEquals(160.0, tarifas.get(0).getPreco().doubleValue(), 0.0001);
		assertEquals(170.0, tarifas.get(1).getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEntre16e60Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(40), new BigDecimal("100"));
		
		List<TarifaVoo> tarifas = voo.getTarifas();
		assertEquals(130.0, tarifas.get(0).getPreco().doubleValue(), 0.0001);
		assertEquals(140.0, tarifas.get(1).getPreco().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoDaTarifaParaViagemAgendadaEmMaisDe60Dias() {
		Voo voo = new Voo(LocalDateTime.now().plusDays(80), new BigDecimal("100"));
		
		List<TarifaVoo> tarifas = voo.getTarifas();
		assertEquals(100.0, tarifas.get(0).getPreco().doubleValue(), 0.0001);
		assertEquals(110.0, tarifas.get(1).getPreco().doubleValue(), 0.0001);
	}
	
	
}
