package com.alura.designpatterns.modulo1resposta.capitulo6.builder;

public class NotaFiscalDao implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco");
	}
	
}
