package br.ufrn.imd.domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private List <Aluno> alunos;
	
	//Constructors
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}

	public Turma(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	//Getters e Setters
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	//Calcula media da turma 
		public double calcularMedia() {
			double sum = 0.0;
			
			for (Aluno a : alunos) {
				sum += a.calcularMedia();
			}
			
			return sum/((double) alunos.size());
		}

}
