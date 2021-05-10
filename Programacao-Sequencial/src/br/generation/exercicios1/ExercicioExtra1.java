package br.generation.exercicios1;

import java.util.Scanner;

public class ExercicioExtra1 {
	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira um valor inteiro: ");
		a = ler.nextInt();
		System.out.println("Insira um valor inteiro: ");
		b = ler.nextInt();
		System.out.println("Insira um valor inteiro: ");
		c = ler.nextInt();
		if (a > b && a > c) {
			System.out.println("O maior valor inserido foi: " + a);
		} else if (b > a && b > c) {
			System.out.println("O maior valor inserido foi: " + b);
		} else if (c > a && c > b) {
			System.out.println("O mairo valor inserido foi: " + c);
		}
		ler.close();
	}
}
