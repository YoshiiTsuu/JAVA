package br.generation.LacoCondicional;

import java.util.Scanner;

public class CalculadoraBasica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double numero1, numero2, resultado = 0.0;
		char operacao;

		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextDouble();
		System.out.println("Digite a operação: ");
		operacao = ler.next().charAt(0);

		if (operacao == '+') {
			resultado = numero1 + numero2;

		} else if (operacao == '-') {
			resultado = numero1 + numero2;
		} else if (operacao == '*') {
			resultado = numero1 * numero2;
		} else if (operacao == '/') {
			resultado = numero1 / numero2;
		} else {
			System.out.println("Você digitou um valor sem sentido, seu bobo.");
		}
		System.out.println("OI sua conta deu: " + resultado);
	}
}
