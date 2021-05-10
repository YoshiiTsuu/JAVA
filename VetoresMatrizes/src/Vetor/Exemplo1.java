package Vetor;

public class Exemplo1 {
	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; 
		
		System.out.printf("posição || valores");
		for (int i=0; i<10; i++) {
			System.out.println(i + arrayVetor[i]);
		}
	}
}
