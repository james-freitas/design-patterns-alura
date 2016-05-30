package com.alura.design.capitulo5.state;

import com.alura.design.capitulo1.strategy.Orcamento;

public class TesteDeDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
		reforma.aplicaDescontoExtra();
	}
	
}
