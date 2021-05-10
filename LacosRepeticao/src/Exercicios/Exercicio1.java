package Exercicios;

public class Exercicio1 {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
		 * resto = 5. (FOR)
		 * 
		 */
		int a;

		for (a = 1000; a <= 1999; a += 1) {
			if (a % 11 == 5) {
				System.out.println(a);
				Thread.sleep(500);
			}
		}
	}
}
