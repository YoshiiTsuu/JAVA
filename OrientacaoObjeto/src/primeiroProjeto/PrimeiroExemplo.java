package primeiroProjeto;

public class PrimeiroExemplo {
	static int numero1 = 200;
	static int numero2 = 100;
	static int soma;

	public static void main(String[] args) {
		metodo();
		metodo2();
		metodo3();
		metodo4(2, 3);

	}

	public static void metodo() {

		System.out.println("Ola mundo");
	}

	public static void metodo2() {
		soma = numero1 + numero2;
	}

	public static void metodo3() {
		System.out.println(soma);
	}

	public static void metodo4(int numero1, int numero2) {
		int soma = numero1 + numero2;
		System.out.println(soma);
	}

}