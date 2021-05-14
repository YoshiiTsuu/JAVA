import java.util.HashSet;
import java.util.Set;

public class TestaSet {
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		// Set Aula2 --> COLLECTION!!!
		// Set e Hashset?
		//HashCode, onde vou por ou colocar
		// primeiro ver Hash
		// caso duplicado
		// implementar dentro do hash code
		// sobrescreve o método hashcode
		Aluno a = new Aluno("John Senna", "Linux", 6.6);
		Aluno b = new Aluno("Jauri", "HTML", 7.6);
		Aluno c = new Aluno("José", "JDk", 8.6);
		Aluno d = new Aluno("Johnsons", "JavaScrypt", 9.6);
		Aluno e = new Aluno("John Senna", "Java", 10.6);

		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		conjunto.add(e);

		System.out.println(conjunto);

	}
}
