package com.alura.designpatterns.modulo1fazer.capitulo2.chainofresponsibility;


public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento){
		
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.01;
		} 
		
		else if (orcamento.getValor() > 500.0){
			return orcamento.getValor() * 0.07;
		}
		
		return 0;
		
		
	}
	
}
