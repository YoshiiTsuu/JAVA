package blaBla;

import java.util.Scanner;

public class TestaAviao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aviao a1 = new Aviao();
		/*
		 * peso; private int numeroAssentos; private int velocidade;
		 */
		System.out.println("Insira o modelo do avi�o:");
		a1.setModelo(ler.next());
		System.out.println("Insira o peso do avi�o:");
		a1.setPeso(ler.nextDouble());
		System.out.println("Insira o n�mero de assentos do avi�o:");
		a1.setNumeroAssentos(ler.nextInt());
		System.out.println("Insira a velocidade do avi�o: ");
		a1.setVelocidade(ler.nextInt());

		System.out.println("O modelo do avi�o �: " + a1.getModelo());
		System.out.println("O peso do avi�o �: " + a1.getPeso());
		System.out.println("O n�mero de assentos do avi�o �: " + a1.getNumeroAssentos());
		System.out.println("A velocidade atual do avi�o �: " + a1.getVelocidade());
		ler.close();
	}
}
