package com.alura.designpatterns.modulo1resposta.capitulo3.templatemethod;

import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Imposto;
import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
	

}
