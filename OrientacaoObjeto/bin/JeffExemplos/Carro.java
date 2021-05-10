package br.com.classes;

public class Carro {
	
	//Atributos
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//métodos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}

}
