package br.ufrn.imd.domain;

public class Prova {
	private double notaParte1;
	private double notaParte2;
	
	//Construtores
	public Prova() {
		this.notaParte1 = 0.0;
		this.notaParte2 = 0.0;
	}

	public Prova(double notaParte1, double notaParte2) {
		if (notaParte1 + notaParte2 <= 10.0) {
			this.notaParte1 = notaParte1;
			this.notaParte2 = notaParte2;
			
		} else if (notaParte1 < 0 || notaParte2 < 0) {
			throw new IllegalArgumentException("Notas nao podem ser negativas");
			
		} else {
			throw new IllegalArgumentException("Soma das notas nao pode ultrapassar 10.0");
		}
	}
	
	//Getters e Setters
	public double getNotaParte1() {
		return notaParte1;
	}

	public boolean setNotaParte1(double notaParte1) {
		if (notaParte1 < 0.0) {
			return false;
			
		} else if (notaParte1 + notaParte2 <= 10.0) {
			this.notaParte1 = notaParte1;
			
			return true;
		} else {
			return false;
		}
	}

	public double getNotaParte2() {
		return notaParte2;
	}

	public boolean setNotaParte2(double notaParte2) {
		if (notaParte2 < 0.0) {
			return false;
			
		} else if (notaParte1 + notaParte2 <= 10.0) {
			this.notaParte2 = notaParte2;
			
			return true;
		} else {
			return false;
		}
	}
	
	//Soma das notas
	public double calcularNotaTotal() {
		return notaParte1 + notaParte2;
	}
	
	
}
