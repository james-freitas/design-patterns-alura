package com.alura.designpatterns.modulo2resposta.capitulo4.interpreter;

import com.alura.designpatterns.modulo2resposta.capitulo5.visitor.Visitor;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return valorDaEsquerda + valorDaDireita;
	}
	
	public Expressao getEsquerda(){
		return esquerda;
	}
	
	public Expressao getDireita(){
		return direita;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
		
	}
	
	
	
}
