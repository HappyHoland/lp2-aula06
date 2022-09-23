package br.ufrn.imd.domain;

public class Aluno {
	private Prova prova1;
	private Prova prova2;
	
	//Constructors
	public Aluno() {}

	public Aluno(Prova prova1, Prova prova2) {
		this.prova1 = prova1;
		this.prova2 = prova2;
	}
	
	
	//Getters e Setters
	public Prova getProva1() {
		return prova1;
	}

	public void setProva1(Prova prova1) {
		this.prova1 = prova1;
	}

	public Prova getProva2() {
		return prova2;
	}

	public void setProva2(Prova prova2) {
		this.prova2 = prova2;
	}

	//Calcular media
	public double calcularMedia() {
		return (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2.0;
	}
}
