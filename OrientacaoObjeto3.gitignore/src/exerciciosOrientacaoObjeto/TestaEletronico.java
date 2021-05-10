package exerciciosOrientacaoObjeto;

public class TestaEletronico {
	public static void main(String[] args) {
		Eletronico celular = new Eletronico();
		celular.setTamanhoAltura(15);
		celular.setTamanhoLargura(8);
		celular.setEletronicoNome("GalaxyJ7");
		celular.setMarca("Samsung");

		System.out.println("A altura do eletrônico em centímetros é: " + celular.getTamanhoAltura());
		System.out.println("A largura do eletrônico é: " + celular.getTamanhoLargura());
		System.out.println("A marca do eletrônico é: " + celular.getMarca());
		System.out.println("O nome do eletrônico é: " + celular.getEletronicoNome());
	}
}
