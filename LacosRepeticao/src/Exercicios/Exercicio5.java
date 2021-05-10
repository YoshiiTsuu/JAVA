package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		Scanner ler = new Scanner(System.in);
		int a, b = 0;

		do {
			System.out.println("Insira um valor: ");
			a = ler.nextInt();
			b = b + a;
		} while (a != 0);
		System.out.println("A soma dos valores inseridos é: " + b);
		ler.close();
	}
}
