package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
	
		Curso java = new Curso("Dominando coleções", "Paulo Silveira");
		
		//java.getAulas().add(new Aula("Trabalhando com ArrayList", 12));
		
		java.adiciona(new Aula("Trabalhando com ArrayList", 12));
		java.adiciona(new Aula("Criando uma aula", 20));
		java.adiciona(new Aula("Modelando coleções", 16));
		
		List<Aula> aulasImutaveis = java.getAulas();
		
		//nao funciona pq a colecao devolvida e imutavel
		//Collections.sort(aulasImutaveis);
		
		System.out.println(aulasImutaveis);
		
			
		// cria uma nova lista recebendo o array original imutavel
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
			
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		System.out.println(java.getTempoTotal());
		
		System.out.println(java);
		
	}

}
