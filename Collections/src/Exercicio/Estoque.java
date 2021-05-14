package Exercicio;

public class Estoque {
	private String nomeProduto;
	private double preco;
	private double peso;

	public Estoque(String nomeProduto, double preco, double peso) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.peso = peso;

	}

	public String toString() {
		return this.nomeProduto + " R$" + this.preco + "; " + this.peso + "gramas.\n";
	}

	public String getnomeProduto() {
		return nomeProduto;
	}

	public void setnomeProduto(String nome) {
		nomeProduto = nome;
	}

	public double getpreco() {
		return preco;
	}

	public void setpreco(double preco) {
		this.preco = preco;
	}

	public double getpeso() {
		return peso;
	}

	public void setpeso(double peso) {
		this.peso = peso;
	}

}
