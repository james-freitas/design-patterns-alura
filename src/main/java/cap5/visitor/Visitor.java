package cap5.visitor;

import cap4.interpreter.Numero;
import cap4.interpreter.Soma;
import cap4.interpreter.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

}