package Exercicio;

public class CachorroSom extends Animal2 implements AnimalSom {

	@Override
	public void animalSom() {
		System.out.println("O som do cachorro é auuuu auuuu.");// TODO Auto-generated method stub

	}

	private boolean correr;

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

}
