package blaBla;

import java.util.Scanner;

public class TestaAviao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aviao a1 = new Aviao();
		/*
		 * peso; private int numeroAssentos; private int velocidade;
		 */
		System.out.println("Insira o modelo do avião:");
		a1.setModelo(ler.next());
		System.out.println("Insira o peso do avião:");
		a1.setPeso(ler.nextDouble());
		System.out.println("Insira o número de assentos do avião:");
		a1.setNumeroAssentos(ler.nextInt());
		System.out.println("Insira a velocidade do avião: ");
		a1.setVelocidade(ler.nextInt());

		System.out.println("O modelo do avião é: " + a1.getModelo());
		System.out.println("O peso do avião é: " + a1.getPeso());
		System.out.println("O número de assentos do avião é: " + a1.getNumeroAssentos());
		System.out.println("A velocidade atual do avião é: " + a1.getVelocidade());
		ler.close();
	}
}
