package com.algaworks.webinario.model;

public class Passageiro {

	private static final String TIPO = "Passageiro";
	
	private CategoriaFidelidade categoriaFidelidade;
	
	private Pessoa pessoa;
	
	public Passageiro(String nome) {
		this.pessoa = new Pessoa(nome, TIPO);
	}

	public CategoriaFidelidade getCategoriaFidelidade() {
		return categoriaFidelidade;
	}

	public void setCategoriaFidelidade(CategoriaFidelidade categoriaFidelidade) {
		this.categoriaFidelidade = categoriaFidelidade;
	}

	public String getTipo() {
		return this.pessoa.getTipo();
	}
	
	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public String getCpf() {
		return this.pessoa.getCpf();
	}

}
