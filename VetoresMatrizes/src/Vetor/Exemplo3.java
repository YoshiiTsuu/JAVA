package Vetor;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		System.out.println("Insira as notas do aluno: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = ler.nextDouble();
		}
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			media = soma / 4;
		}
		System.out.println("A soma das notas do aluno é: " + soma);
		System.out.println("A média do aluno é: " + media);
		ler.close();
	}
}
