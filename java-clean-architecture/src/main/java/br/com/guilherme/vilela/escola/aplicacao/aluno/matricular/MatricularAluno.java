package br.com.guilherme.vilela.escola.aplicacao.aluno.matricular;

import br.com.guilherme.vilela.escola.dominio.aluno.Aluno;
import br.com.guilherme.vilela.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}

}
