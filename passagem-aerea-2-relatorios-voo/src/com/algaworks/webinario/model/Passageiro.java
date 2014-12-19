package com.algaworks.webinario.model;

public class Passageiro extends Pessoa {

	private static final String TIPO = "Passageiro";
	
	private CategoriaFidelidade categoriaFidelidade;
	
	public Passageiro(String nome) {
		super(nome);
	}

	public CategoriaFidelidade getCategoriaFidelidade() {
		return categoriaFidelidade;
	}

	public void setCategoriaFidelidade(CategoriaFidelidade categoriaFidelidade) {
		this.categoriaFidelidade = categoriaFidelidade;
	}

	@Override
	public String getTipo() {
		return TIPO;
	}

}
