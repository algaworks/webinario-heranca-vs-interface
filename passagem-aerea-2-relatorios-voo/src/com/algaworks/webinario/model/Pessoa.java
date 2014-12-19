package com.algaworks.webinario.model;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	
	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract String getTipo();

}
