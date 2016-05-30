package com.alura.designpatterns.modulo2resposta.capitulo3.memento;

public class Estado {

	private Contrato contrato;
	
	public Estado(Contrato contrato){
		this.contrato = contrato;
	}
	
	public Contrato getEstado(){
		return contrato;
	}
	
}
