package Exercicio;

public class PreguicaSom extends Animal2 implements AnimalSom {

	@Override
	public void animalSom() {
		System.out.println("O som da pregui�a �: Iiiiwwwnnnn");

	}

	private boolean arvore;

	public boolean isArvore() {
		return arvore;
	}

	public void setArvore(boolean subirArvore) {
		this.arvore = subirArvore;
	}
}