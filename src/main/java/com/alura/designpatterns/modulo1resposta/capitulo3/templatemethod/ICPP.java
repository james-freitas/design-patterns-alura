package com.alura.designpatterns.modulo1resposta.capitulo3.templatemethod;

import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	
	
}
