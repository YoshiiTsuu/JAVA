package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		Scanner ler = new Scanner(System.in);
		int a, b = 0;

		do {
			System.out.println("Insira um valor: ");
			a = ler.nextInt();
			b = b + a;
		} while (a != 0);
		System.out.println("A soma dos valores inseridos �: " + b);
		ler.close();
	}
}
