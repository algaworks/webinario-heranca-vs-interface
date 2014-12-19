package com.algaworks.webinario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.webinario.model.TarifaVoo;
import com.algaworks.webinario.model.TipoTarifa;
import com.algaworks.webinario.model.Voo;
import com.algaworks.webinario.repository.Voos;

public class TelaConsultaVoos {

	private static final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	public static void main(String[] args) {
		Voos voosRepository = new Voos();
		List<Voo> voos = voosRepository.pesquisar("São Paulo", "Rio de Janeiro", LocalDateTime.now().plusDays(2));

		System.out.printf("Confira abaixo os horários e tarifas para os voos de %s para %s\n", "São Paulo",	"Rio de Janeiro");

		StringBuilder formato = new StringBuilder("%-6s | %-18s | %-18s");
		List<String> argumentos = new ArrayList<String>();
		argumentos.add("Número");
		argumentos.add("Data partida");
		argumentos.add("Data chegada");

		for (TipoTarifa tipoTarifa : TipoTarifa.values()) {
			formato.append(" | %-10s");
			argumentos.add(tipoTarifa.toString());
		}
		formato.append("\n");

		System.out.printf(formato.toString(), argumentos.toArray());
		for (Voo voo : voos) {
			List<String> valores = new ArrayList<String>();
			valores.add(voo.getNumero());
			valores.add(voo.getDataPartida().format(formatador));
			valores.add(voo.getDataChegada().format(formatador));

			for (TarifaVoo tarifaVoo : voo.getTarifas()) {
				valores.add(tarifaVoo.getPreco().toString());
			}

			System.out.printf(formato.toString(), valores.toArray());

		}
	}
	
}
