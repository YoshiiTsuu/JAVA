package testSwitchCase;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// Faça - Faça uma calculadora com as quatro operações. Utilize Caso...selecione
		Scanner ler = new Scanner(System.in);
		double a, b, c = 0; // a=primeiro valor, b = segundo valor, c=resultado, d= operador
		int d;

		System.out.println("====Calculadora Simples====");

		System.out.println("\n\nPara somar digite (1)");
		System.out.println("Para subtrair digite(2)");
		System.out.println("Para multiplicar digite (3)");
		System.out.println("Para dividir digte (4)");
		System.out.print("Insira uma das opções acima para prosseguir: ");
		d = ler.nextInt();
		System.out.println("Insira o primeiro valor: ");
		a = ler.nextDouble();
		System.out.println("Insira o segundo valor: ");
		b = ler.nextDouble();

		switch (d) {
		case '1':
			c = a + b;
			System.out.println("A soma dos valores é: " + c);
			break;
		case '2':
			c = a - b;
			System.out.println("A subtração dos valores é: " + c);
			break;
		case '3':
			c = a * b;
			System.out.println("A multiplicação dos valores é: " + c);

			break;
		case '4':
			c = a / b;
			System.out.println("A divisão dos valores é: " + c);
			break;

		}
		ler.close();

	}
}
