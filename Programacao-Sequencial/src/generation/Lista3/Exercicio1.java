package generation.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Variável for 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus
		 * habitantes, coletando dados sobre o salário e número de filhos. A prefeitura
		 * deseja saber:   a) média do salário da população; b) média do número de
		 * filhos; c)maior salário; d) percentual de pessoas com salário até R$100,00.
		 */
		int salario, mS = 0, mF = 0, maiorS = 0, pS = 0, contador; // Média do salário da pop; média do n filhos; maior
																	// salario; percentual pessoas salario
		int salarioT = 0, nF, cont2 = 0;
		Scanner ler = new Scanner(System.in);
		for (contador = 1; contador <= 3; contador += 1) {
			System.out.print("\nInsira seu salário: ");
			salario = ler.nextInt();
			System.out.print("Insira o número de filhos: ");
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
		System.out.println("a) média do salário da população " + mS);
		System.out.println("b) média do número de filhos " + mF);
		System.out.println("c) maior salário " + maiorS);
		System.out.println("d) percentual de pessoas com salário até R$100,00" + pS);
	}
}
