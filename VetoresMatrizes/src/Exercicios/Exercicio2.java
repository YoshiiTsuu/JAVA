package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: • Os números
		 * pares digitados; • A soma dos números pares digitados; • Os números ímpares
		 * digitados; • A quantidade de números ímpares digitados.
		 */

		int somaImp = 0, somaPar = 0;
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.printf("Insira um valor: ");
			vetor[i] = ler.nextInt();
		}
		System.out.println("\n\nOs valores pares: ");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				somaPar += vetor[i];
				System.out.print("|" + vetor[i] + "|");
			}
		}
		System.out.println("\nOs valores ímpares: ");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 1) {
				somaImp++;
				System.out.print("|" + vetor[i] + "|");
			}
		}
		System.out.println("\n\nForam colocados: " + somaImp + " ímpares");
		System.out.println("\nA soma dos números pares é: " + somaPar);
		ler.close();
	}
}