package br.com.metodos;

public class TestaMetodosSobrecarregados {

	public static void main(String[] args) {
		
		MinhaCalculadora mc = new MinhaCalculadora();
		
		//Somando dois números inteiros
		System.out.println(mc.soma(20, 30));
		
		//Somando tres números inteiros
		System.out.println(mc.soma(250, 250, 250));
		
		//Somando dois números doubles
		System.out.println(mc.soma(3.6, 6.7));
		
	}

}
