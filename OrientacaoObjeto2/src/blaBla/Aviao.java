package blaBla;

public class Aviao {
	/*
	 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta
	 * classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e
	 * apresente as informa��es deste objeto no console.
	 */
	private String modelo;
	private double peso;
	private int numeroAssentos;
	private int velocidade;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumeroAssentos() {
		return numeroAssentos;
	}

	public void setNumeroAssentos(int assentos) {
		this.numeroAssentos = assentos;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;

	}
}
