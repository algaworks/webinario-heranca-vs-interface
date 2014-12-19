package com.algaworks.webinario.report;

import java.util.List;

import com.algaworks.webinario.model.Pessoa;

public class RelatorioVoo {

	public void imprimir(List<Pessoa> pessoas) {
		System.out.println("######################################################");
		System.out.println("### Relatório de Passageiros e Tripulantes a bordo ###");
		System.out.println("######################################################");
		System.out.println();
	
		pessoas.forEach(p -> System.out.printf("%-15s: %s\n", p.getTipo(), p.getNome()));
	}
	
}
