package com.algaworks.webinario;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.webinario.model.Passageiro;
import com.algaworks.webinario.model.Pessoa;
import com.algaworks.webinario.model.Tripulante;
import com.algaworks.webinario.report.RelatorioVoo;

public class TelaRelatorioVoo {

	public static void main(String[] args) {
		RelatorioVoo relatorio = new RelatorioVoo();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Passageiro("Neymar Junior"));
		pessoas.add(new Passageiro("Lionel Messi"));
		pessoas.add(new Passageiro("Javier Mascherano"));
		pessoas.add(new Passageiro("Xavi Hernandez"));
		
		pessoas.add(new Tripulante("Augusto Silva"));
		pessoas.add(new Tripulante("José Antônio"));
		
		relatorio.imprimir(pessoas);
	}
	
}
