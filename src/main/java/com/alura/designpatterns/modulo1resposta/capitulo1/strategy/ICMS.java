package com.alura.designpatterns.modulo1resposta.capitulo1.strategy;

public class ICMS extends Imposto {

	public ICMS() {
	}
	
	public ICMS(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}
	
}
