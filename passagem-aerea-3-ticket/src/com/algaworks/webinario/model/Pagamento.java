package com.algaworks.webinario.model;

import java.math.BigDecimal;

public class Pagamento {

	private BigDecimal valor;
	private StatusPagamento status;

	public Pagamento() {
		this.status = StatusPagamento.PENDENTE;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void imprimirRecibo() {
		System.out.println("Valor recebido: " + valor + " Status: " + status);
	}

	public StatusPagamento getStatus() {
		return status;
	}

	public void estornar() {
		if (status.equals(StatusPagamento.PAGO)) {
			status = StatusPagamento.ESTORNADO;
		} else {
			throw new IllegalStateException("Para estornar o pagamento, o mesmo deve estar pago.");
		}
	}

	public void pagar(BigDecimal valor) {
		if (status.equals(StatusPagamento.PENDENTE)) {
			this.status = StatusPagamento.PAGO;
			this.valor = valor;
		} else {
			throw new IllegalStateException("Para efetuar o pagamento, o mesmo deve estar pendente.");
		}
	}

}
