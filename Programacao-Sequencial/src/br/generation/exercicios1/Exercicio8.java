package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		/*
		 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo
		 * ao consumidor.
		 */
		Scanner ler = new Scanner(System.in);

		double custoFab, custoCons, custoDistr;
		System.out.print("Insira o valor do custo de f�brica: ");
		custoFab = ler.nextInt();
		custoDistr = (custoFab * 1.45);
		custoCons = (custoDistr * 1.28);

		System.out.println("O pre�o do carro � de: " + custoCons);
		ler.close();
	}

}
