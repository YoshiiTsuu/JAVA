package generation.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Vari�vel for 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus
		 * habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura
		 * deseja saber:�� a) m�dia do sal�rio da popula��o; b) m�dia do n�mero de
		 * filhos; c)maior sal�rio; d) percentual de pessoas com sal�rio at� R$100,00.
		 */
		int salario, mS = 0, mF = 0, maiorS = 0, pS = 0, contador; // M�dia do sal�rio da pop; m�dia do n filhos; maior
																	// salario; percentual pessoas salario
		int salarioT = 0, nF, cont2 = 0;
		Scanner ler = new Scanner(System.in);
		for (contador = 1; contador <= 3; contador += 1) {
			System.out.print("\nInsira seu sal�rio: ");
			salario = ler.nextInt();
			System.out.print("Insira o n�mero de filhos: ");
			nF = ler.nextInt();
			mF = nF / 3;
			salarioT = salario + salarioT;
			mS = salarioT / 3;
			if (salario < 100)
				cont2 = +1;
			pS = (cont2 * 100) / 3;
			if (salario > maiorS) {
				maiorS = salario;
			}
			ler.close();
		}
		System.out.println("a) m�dia do sal�rio da popula��o " + mS);
		System.out.println("b) m�dia do n�mero de filhos " + mF);
		System.out.println("c) maior sal�rio " + maiorS);
		System.out.println("d) percentual de pessoas com sal�rio at� R$100,00" + pS);
	}
}
