package com.alura.designpatterns.modulo2resposta.capitulo4.interpreter;

import com.alura.designpatterns.modulo2resposta.capitulo5.visitor.Visitor;

public interface Expressao {

	int avalia();
	
	void aceita(Visitor impressora);
}
