package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio3 {
	/*
	 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */
	public static void main(String[] args) {

		int segT, seg = 0, horas, minR, minT; // minR � a vari�vel restos dos minutos

		Scanner ler = new Scanner(System.in);
		System.out.print("Insira o tempo de dura��o do evento em segundos: ");
		segT = ler.nextInt();
		horas = segT / 3600;
		minR = segT % 3600;
		minT = minR / 60;
		if (minR % 60 != 0) {
			seg = minR % 60;
		}
		System.out.println("O tempo de dura��o do evento em horas, minutos e segundos �: " + horas + " hora(s) " + minT
				+ " minuto(s) e " + seg + " segundo(s)");

		ler.close();
	}

}
