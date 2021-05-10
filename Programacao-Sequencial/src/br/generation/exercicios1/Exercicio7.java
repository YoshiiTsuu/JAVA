package br.generation.exercicios1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		/*
		 * Um sistema de equações lineares do tipo: 
		 * ax+by=c dx+ey=f
		 *  pode ser resolvido segundo mostrado abaixo:
		 * x = (ce-bf)/(ae-bd) y=(af-cd)/(ae-bd) 
		 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		 */
		int a, b, c, d, e, f, x = 0, y = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira o valor de a: ");
		a = ler.nextInt();
		System.out.print("\nInsira o valor de b: ");
		b = ler.nextInt();
		System.out.print("\nInsira o valor de c: ");
		c = ler.nextInt();
		System.out.print("\nInsira o valor de d: ");
		d = ler.nextInt();
		System.out.print("\nInsira o valor de e: ");
		e = ler.nextInt();
		System.out.print("\nInsira o valor de f: ");
		f = ler.nextInt();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("Os valores de x e y, respectivamente são: " + x + ", " + y + ".");
		ler.close();
	}
}
