import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Aula1 {
	public static void main(String[] args) {
		Collection<String> nomes = new ArrayList();
		nomes.add("Yoshi");
		nomes.add("Tocumbo");
		nomes.add("Ale");
		nomes.add("Malu");
		nomes.add("Lalalala");
		/*
		 * System.out.println("Lista de nomes com yoshi: " + nomes);
		 * nomes.remove("Yoshi");// removendo apenas nome Yosshi
		 * System.out.println("Lista de nomes sem yoshi: " + nomes);
		 */
		String primeiroAluno;
		 

		// System.out.println();
		// System.out.println();

		for (String names : nomes) {

			System.out.println("Nome: " + names);
		}

		Collection<String> nomes2 = Arrays.asList("Prezzoto", "Ponyo", "Totoro");
		nomes.addAll(nomes2);// Adicionando todos nomes2 para --> nomes
		System.out.println("\n\nLista de nomes atualizada: " + nomes);

		nomes.clear(); // Limpando lista de nomes

	}
}
