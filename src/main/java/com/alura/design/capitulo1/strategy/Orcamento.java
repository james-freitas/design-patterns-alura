package com.alura.design.capitulo1.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alura.design.capitulo2.chainofresponsability.Item;
import com.alura.design.capitulo5.state.EmAprovacao;
import com.alura.design.capitulo5.state.EstadoDeUmOrcamento;

public class Orcamento {

	public double valor;
	private final List<Item> itens;
	
	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
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
		estadoAtual.aplicaDescontoExtra(this);
	}

	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
	
	
}
