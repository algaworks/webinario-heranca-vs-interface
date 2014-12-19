package com.algaworks.webinario.model;

public class Tripulante {

	private static final String TIPO = "Tripulante";
	
	private Cargo cargo;
	private String matricula;
	
	private Pessoa pessoa;
	
	public Tripulante(String nome) {
		this.pessoa = new Pessoa(nome, TIPO);
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
