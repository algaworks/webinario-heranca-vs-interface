package com.algaworks.webinario.model;

import com.algaworks.webinario.service.CalculadoraTarifa;
import com.algaworks.webinario.service.TarifaBasica;
import com.algaworks.webinario.service.TarifaFlex;

public enum TipoTarifa {

	BASICO(new TarifaBasica()),
	FLEX(new TarifaFlex());
	
	private final CalculadoraTarifa calculadora;

	TipoTarifa(CalculadoraTarifa calculadora) {
		this.calculadora = calculadora;
	}

	public CalculadoraTarifa getCalculadora() {
		return this.calculadora;
	}

}
