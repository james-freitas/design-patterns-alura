package com.alura.designpatterns.modulo1resposta.capitulo5.state;

import com.alura.designpatterns.modulo1resposta.capitulo1.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento){
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos aprovados n�o podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
	
}
