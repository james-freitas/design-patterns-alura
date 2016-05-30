package com.alura.designpatterns.modulo2resposta.capitulo4.interpreter;

import com.alura.designpatterns.modulo2resposta.capitulo5.visitor.ImpressoraVisitor;
import com.alura.designpatterns.modulo2resposta.capitulo5.visitor.Visitor;

public class Programa {

	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));		
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora);
	}
}
