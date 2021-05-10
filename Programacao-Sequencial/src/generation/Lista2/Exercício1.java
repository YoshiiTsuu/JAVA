package generation.Lista2;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		/*
		 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento
		 * diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
		 * estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar
		 * um multa de R$ 4,00 por quilo excedente. João precisa que você faça um
		 * sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se
		 * houver, gravar na variável E (Excesso) e na variável M o valor da multa que
		 * João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		
		Scanner ler = new Scanner(System.in);
		int p, e, m; //Peso, Excesso e Multa respectivamente
		
		System.out.print("Insira quantos quilos está carregando: ");
		p=ler.nextInt();
		
		if (p>50) {
			e=p-50;
			m=4*e;
			System.out.println("Você excedeu o limite do peso de tomates em: " + e+"." + "\nA multa será de R$"+ m+".");
		}
		else System.out.println("Você não excedeu o limite, não haverá multa.");
	}

}
