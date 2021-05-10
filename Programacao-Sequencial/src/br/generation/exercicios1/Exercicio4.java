package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		 * calcule a seguinte expressão: D=(R+S)/2 R = (A+B)² S=(B+C)²
		 */

		double a, b, c, d, s = 0, r = 0;

		Scanner ler = new Scanner(System.in);

		System.out.print("Insira o valor de A: ");
		a = ler.nextInt();
		System.out.print("\nInsira o valor de B: ");
		b = ler.nextInt();
		System.out.print("\nInsira o valor de C: ");
		c = ler.nextInt();
		/*
		 * Potenciação: x elevado a y --> Math.pow (x, y) Radiciação: raiz n-ésima de x
		 * --> Math.pow (x, 1.0 / n) Casos particulares: raiz quadrada --> Math.sqrt,
		 * raiz cúbica --> Math.cbrt
		 */
		r = Math.pow((a + b), 2.0);
		s = Math.pow((b + c), 2.0);
		d = (r + s) / 2;
		System.out.println("O valor de D é igual a: " + d);
		ler.close();
	}
}
