package com.alura.designpatterns.modulo1fazer.capitulo3.templatemethod;


public class IKCV {

	public double calcula (Orcamento orcamento) {
		if(orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento)){
			return orcamento.getValor() * 0.10;
		} else {
			return orcamento.getValor() * 0.06;
		}
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100) return true;
		}
		return false;
	}
	
}
