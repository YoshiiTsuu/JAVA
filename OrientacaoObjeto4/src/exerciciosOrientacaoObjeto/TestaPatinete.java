package exerciciosOrientacaoObjeto;

public class TestaPatinete {
	public static void main(String[] args) {
		Patinete patinete1 = new Patinete();
		patinete1.setEmpresa("Yellow");
		patinete1.setMarca("Caloi");
		patinete1.setnumRodas(3);
		patinete1.setVelMax(10);

		System.out.println("O patinete � da empresa: " + patinete1.getEmpresa());
		System.out.println("A marca do patinete n�: " + patinete1.getMarca());
		System.out.println("O n�mero de rodas do patinete �: " + patinete1.getnumRodas() + "rodas");
		System.out.println("A velocidade m�xima do patinete �: " + patinete1.getVelMax() + "Km/H");
	}
}
