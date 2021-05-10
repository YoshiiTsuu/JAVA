package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */
		double a = 0.0, b = 0.0, contador = -1.0; // b=números multiplos de 3, c= média
		double c = 0.0;

		Scanner ler = new Scanner(System.in);
		do {
			contador++;
			System.out.print("Insira um valor: ");
			a = ler.nextInt();
			if (a % 3 == 0) {
				b = b + a;
			}
			c = b / contador;

		} while (a != 0);
		System.out.println("A média dos valores múltiplos de 3 é: " + c);
		ler.close();
	}
}
