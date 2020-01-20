package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Sergio");
		alunos.add("Mauricio");
		alunos.add("Paulo");
		alunos.add("Mauricio");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach((aluno)->System.out.println(aluno));
		
		boolean buscaRodrigo = alunos.contains("rodrigo");
		System.out.println(buscaRodrigo);
	}

}
