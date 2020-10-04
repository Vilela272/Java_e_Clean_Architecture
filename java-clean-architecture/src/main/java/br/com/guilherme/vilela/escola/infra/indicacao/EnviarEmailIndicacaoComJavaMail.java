package br.com.guilherme.vilela.escola.infra.indicacao;

import br.com.guilherme.vilela.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.guilherme.vilela.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
