package com.alura.designpatterns.modulo1fazer.capitulo4.decorator;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}



}
