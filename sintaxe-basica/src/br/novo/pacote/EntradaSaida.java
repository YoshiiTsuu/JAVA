package br.novo.pacote;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Aqui voc� est� renomeando o scanner, e ele agora passa a se chamar "ler"
		// Voc� evita ter que escrever "scanner(system.in);"
		
		Scanner ler = new Scanner(System.in);
		
		
		double a, b, soma;
		System.out.print("Digite o valor de a ");
		a=ler.nextInt();
		
		System.out.print("Digite o valor de b ");
		b=ler.nextInt();
		
		soma=a+b;
		System.out.println("A sua soma �: "+ soma);
		
		ler.close();
	}
}
