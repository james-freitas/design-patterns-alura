package com.alura.design.capitulo2.chainofresponsability;

import com.alura.design.capitulo1.strategy.Orcamento;

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
