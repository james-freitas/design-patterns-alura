package com.alura.designpatterns.modulo2fazer.capitulo8.facadeandesingleton;


public class ClienteDao {

	public Cliente buscaPorCpf(String cpf) {

		return new Cliente();
	}

}
