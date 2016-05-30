package com.alura.designpatterns.modulo1resposta.capitulo2.chainofresponsibility;

import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
	
}
