package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		Scanner ler = new Scanner(System.in);
		int idade = 0, idadeT = 0, idadeTT = 0; // idadeT: pessoas com -21 anos / idadeTT pessoas com mais de 50 anos;
		while (idade > -99) {
			System.out.println("Insira sua idade: ");
			idade = ler.nextInt();
			if (idade < 21) {
				idadeT++;
			} else if (idade > 50) {
				idadeTT++;
			}
		}
		System.out.println("O número de pessoas com menos de 21 anos é: " + idadeT);
		System.out.println("O número de pessoas com mais de 50 anos é: " + idadeTT);
		ler.close();
	}
}