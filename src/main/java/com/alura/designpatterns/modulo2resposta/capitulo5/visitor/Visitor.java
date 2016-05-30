package com.alura.designpatterns.modulo2resposta.capitulo5.visitor;

import com.alura.designpatterns.modulo2resposta.capitulo4.interpreter.Numero;
import com.alura.designpatterns.modulo2resposta.capitulo4.interpreter.Soma;
import com.alura.designpatterns.modulo2resposta.capitulo4.interpreter.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

}