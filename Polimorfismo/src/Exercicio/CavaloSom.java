package Exercicio;

public class CavaloSom extends Animal2 implements AnimalSom {

	@Override
	public void animalSom() {
		System.out.println("O som do cavalo �: Pocot� Poot� Pocot�");

	}

	private boolean correr;

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

}
