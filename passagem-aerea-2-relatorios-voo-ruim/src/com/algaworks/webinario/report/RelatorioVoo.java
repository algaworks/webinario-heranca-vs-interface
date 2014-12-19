package com.algaworks.webinario.report;

import java.util.List;

import com.algaworks.webinario.model.Passageiro;
import com.algaworks.webinario.model.Tripulante;

public class RelatorioVoo {

	public void imprimir(List<Passageiro> passageiros, List<Tripulante> tripulantes) {
		System.out.println("######################################################");
		System.out.println("### Relatório de Passageiros e Tripulantes a bordo ###");
		System.out.println("######################################################");
		System.out.println();
	
		passageiros.forEach(p -> System.out.printf("%-15s: %s\n", p.getTipo(), p.getNome()));
		tripulantes.forEach(p -> System.out.printf("%-15s: %s\n", p.getTipo(), p.getNome()));
	}
	
}
