package com.alura.designpatterns.modulo2fazer.capitulo8.facadeandesingleton;


import com.alura.designpatterns.modulo2resposta.capitulo8.facadeandsingleton.Tipo;

public class Programa {

    // Criar uma fachada unica para um sistema


	public static void main(String[] args) {
		
		String cpf = "0";
		Cliente cliente = new ClienteDao().buscaPorCpf(cpf);

        Fatura fatura = new Fatura(cliente, 5000.0);

        Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
        cobranca.emite();

        ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();
		
	}
	
}
