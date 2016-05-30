package com.alura.designpatterns.modulo1fazer.capitulo4.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	public double valor;
	private final List<Item> itens;
	

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

}
