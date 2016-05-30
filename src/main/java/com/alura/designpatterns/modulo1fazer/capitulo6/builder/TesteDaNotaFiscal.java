package com.alura.designpatterns.modulo1fazer.capitulo6.builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		List<ItemDaNota> items = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("item 2", 400.0));
		
		double valorTotal = items.stream()
			.mapToDouble(ItemDaNota::getValor)
			.sum();
		
		double impostos = valorTotal * 0.05;
		
		NotaFiscal nf = new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorTotal, impostos, items, "obs");
			
		System.out.println(nf.getValorBruto());
		
	}
	
}
