package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio3 {
	/*
	 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */
	public static void main(String[] args) {

		int segT, seg = 0, horas, minR, minT; // minR é a variável restos dos minutos

		Scanner ler = new Scanner(System.in);
		System.out.print("Insira o tempo de duração do evento em segundos: ");
		segT = ler.nextInt();
		horas = segT / 3600;
		minR = segT % 3600;
		minT = minR / 60;
		if (minR % 60 != 0) {
			seg = minR % 60;
		}
		System.out.println("O tempo de duração do evento em horas, minutos e segundos é: " + horas + " hora(s) " + minT
				+ " minuto(s) e " + seg + " segundo(s)");

		ler.close();
	}

}
