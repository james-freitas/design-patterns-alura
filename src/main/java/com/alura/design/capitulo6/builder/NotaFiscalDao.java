package com.alura.design.capitulo6.builder;

public class NotaFiscalDao implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco");
	}
	
}
