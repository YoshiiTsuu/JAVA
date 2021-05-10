package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio1 {
	/*
	 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias
	 * e mostre-a expressa apenas em dias.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int anos, meses, dias, diasT;

		System.out.print("Digite quantos anos você tem: ");
		anos = ler.nextInt();
		System.out.print("\nDigite quantos meses você tem: ");
		meses = ler.nextInt();
		System.out.print("\nDigite quantos dias você tem: ");
		dias = ler.nextInt();

		diasT = (anos * 365) + (meses * 30) + (dias);

		System.out.println("Você viveu um total de: " + diasT + " dias");
		ler.close();
	}
}