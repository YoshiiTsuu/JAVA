package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: � Os n�meros
		 * pares digitados; � A soma dos n�meros pares digitados; � Os n�meros �mpares
		 * digitados; � A quantidade de n�meros �mpares digitados.
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
		System.out.println("\nOs valores �mpares: ");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 1) {
				somaImp++;
				System.out.print("|" + vetor[i] + "|");
			}
		}
		System.out.println("\n\nForam colocados: " + somaImp + " �mpares");
		System.out.println("\nA soma dos n�meros pares �: " + somaPar);
		ler.close();
	}
}