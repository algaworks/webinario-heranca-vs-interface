package com.algaworks.webinario.model;

import java.math.BigDecimal;

public class TarifaVoo {

	private BigDecimal preco;
	private Integer pontos;
	private Integer franquiaDeBagagem;

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Integer getFranquiaDeBagagem() {
		return franquiaDeBagagem;
	}

	public void setFranquiaDeBagagem(Integer franquiaDeBagagem) {
		this.franquiaDeBagagem = franquiaDeBagagem;
	}

}
