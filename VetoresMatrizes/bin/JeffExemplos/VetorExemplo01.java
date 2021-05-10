package com.vetores;

public class VetorExemplo01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10];
		//0..9	
		
		for(int i = 0; i <= 9; i++){
			System.out.println(i + " - " +  arrayVetor[i]);
		}
	}
}
==================================================
public class VetorExemplo02 {

	public static void main(String[] args) {
		
		double minhaNota;
		double[] notas = new double[2];
		
		notas[0] = 8.5;
		minhaNota = notas[0];

		System.out.println("A Variavel contém: " + minhaNota);
		System.out.println("\nO vetor na posição 0 contem: " + notas[0]);

	}

}
==================================================
public class VetorExemplo03 {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double[] temperaturas = new double[10];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for (int i=0; i<temperaturas.length; i++){
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
}
}
=================================================
import java.util.Scanner;

public class VetorExemplo04 {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;

				int i;

				System.out.println("Digite às quatro notas do Aluno: \n");
		for(i=0;i<=3;i++){
		notas[i] = entrada.nextDouble();
				}
		for(i=0;i<=3;i++){
		soma = soma + notas[i];
		media = soma / 4;
				}
				System.out.println("A soma das notas: " + soma);
				System.out.println("\nA média é: " + media);

	}

}
