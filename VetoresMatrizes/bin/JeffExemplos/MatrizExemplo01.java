package com.matrizes;

public class MatrizExemplo01 {

	public static void main(String[] args) {
		
	double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;

		notasAlunos[1][0] = 8.8;
		notasAlunos[1][1] = 7.5;
		notasAlunos[1][2] = 5.5;
		notasAlunos[1][3] = 9.0;
		
		//==Impressão da Matriz==
		for(int l = 0; l<notasAlunos.length; l++) { //percorre a linha
			for(int c = 0; c<notasAlunos[l].length; c++) {//percorre a coluna
				System.out.print(notasAlunos[l][c] + " | ");
			}
				System.out.println();
		}
	}

}
==================================================
public class MatrizExemplo02 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;

		notasAlunos[1][0] = 8.8;
		notasAlunos[1][1] = 7.5;
		notasAlunos[1][2] = 5.5;
		notasAlunos[1][3] = 9.0;
		
		System.out.println("Calculando a média de cada aluno: ");
		
		double soma;
	for(int l=0; l<notasAlunos.length; l++) {
			
		soma = 0;
		for(int c = 0; c<notasAlunos[l].length; c++) {
		soma += notasAlunos[l][c];
			}
			System.out.println("Média do Aluno " + l + " é: " + (soma/4));
		}
	}
}
================================================

public class MatrizExemplo03 {

	public static void main(String[] args) {
				
	Scanner entrada = new Scanner(System.in);
				
	double[][] notasAlunos = new double[2][4];
				System.out.println("===Notas do Aluno:===");
				
	for(int l=0; l<notasAlunos.length; l++){
	for(int c=0;c<notasAlunos[l].length;c++){
						System.out.printf("Digite às notas: %d %d: ", l,c);
						notasAlunos[l][c] = entrada.nextDouble();			  
}
					System.out.println();
}

for(int l=0; l<notasAlunos.length; l++){
for(int c=0;c<notasAlunos[l].length;c++){
						System.out.printf(notasAlunos[l][c] + ", ");			  
}
					System.out.print("\n");

		}
	}
}