package com.alura.designpatterns.modulo1fazer.capitulo3.templatemethod;


public class ICPP implements Imposto{

	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.05;
		}
	}
}
