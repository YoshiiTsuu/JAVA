package generation.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * 2- Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar
		 * ele por tr�s (imprimindo o novo valor) at� que ele seja maior do que 100.
		 * Ex.: se o usu�rio digita 5, deveremos observar na tela a seguinte sequ�ncia:
		 * 5 15 45 135.
		 */
		int a;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um valor e ele ser� multiplicado por 3 at� que ele se torne maior que 100");
		a = ler.nextInt();
		ler.close();
		while (a < 100) {
			a = a * 3;
			System.out.println(a);
		}
	}
}
