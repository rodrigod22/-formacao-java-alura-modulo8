package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso java = new Curso("Dominando cole��es", "Paulo Silveira");
				
		//java.getAulas().add(new Aula("Trabalhando com ArrayList", 12));
		
		java.adiciona(new Aula("Trabalhando com ArrayList", 12));
		java.adiciona(new Aula("Criando uma aula", 20));
		java.adiciona(new Aula("Modelando cole��es", 16));
		
		System.out.println(java.getAulas());
		
	}

}
