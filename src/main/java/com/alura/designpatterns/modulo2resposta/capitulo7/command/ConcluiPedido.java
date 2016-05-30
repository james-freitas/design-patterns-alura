package com.alura.designpatterns.modulo2resposta.capitulo7.command;

public class ConcluiPedido implements Comando {

	public Pedido p;
	
	public ConcluiPedido(Pedido p){
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Concluindo pedido do: " + p.getCliente());
		p.finaliza();
		
	}

}
