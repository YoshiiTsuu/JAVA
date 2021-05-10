package br.generation.LacoCondicional;

import java.util.Scanner;

public class LacoCondicional {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		// caso não nomeie como ler, você pode usar o seguinte código new Scanner(System.in)

		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		// nota1 = new Scanner(System.in).nextDouble();
	
		System.out.println("\nDigite a segunda nota: ");
		nota2 = ler.nextDouble();
		//nota2 = new Scanner(System.in).nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		//nota3 = new Scanner(System.in).nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		if (media>=6.0) {
			System.out.println("\nAprovado" + "\nSua média é: " + media);
		}
		else if (media>=3.0 && media <6.0) {
			System.out.println("Recuperação" + "\nMedia: " + media);
		} else {
			System.out.println("Você foi reprovado" + "\nMedia " + media);
		}
		
		
		
	}

}
