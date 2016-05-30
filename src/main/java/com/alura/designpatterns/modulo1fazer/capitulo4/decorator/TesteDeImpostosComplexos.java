package com.alura.designpatterns.modulo1fazer.capitulo4.decorator;


public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		
		// Imposto iss = new ISS(new ICMS()); 
		//Imposto iss = new ISS() + new ICMS();
		//Imposto issComIcms = new ISSComICMS();
		//Imposto issComIcmsComIcpp = new ISSComICMSComICPP();
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}
	
}
