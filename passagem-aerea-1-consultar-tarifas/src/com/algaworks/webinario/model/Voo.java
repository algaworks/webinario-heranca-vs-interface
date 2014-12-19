package com.algaworks.webinario.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {

	private String numero;
	private String origem;
	private String destino;
	private LocalDateTime dataPartida;
	private LocalDateTime dataChegada;
	private BigDecimal precoBase;

	public Voo(LocalDateTime dataPartida, BigDecimal precoBase) {
		this.dataPartida = dataPartida;
		this.precoBase = precoBase;
	}

	public Voo(String numero, String origem, String destino, LocalDateTime dataPartida, LocalDateTime dataChegada,
			BigDecimal precoBase) {
		this.numero = numero;
		this.origem = origem;
		this.destino = destino;
		this.dataPartida = dataPartida;
		this.dataChegada = dataChegada;
		this.precoBase = precoBase;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDateTime getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(LocalDateTime dataPartida) {
		this.dataPartida = dataPartida;
	}

	public LocalDateTime getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(LocalDateTime dataChegada) {
		this.dataChegada = dataChegada;
	}

	public BigDecimal getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(BigDecimal precoBase) {
		this.precoBase = precoBase;
	}

	public List<TarifaVoo> getTarifas() {
		List<TarifaVoo> tarifas = new ArrayList<>();

		for (TipoTarifa tipoTarifa : TipoTarifa.values()) {
			tarifas.add(tipoTarifa.getCalculadora().calcular(this));
		}

		return tarifas;
	}

}
