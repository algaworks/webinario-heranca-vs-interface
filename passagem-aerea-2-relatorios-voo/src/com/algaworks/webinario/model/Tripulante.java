package com.algaworks.webinario.model;

public class Tripulante extends Pessoa {

	private static final String TIPO = "Tripulante";
	
	private Cargo cargo;
	private String matricula;
	
	public Tripulante(String nome) {
		super(nome);
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

	@Override
	public String getTipo() {
		return TIPO;
	}

}
