package br.ufrn.imd.main;

import br.ufrn.imd.domain.Aluno;
import br.ufrn.imd.domain.Prova;
import br.ufrn.imd.domain.Turma;

public class Main {

	public static void main(String[] args) {
		Turma turma = new Turma();
		int cont = 1;
		Aluno aluno1 = new Aluno(new Prova(4.0, 2.5), new Prova(4.7, 3.3));
		Aluno aluno2 = new Aluno(new Prova(5.0, 4.5), new Prova(2.2, 0.8));
		Aluno aluno3 = new Aluno(new Prova(3.8, 3.7), new Prova(4.4, 4.6));
		
		turma.getAlunos().add(aluno1);
		turma.getAlunos().add(aluno2);
		turma.getAlunos().add(aluno3);
		
		for (Aluno a : turma.getAlunos()) {
			System.out.println("Aluno " + cont + " - media: " + String.format("%.2f", a.calcularMedia()));
			cont++;
		}
		
		System.out.println("Media da Turma: " + String.format("%.2f", turma.calcularMedia()));
	}

}
