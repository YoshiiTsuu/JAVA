package br.generation.LacoCondicional;

public class LacoRepeticao  {
	public static void main(String[] args) throws InterruptedException{
	// throws ele serve para caso aconteça um erro, você tme que pesquisar melhor
	// padrão pra threads

		int numero = 10;
		while (numero >= 0) {
			System.out.println("\nContando..." + numero);
			numero = numero - 1;
			Thread.sleep(1000);
		}
		System.out.println("Booooom...");
	}
}
