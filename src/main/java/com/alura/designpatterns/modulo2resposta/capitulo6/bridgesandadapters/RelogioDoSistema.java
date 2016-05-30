package com.alura.designpatterns.modulo2resposta.capitulo6.bridgesandadapters;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio{

	public Calendar hoje(){
		return Calendar.getInstance();
	}
	
}
