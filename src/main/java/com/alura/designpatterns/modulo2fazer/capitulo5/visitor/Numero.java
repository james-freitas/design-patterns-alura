package com.alura.designpatterns.modulo2fazer.capitulo5.visitor;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero){
		this.numero = numero;
	}

	@Override
	public int avalia() {		
		return this.numero;
	}


}
