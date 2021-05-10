package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		Scanner ler = new Scanner(System.in);
		int contador, a, par = 0, impar = 0;

		for (contador = 0; contador < 10; contador++) {
			System.out.println("Insira um número ");
			a = ler.nextInt();
			if (a % 2 == 0) {
				par++;
			} else {
				impar++;

			}
		}
		System.out.println("Tem " + par + " valores pares.");
		System.out.println("Tem " + impar + " valores ímpares.");
		ler.close();
	}
}
