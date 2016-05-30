package com.alura.designpatterns.modulo2resposta.capitulo8.facadeandsingleton;

public class EmpresaFacadeSingleton {

	private static EmpresaFacade instancia;
	
	public EmpresaFacade getInstancia() {
		if(instancia == null){
			instancia = new EmpresaFacade();
		}
		return instancia;
	}
	
}
