package com.algaworks.webinario.service;

import com.algaworks.webinario.model.TarifaVoo;
import com.algaworks.webinario.model.Voo;

public interface CalculadoraTarifa {

	public TarifaVoo calcular(Voo voo);
	
}
