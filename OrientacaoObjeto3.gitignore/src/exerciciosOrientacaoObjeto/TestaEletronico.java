package exerciciosOrientacaoObjeto;

public class TestaEletronico {
	public static void main(String[] args) {
		Eletronico celular = new Eletronico();
		celular.setTamanhoAltura(15);
		celular.setTamanhoLargura(8);
		celular.setEletronicoNome("GalaxyJ7");
		celular.setMarca("Samsung");

		System.out.println("A altura do eletr�nico em cent�metros �: " + celular.getTamanhoAltura());
		System.out.println("A largura do eletr�nico �: " + celular.getTamanhoLargura());
		System.out.println("A marca do eletr�nico �: " + celular.getMarca());
		System.out.println("O nome do eletr�nico �: " + celular.getEletronicoNome());
	}
}
