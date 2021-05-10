package Exercicios;

import java.util.Scanner;

public class ExercicioMatriz4 {
	public static void main(String[] args) {

		/*
		 * (1) somar as duas matrizes (2) subtrair a primeira matriz da segunda (3)
		 * adicionar uma constante as duas matrizes (4) imprimir as matrizes
		 */
		Scanner ler = new Scanner(System.in);
		int a;
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		double constante, mfinal = 0, m2final;
		System.out.println("Insira alguma das opções abaixo: ");
		System.out.println("Para somar duas matrizes, digite 1" + "\nPara subtrair duas matrizes digte (2)."
				+ "\nPara adicionar uma constante as duas matrizes digite (3)" + "\nPara imprimir as matrizes digte (4)");
		a = ler.nextInt();

		for (int l = 0; l < matriz1.length; l++) {
			for (int c = 0; c < matriz1[l].length; c++) {
				System.out.printf("Insira os valores da primeira matriz: [%d] [%d]: ", l, c);
				matriz1[l][c] = ler.nextDouble();
			}

		}
		for (int l = 0; l < matriz2.length; l++) {
			for (int c = 0; c < matriz2[l].length; c++) {
				System.out.printf("Insira os valores da segunda matriz: [%d] [%d]: ", l, c);
				matriz2[l][c] = ler.nextInt();
			}
		}
		switch (a) {
		case 1:
			System.out.println("A soma das matrizes é: ");// A soma das matrizes
			for (int l = 0; l < matriz3.length; l++) {
				for (int c = 0; c < matriz3[l].length; c++) {
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.print("|" + matriz3[l][c] + "|");
					if (c > l)
						System.out.println("");

				}
			}
			break;
		case 2:
			System.out.println("\n=====================\nA subtração da matriz 1 pela matriz 2 é: "); // Subtração das
																										// matrizes
			for (int l = 0; l < matriz3.length; l++) {
				for (int c = 0; c < matriz3[l].length; c++) {
					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.print("|" + matriz3[l][c] + "|");
					if (c > l)
						System.out.println("");
				}
			}
			break;
		case 3:
			System.out.println("\n=====================\nInsira uma constante para as matrizes 1 e 2: ");
			constante = ler.nextDouble();
			System.out.println("Matriz 1+ constante: \n");
			for (int l = 0; l < matriz1.length; l++) {
				for (int c = 0; c < matriz1[l].length; c++) {
					mfinal = (matriz1[l][c]) + constante;
					System.out.print(" | " + mfinal + " | ");
					if (c > l)
						System.out.println("");
				}
			}
			System.out.println("\n\nMatriz 2 + constante: \n");
			for (int l = 0; l < matriz2.length; l++) {
				for (int c = 0; c < matriz2[l].length; c++) {
					m2final = (matriz2[l][c]) + constante;
					System.out.print(" | " + m2final + " | ");
					if (c > l)
						System.out.println("");
				}
			}
			break;
		case 4:
			for (int l = 0; l < matriz1.length; l++) {
				for (int c = 0; c < matriz1[l].length; c++) {
					System.out.print(matriz1[l][c]);
					if (c > l) {
						System.out.println("");
					}
				}
			}
			for (int l = 0; l < matriz2.length; l++) {
				for (int c = 0; c < matriz2[l].length; c++) {
					System.out.print("|" + matriz2 + "|");
					if (c > l) {
						System.out.println("");
						break;
					}
				}
			}
		}
		ler.close();
	}
}
