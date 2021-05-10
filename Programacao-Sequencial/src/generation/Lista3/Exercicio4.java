package generation.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * 2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar
		 * ele por três (imprimindo o novo valor) até que ele seja maior do que 100.
		 * Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência:
		 * 5 15 45 135.
		 */
		int a;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um valor e ele será multiplicado por 3 até que ele se torne maior que 100");
		a = ler.nextInt();
		ler.close();
		while (a < 100) {
			a = a * 3;
			System.out.println(a);
		}
	}
}
