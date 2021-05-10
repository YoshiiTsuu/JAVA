package exerciciosOrientacaoObjeto;

import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		cliente cliente1 = new cliente();
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira seu nome.");
		cliente1.setName(ler.next());
		System.out.println("Insira seu peso:");
		cliente1.setWeight(ler.nextInt());
		System.out.println("Insira sua idade: ");
		cliente1.setYO(ler.nextInt());

		System.out.println("O nome do cliente é: " + cliente1.getName());
		System.out.println("O peso do cliente é: " + cliente1.getWeight());
		System.out.println(" A idade do cliente é: " + cliente1.getYO());

		ler.close();
	}
}
