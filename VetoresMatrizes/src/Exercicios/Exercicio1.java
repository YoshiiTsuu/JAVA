package Exercicios;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
		 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
		 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
		 * vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e
		 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posi��o 4,
		 * atribuindo a esta posi��o o valor 100. (d) Mostre na tela cada valor do vetor
		 * A, um em cada linha.
		 */
		int soma;
		int[] vetor = new int[6];// (a)
		vetor[0] = 1;
		vetor[1] = 0;
		vetor[2] = 5;
		vetor[3] = -2;
		vetor[4] = -5;
		vetor[5] = 7;
		// (b)
		soma = (vetor[0] + vetor[1] + vetor[5]);
		System.out.println("A soma dos vetores �: " + soma);
		// (c)
		vetor[4] = 100;
		// (d)
		System.out.print("Os vetores s�o:");
		for (int i = 0; i < 6; i++) {
			System.out.print("|" + vetor[i] + "|");

		}
	}
}