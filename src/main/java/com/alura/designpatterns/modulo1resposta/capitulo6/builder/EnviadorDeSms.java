package com.alura.designpatterns.modulo1resposta.capitulo6.builder;

public class EnviadorDeSms implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("Envie por sms");
		
	}
	
}
