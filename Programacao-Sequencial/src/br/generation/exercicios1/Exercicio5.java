package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio5 {
	/*
	 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final
	 * deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3
	 * e 5, respectivamente.
	 * 
	 */
	public static void main(String[] args) {

		double n1, n2, n3, media;
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira a nota do primeiro trimestre: ");
		n1 = ler.nextDouble();
		System.out.print("\nInsira a nota do segunto trimestre: ");
		n2 = ler.nextDouble();
		System.out.print("\nInsira a nota do tereceiro trimestre: ");
		n3 = ler.nextDouble();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
		System.out.println("Sua m�dia �: " + media);
		ler.close();
	}
}
