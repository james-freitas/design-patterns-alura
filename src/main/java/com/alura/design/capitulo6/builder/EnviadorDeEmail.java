package com.alura.design.capitulo6.builder;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email");
	}
	
}
