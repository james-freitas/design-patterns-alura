package com.alura.designpatterns.modulo2fazer.capitulo5.visitor;

public class Subtracao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return valorDaEsquerda - valorDaDireita;
	}
	
	public Expressao getEsquerda(){
		return esquerda;
	}

	public Expressao getDireita(){
		return direita;
	}


}
