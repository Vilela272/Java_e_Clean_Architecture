package br.com.guilherme.vilela.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.guilherme.vilela.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.guilherme.vilela.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.guilherme.vilela.escola.dominio.aluno.Aluno;
import br.com.guilherme.vilela.escola.dominio.aluno.CPF;
import br.com.guilherme.vilela.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// MOCK -> Mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto(
				"Fulano", 
				"123.456.789-00", 
				"fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(
				new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}