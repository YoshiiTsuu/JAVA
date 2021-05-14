package Exercicio;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio3 {
	/* Crie uma um programa para trabalhar com estoque de uma loja, o programa
	 * deverá trabalhar com Collection do tipo List do Java para manipular os dados
	 * desse estoque, o programa deverá atender as seguintes funcionalidades:
	 * Armazenar dados da List Remover dados da list; Atualizar dados da list.
	 * Apresentar todos os dados da list.
	 */

	public static void main(String[] args) {
		Map<String, Estoque> tok = new TreeMap<String, Estoque>();

		Estoque a = new Estoque("Trakinas", 2.0, 150.0);
		Estoque b = new Estoque("Belvita", 4.0, 100.0);
		Estoque c = new Estoque("Negresco", 2.0, 150.0);
		Estoque d = new Estoque("Ruffles", 5.0, 200.0);

		tok.put("Trakinas", a);
		tok.put("Belvita", b);
		tok.put("Negresco", c);
		tok.put("Ruffles", d);

		Collection<Estoque> stok = tok.values();
		for (Estoque i : stok) {
			System.out.println(i);

		}
		
		tok.remove("Ruffles");
		Collection<Estoque> stoka = tok.values();
		System.out.println("\n Lista de produtos atualizada!\n");
		for (Estoque i : stoka) {

			System.out.println(i);
		}
	}
}
