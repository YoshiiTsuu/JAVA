package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		 * expressa em anos, meses e dias.
		 */
		int idadeT, diasT, anos, meses, diasR = 0;

		Scanner ler = new Scanner(System.in);
		System.out.print("Insira sua idade em dias: ");
		idadeT = ler.nextInt();
		anos = idadeT / 365;
		diasT = idadeT % 365;
		if (diasT > 30) {
			meses = diasT / 30;
			diasR = diasT % 30;
		} else
			meses = 0;
		System.out.print("\nSua idade em anos, meses e dias, respectivamente é: " + anos + " anos, " + meses
				+ " meses e " + diasR + " dias.");
		ler.close();
	}
}
