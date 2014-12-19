package com.algaworks.webinario.model;

import java.math.BigDecimal;

public class Ticket extends Pagamento {

	private String numero;
	private StatusTicket statusTicket;

	public Ticket(String numero) {
		this.numero = numero;
		this.statusTicket = StatusTicket.PENDENTE;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public StatusTicket getStatusTicket() {
		return statusTicket;
	}

	public void imprimirRecibo() {
		System.out.println("##### Ticket número: " + numero + " Status: " + statusTicket);
		
		super.imprimirRecibo();
	}

	public void emitirTicket(BigDecimal valor) {
		super.pagar(valor);
		this.statusTicket = StatusTicket.EMITIDO;
	}

	public void cancelar() {
		super.estornar();
		this.statusTicket = StatusTicket.CANCELADO;
	}

}
