package com.alura.designpatterns.modulo1resposta.capitulo2.chainofresponsibility;

import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//  nao tem
	}

}
