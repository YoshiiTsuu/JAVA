
package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, temperamento, contador = 0, jovemT = 0, idosoT = 0, calmo = 0, outroC = 0, mNerv = 0, hAgres = 0; // Outroscalmos
		int sexo;

		while (contador < 150) {
			contador++;
			System.out.print("Insira sua idade: ");
			idade = ler.nextInt();
			System.out.print("Insira seu sexo(1- feminino, 2- masculino, 3-Outros): ");
			sexo = ler.nextInt();
			System.out.print("Insira seu temperamento (1=calmo, 2=nervoso, 3=agressivo)");
			temperamento = ler.nextInt();
			
			if (temperamento == 1) {
				calmo++;
			if (idade < 18) {
				jovemT++;
			}if (sexo == 3) {
				outroC++;
				
			}}if (idade > 40 && temperamento == 2) {
				idosoT++;
			}	
			if (sexo == 1 && temperamento == 2) {
				mNerv++;
			}
			if (sexo == 2 && temperamento == 3) {
				hAgres++;
			}
			}
		System.out.println("Homens agressivos: " + hAgres);
		System.out.println("Mulheres nervosas: " + mNerv);
		System.out.println("Outros calmos: " + outroC);
		System.out.println("Pessoas calmas total: " + calmo);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + idosoT);
		System.out.println("Pessoas calmas com menos de 18 anos: " + jovemT);
		ler.close();
	}
}

