package com.alura.designpatterns.modulo2fazer.capitulo3.memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		
		Contrato c1 = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
		
		System.out.println(c1);
		c1.avanca();
		System.out.println(c1.getTipo());
		
		// implementar rollback ou ctrl z do contrato
		
	}
	
}
