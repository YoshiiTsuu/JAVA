package generation.Lista2;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main(String[] args) {
		/*
		 * 1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento
		 * di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
		 * estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar
		 * um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um
		 * sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se
		 * houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que
		 * Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
		 */
		
		Scanner ler = new Scanner(System.in);
		int p, e, m; //Peso, Excesso e Multa respectivamente
		
		System.out.print("Insira quantos quilos est� carregando: ");
		p=ler.nextInt();
		
		if (p>50) {
			e=p-50;
			m=4*e;
			System.out.println("Voc� excedeu o limite do peso de tomates em: " + e+"." + "\nA multa ser� de R$"+ m+".");
		}
		else System.out.println("Voc� n�o excedeu o limite, n�o haver� multa.");
	}

}
