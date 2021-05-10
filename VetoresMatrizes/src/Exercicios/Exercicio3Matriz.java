package Exercicios;

import java.util.Scanner;

public class Exercicio3Matriz {
	public static void main(String[] args) {
		/*
		 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
		 * possui.
		 */
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int valor = 0, l = 0, c = 0;
		for (l = 0; l < matriz.length; l++) {
			for (c = 0; c < matriz[l].length; c++) {
				System.out.printf("Insira o valor: [%d] [%d]: ", l, c);
				matriz[l][c] = ler.nextInt();

				if (matriz[l][c] > 10) {
					valor++;
				}
			}
		}
		System.out.println("Foram colcados: " + valor + " valores maiores que 10.");

	}
}
