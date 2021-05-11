package Exercicio;

import java.util.Scanner;

public class TestaAnimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		dog.setSom("Auu AuAu Au");
		horse.setSom("Hiin in in");
		sloth.setSom("Iiwwnn");
		int a;

		System.out.println("Para ser atendido digite uma das opções abaixo: ");
		System.out.println("Digite (1) para cachorro.\nDigite (2) para cavalo.\nDigite (3) para preguiça.");
		a = input.nextInt();
		switch (a) {
		case 1:
			System.out.print("Insira o nome do seu cachorro: ");
			dog.setNome(input.next());
			System.out.print("Insira a idade do seu cachorro: ");
			dog.setIdade(input.nextInt());
			System.out.println("Seu cachorro corre? Se sim digite (true), caso contrário (false)");
			dog.setCorrer(input.nextBoolean());
			System.out.println("\nSom do cachorro:" + dog.getSom() + "\nNome cachorro: " + dog.getNome() + "\nIdade: "
					+ dog.getIdade() + " anos\n" + "Cachorro corre?\n" + dog.isCorrer());
			break;

		case 2:
			System.out.print("Insira o nome do seu cavalo: ");
			horse.setNome(input.next());
			System.out.print("Insira a idade do seu cavalo: ");
			horse.setIdade(input.nextInt());
			System.out.println("Seu cavalo corre? Se sim digite (true), caso contrário (false)");
			horse.setCorrer(input.nextBoolean());
			System.out.println("\nSom do cavalo:" + horse.getSom() + "\nNome do cavalo: " + horse.getNome()
					+ "\nIdade: " + horse.getIdade() + " anos\n" + "Cavalo corre? \n" + horse.isCorrer());
			break;
		case 3:
			System.out.print("Insira o nome da sua preguiça: ");
			sloth.setNome(input.next());
			System.out.print("Insira a idade da sua preguiça: ");
			sloth.setIdade(input.nextInt());
			System.out.println("Sua preguiça sobe em árvores? Se sim digite (true), caso contrário (false)");
			sloth.setArvore(input.nextBoolean());
			System.out.println("\nSom da preguiça: " + sloth.getSom() + "\nNome da preguiça: " + sloth.getNome()
					+ "\nIdade: " + sloth.getIdade() + " anos\n" + "Sobe em árvores?\n " + sloth.isArvore());
			break;
		}
		input.close();
	}
}
