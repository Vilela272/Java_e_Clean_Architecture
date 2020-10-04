package br.com.guilherme.vilela.escola.aplicacao.indicacao;

import br.com.guilherme.vilela.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
