package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		 * calcule a seguinte express�o: D=(R+S)/2 R = (A+B)� S=(B+C)�
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
		 * Potencia��o: x elevado a y --> Math.pow (x, y) Radicia��o: raiz n-�sima de x
		 * --> Math.pow (x, 1.0 / n) Casos particulares: raiz quadrada --> Math.sqrt,
		 * raiz c�bica --> Math.cbrt
		 */
		r = Math.pow((a + b), 2.0);
		s = Math.pow((b + c), 2.0);
		d = (r + s) / 2;
		System.out.println("O valor de D � igual a: " + d);
		ler.close();
	}
}
