package com.algaworks.webinario;

import java.math.BigDecimal;

import com.algaworks.webinario.model.Ticket;

public class ImpressoraRecibo {

	public static void main(String[] args) {
		Ticket ticket = new Ticket("1234");
		emitirTicket(ticket);
		//emitirTicketECancelar(ticket);
		
		/*ticket.pagar(new BigDecimal("50"));
		ticket.imprimirRecibo();*/
	}
	
	public static void emitirTicket(Ticket ticket) {
		ticket.emitirTicket(new BigDecimal("100.0"));
		
		ticket.imprimirRecibo();
	}
	
	public static void emitirTicketECancelar(Ticket ticket) {
		ticket.emitirTicket(new BigDecimal("100.0"));
		
		ticket.cancelar();
		
		ticket.imprimirRecibo();
	}
	
	
}
