package br.generation.exercicios1;

import java.util.Scanner;

public class ExercicioExtra4 {
	/*
	 * Faça um programa em que permita a entrada de um número qualquer e exiba se
	 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
	 * se for ímpar exiba o número elevado ao quadrado.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b = 0.0, c = 0.0;
		System.out.print("Insira um valor inteiro: ");
		a = ler.nextDouble();

		if (a % 2 == 0) {
			b = Math.pow(a, 1.0/2.0);
			System.out.println("Este valor é par e sua raíz quadrada é: " + b);
		} else {
			c = Math.pow(a, 2);
			System.out.println("Este valor é ímpar e sua potência é: " + c);
		}
		ler.close();
	}
}