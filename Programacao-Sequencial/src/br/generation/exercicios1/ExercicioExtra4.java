package br.generation.exercicios1;

import java.util.Scanner;

public class ExercicioExtra4 {
	/*
	 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
	 * este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
	 * se for �mpar exiba o n�mero elevado ao quadrado.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b = 0.0, c = 0.0;
		System.out.print("Insira um valor inteiro: ");
		a = ler.nextDouble();

		if (a % 2 == 0) {
			b = Math.pow(a, 1.0/2.0);
			System.out.println("Este valor � par e sua ra�z quadrada �: " + b);
		} else {
			c = Math.pow(a, 2);
			System.out.println("Este valor � �mpar e sua pot�ncia �: " + c);
		}
		ler.close();
	}
}