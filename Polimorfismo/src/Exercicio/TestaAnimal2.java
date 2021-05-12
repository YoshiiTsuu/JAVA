package Exercicio;

import java.util.Scanner;

public class TestaAnimal2 {
	public static void main(String[] args) {
		CachorroSom dog = new CachorroSom();
		CavaloSom horse = new CavaloSom();
		PreguicaSom sloth = new PreguicaSom();
		Scanner input = new Scanner(System.in);
		int a;

		/**/
		System.out.println("Para ser atendido digite uma das op��es abaixo: ");
		System.out.println("Digite (1) para cachorro.\nDigite (2) para cavalo.\nDigite (3) para pregui�a.");
		a = input.nextInt();
		switch (a) {
		case 1:
			System.out.print("Insira o nome do seu cachorro: ");
			dog.setNome(input.next());
			System.out.print("Insira a idade do seu cachorro: ");
			dog.setIdade(input.nextInt());
			System.out.println("Seu cachorro corre? Se sim digite (true), caso contr�rio (false)");
			dog.setCorrer(input.nextBoolean());
			dog.animalSom();
			System.out.println("Nome do cachorro: " + dog.getNome() + "\nIdade: " + dog.getIdade() + " anos\n"
					+ "Cachorro corre?\n" + dog.isCorrer());
			break;

		case 2:
			System.out.print("Insira o nome do seu cavalo: ");
			horse.setNome(input.next());
			System.out.print("Insira a idade do seu cavalo: ");
			horse.setIdade(input.nextInt());
			System.out.println("Seu cavalo corre? Se sim digite (true), caso contr�rio (false)");
			horse.setCorrer(input.nextBoolean());
			horse.animalSom();
			System.out.println("\nNome do cavalo: " + horse.getNome() + "\nIdade: " + horse.getIdade() + " anos\n"
					+ "Cavalo corre? \n" + horse.isCorrer());
			break;
		case 3:
			System.out.print("Insira o nome da sua pregui�a: ");
			sloth.setNome(input.next());
			System.out.print("Insira a idade da sua pregui�a: ");
			sloth.setIdade(input.nextInt());
			System.out.println("Sua pregui�a sobe em �rvores? Se sim digite (true), caso contr�rio (false)");
			sloth.setArvore(input.nextBoolean());
			sloth.animalSom();
			System.out.println("\nNome da pregui�a: " + sloth.getNome() + "\nIdade: " + sloth.getIdade() + " anos\n"
					+ "Sobe em �rvores?\n " + sloth.isArvore());
			break;
		}
		input.close();
	}
}
