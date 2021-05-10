package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Construa um programa em c que, tendo como dados de entrada dois pontos
		 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A
		 * fórmula d=//(x2-x1)²+(y2-y1)²
		 */

		double x1, x2, y1, y2, d = 0.0, a, b;

		Scanner ler = new Scanner(System.in);

		System.out.print("Insira o valor do primeiro ponto do eixo x: ");
		x1 = ler.nextDouble();

		System.out.print("\nInsira o valor do segundo ponto do eixo x: ");
		x2 = ler.nextDouble();

		System.out.print("\nInsira o valor do primeiro ponto do eixo y: ");
		y1 = ler.nextDouble();

		System.out.print("\nInsira o valor do segundo ponto do eixo y: ");
		y2 = ler.nextDouble();

		a = Math.pow((x2 - x1), 2);
		b = Math.pow((y2 - y1), 2);
		d = Math.pow((a + b), 1.0 / 2.0);
		System.out.println("O valor de d é: " + d);
		ler.close();
	}
}
