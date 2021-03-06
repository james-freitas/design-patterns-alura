package com.alura.designpatterns.modulo2resposta.capitulo4.interpreter;

import com.alura.designpatterns.modulo2resposta.capitulo5.visitor.Visitor;

public class Numero implements Expressao{

	private int numero;

	public Numero(int numero){
		this.numero = numero;
	}

	@Override
	public int avalia() {		
		return this.numero;
	}

	public int getNumero() {
		return this.numero;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaNumero(this);
		
	}
	
	
	
}
