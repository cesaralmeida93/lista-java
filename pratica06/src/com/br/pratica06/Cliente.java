package com.br.pratica06;

public class Cliente {
	private String nome;
	private int idade;
	private double peso;
	
	public Cliente(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}
	
	public String toString() {
		return this.nome + ";" + this.idade + ";" + this.peso;
	}


	

	
	
	
	
}
