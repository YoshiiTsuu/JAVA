package Vetor;

public class Exemplo2 {
	public static void main(String[] args) {

		double[] vetorArray = new double[5];
		vetorArray[0]=32.0;
		vetorArray[1]=13.0;
		vetorArray[2]=18.0;
		vetorArray[3]=25.5;
		vetorArray[4]=23.0;
		
		System.out.println("O valor da temperatura no dia 1: "+ vetorArray[0]);
		System.out.println("O tamanho do meu array: " + vetorArray.length);
		System.out.println("Os valores do array" );
		for (int i=0; i<vetorArray.length; i++) {
			System.out.println("O valor da temperatura no dia "+
		(i+1) + " é: " + vetorArray[i]+"ºC");
		}
	
	}
	}
