package br.com.metodos;

public class TestaMetodos {

	static int numero1 = 1000;
	static int numero2 = 2000;
	static int soma;
	
	public static void main(String[] args) {
		
		metodo();
		metodo2();
		metodo3();
		metodo4(100,200);
		metodo5();
	}
	
	public static void metodo() {
		System.out.println("Ol� eu sou o m�todo number 1!");
	}

	public static void metodo2() {
		
		soma = numero1 + numero2;
	}
	
	public static void metodo3() {
		System.out.println("Eu sou o m�todo 3: " + soma);
	}
	
	public static void metodo4(int numero1, int numero2) {
		int soma = numero1 + numero2;
		System.out.println("Eu sou o m�todo 4: " + soma);
	}
	
	public static void metodo5() {
		System.out.println(TestametodoFora.cont(1, 7));
	}
}
