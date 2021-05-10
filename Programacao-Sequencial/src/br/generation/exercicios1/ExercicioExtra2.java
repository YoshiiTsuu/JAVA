package br.generation.exercicios1;

import java.util.Scanner;

public class ExercicioExtra2 {
	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira um valor inteiro: ");
		a = ler.nextInt();
		System.out.println("Insira um valor inteiro: ");
		b = ler.nextInt();
		System.out.println("Insira um valor inteiro: ");
		c = ler.nextInt();

		if (a >= b && b >= c) {
			System.out.println("A ordem crescente é: " + c + ", " + b + ", " + a + ".");
		} else if (b >= a && a >= c) {
			System.out.println("A ordem crescente é: " + c + ", " + a + ", " + b + ".");
		} else if (b >= a && b >= c) {
			System.out.println("A ordem crescente é: " + a + ", " + c + ", " + b + ".");
		} else if (c >= b && b >= a) {
			System.out.println("A ordem crescente é: " + a + ", " + b + ", " + c + ".");
		} else if (a >= c && c >= b) {
			System.out.println("A ordem crescente é: " + b + ", " + c + ", " + a + ".");
		} else if (c >= a && a >= b) {
			System.out.println("A ordem crescente é: " + b + ", " + a + ", " + c + ".");
		}
		ler.close();
	}
}
