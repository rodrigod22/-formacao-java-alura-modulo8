package br.com.alura;

public class TesteBuscaAlunos {

	public static void main(String[] args) {
		
		Curso java = new Curso("Dominando coleções", "Paulo Silveira");	

		java.adiciona(new Aula("Trabalhando com ArrayList", 12));
		java.adiciona(new Aula("Criando uma aula", 20));
		java.adiciona(new Aula("Modelando coleções", 16));

		Aluno a1 = new Aluno("Rodrigo", 1);
		Aluno a2 = new Aluno("Juan", 2);
		Aluno a3 = new Aluno("Michele", 3);
		Aluno a4 = new Aluno("Felipe", 4);

		java.matricula(a1);
		java.matricula(a2);
		java.matricula(a3);
		
		System.out.println("QUem e o aluno com a matricula 1");
		Aluno aluno = java.buscaMatriculado(61);
		System.out.println("Aluno: " + aluno.getNome());
	}

	

}
