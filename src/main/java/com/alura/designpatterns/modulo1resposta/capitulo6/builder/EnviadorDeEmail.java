package com.alura.designpatterns.modulo1resposta.capitulo6.builder;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email");
	}
	
}
