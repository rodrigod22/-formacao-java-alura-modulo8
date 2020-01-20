package br.com.alura;

import java.util.List;
import java.util.Set;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso java = new Curso("Dominando coleções", "Paulo Silveira");

		// java.getAulas().add(new Aula("Trabalhando com ArrayList", 12));

		java.adiciona(new Aula("Trabalhando com ArrayList", 12));
		java.adiciona(new Aula("Criando uma aula", 20));
		java.adiciona(new Aula("Modelando coleções", 16));

		Aluno a1 = new Aluno("Rodrigo", 1);
		Aluno a2 = new Aluno("Juan", 2);
		Aluno a3 = new Aluno("Michele", 3);

		java.matricula(a1);
		java.matricula(a2);
		java.matricula(a3);

		java.getAlunos().forEach((aluno) -> System.out.println(aluno));

	}

}
