package com.algaworks.webinario.model;

import java.math.BigDecimal;

public class Ticket {

	private String numero;
	private StatusTicket status;
	private Pagamento pagamento = new Pagamento();
	
	public Ticket(String numero) {
		this.numero = numero;
		this.status = StatusTicket.PENDENTE;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void imprimirRecibo() {
		System.out.println("##### Ticket número: " + numero + " Status: " + status);
		this.pagamento.imprimirRecibo();
	}

	public void emitirTicket(BigDecimal valor) {
		this.pagamento.pagar(valor);;
		this.status = StatusTicket.EMITIDO;
	}

	public void cancelar() {
		this.pagamento.estornar();
		this.status = StatusTicket.CANCELADO;
	}

}
