package generation.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		 * apresente no final o total do somatório, a média e o total de valores lidos.
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver
		 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário
		 * fornecer um valor negativo.
		 */
		int soma = 0, valor, valor2;
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira um valor positivo ");
		valor = ler.nextInt();
		while (valor > 0) {
			System.out.println("Insira outro valor positivo ");
			valor2=ler.nextInt();
			ler.close();
			soma = valor + valor2;
		}
		System.out.println("A soma dos valores é: " + soma);
	}
}
