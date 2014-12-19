package com.algaworks.webinario.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.webinario.model.Voo;

public class Voos {

	public List<Voo> pesquisar(String origem, String destino, LocalDateTime dataPartida) {
		// Busca no banco de dados por exemplo
		List<Voo> voos = new ArrayList<Voo>();
		voos.add(new Voo("1123", "São Paulo", "Rio de Janeiro", LocalDateTime.now().plusDays(2), 
				LocalDateTime.now().plusDays(2).plusHours(1), new BigDecimal(80)));
		voos.add(new Voo("1124", "São Paulo", "Rio de Janeiro", LocalDateTime.now().plusDays(2).plusHours(1), 
				LocalDateTime.now().plusDays(2).plusHours(2), new BigDecimal(90)));
		voos.add(new Voo("1125", "São Paulo", "Rio de Janeiro", LocalDateTime.now().plusDays(2).plusHours(2), 
				LocalDateTime.now().plusDays(2).plusHours(3), new BigDecimal(100)));
		
		return voos;
	}
	
}
