package com.alura.designpatterns.modulo1resposta.capitulo4.decorator;

import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.ICMS;
import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.ISS;
import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Imposto;
import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Orcamento;
import com.alura.designpatterns.modulo1resposta.capitulo3.templatemethod.ICPP;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}
	
}
