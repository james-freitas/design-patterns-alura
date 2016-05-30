package com.alura.designpatterns.modulo1resposta.capitulo7.observer;

public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();


		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123")
				.comItem(new ItemDaNota("nome", 100))
				.comObservacoes("obs").naDataAtual().constroi();

		System.out.println(nf.getValorBruto());
	}

}
