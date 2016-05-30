package com.alura.design.capitulo5.state;

import com.alura.design.capitulo1.strategy.Orcamento;

public interface EstadoDeUmOrcamento {
	
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	
	void finaliza(Orcamento orcamento);
}
