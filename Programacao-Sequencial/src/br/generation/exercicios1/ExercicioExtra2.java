package br.generation.exercicios1;

import java.util.Scanner;

public class ExercicioExtra2 {
	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira um valor inteiro: ");
		a = ler.nextInt();
		System.out.println("Insira um valor inteiro: ");
		b = ler.nextInt();
		System.out.println("Insira um valor inteiro: ");
		c = ler.nextInt();

		if (a >= b && b >= c) {
			System.out.println("A ordem crescente �: " + c + ", " + b + ", " + a + ".");
		} else if (b >= a && a >= c) {
			System.out.println("A ordem crescente �: " + c + ", " + a + ", " + b + ".");
		} else if (b >= a && b >= c) {
			System.out.println("A ordem crescente �: " + a + ", " + c + ", " + b + ".");
		} else if (c >= b && b >= a) {
			System.out.println("A ordem crescente �: " + a + ", " + b + ", " + c + ".");
		} else if (a >= c && c >= b) {
			System.out.println("A ordem crescente �: " + b + ", " + c + ", " + a + ".");
		} else if (c >= a && a >= b) {
			System.out.println("A ordem crescente �: " + b + ", " + a + ", " + c + ".");
		}
		ler.close();
	}
}
