package com.alura.design.capitulo2.chainofresponsability;

import com.alura.design.capitulo1.strategy.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
	
}
