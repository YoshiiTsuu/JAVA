package br.generation.LacoCondicional;

public class LacoRepeticao  {
	public static void main(String[] args) throws InterruptedException{
	// throws ele serve para caso aconte�a um erro, voc� tme que pesquisar melhor
	// padr�o pra threads

		int numero = 10;
		while (numero >= 0) {
			System.out.println("\nContando..." + numero);
			numero = numero - 1;
			Thread.sleep(1000);
		}
		System.out.println("Booooom...");
	}
}
