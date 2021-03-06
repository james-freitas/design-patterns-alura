package com.alura.designpatterns.modulo1fazer.capitulo5.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Orcamento {

	public double valor;
	private final List<Item> itens;
	
	private int estadoAtual;
	public static final int EM_APROVACAO = 1;
	public static final int APROVADO = 2;
	
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		if(estadoAtual == EM_APROVACAO) valor = valor - (valor * 0.05);
		else if(estadoAtual == APROVADO) valor = valor - (valor * 0.02);
		else throw new RuntimeException("Somente orcamento em aprova��o ou aprovados recebem desconto extra.");
	}


	
	
}
