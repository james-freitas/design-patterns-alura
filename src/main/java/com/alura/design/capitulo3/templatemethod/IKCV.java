package com.alura.design.capitulo3.templatemethod;

import com.alura.design.capitulo1.strategy.Orcamento;
import com.alura.design.capitulo2.chainofresponsability.Item;

public class IKCV extends TemplateDeImpostoCondicional{

	private boolean temItemMaiorQue1000ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue1000ReaisNo(orcamento);
	}

	
	
}
