package com.algaworks.webinario;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.webinario.model.Passageiro;
import com.algaworks.webinario.model.Tripulante;
import com.algaworks.webinario.report.RelatorioVoo;

public class TelaRelatorioVoo {

	public static void main(String[] args) {
		RelatorioVoo relatorio = new RelatorioVoo();
		List<Passageiro> passageiros = new ArrayList<Passageiro>();
		passageiros.add(new Passageiro("Neymar Junior"));
		passageiros.add(new Passageiro("Lionel Messi"));
		passageiros.add(new Passageiro("Javier Mascherano"));
		passageiros.add(new Passageiro("Xavi Hernandez"));
		
		List<Tripulante> tripulantes = new ArrayList<Tripulante>();
		tripulantes.add(new Tripulante("Augusto Silva"));
		tripulantes.add(new Tripulante("José Antônio"));
		
		relatorio.imprimir(passageiros, tripulantes);
	}
	
}
