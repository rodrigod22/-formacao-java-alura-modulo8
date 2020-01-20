package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaAluno = new HashMap<>();
	

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// retorna uma copia da lista nao podendo modificar a original
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "Curso: " + this.nome + "tempo: " + this.getTempoTotal();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {		
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int matricula) {
		//busca o aluno pelo indice no map
		return matriculaAluno.get(matricula);
		
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == matricula) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula " + matricula + " não encontrada");
	}

}
