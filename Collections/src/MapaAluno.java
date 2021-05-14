import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
//falando sobre MAP
	// estrutura para recuperar os dados do aluno
	// recebendo apenas o seu nome
	// Mapeia as chaves para os valores
	public static void main(String[] args) {

		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

		Aluno a = new Aluno("John Senna", "Linux", 6.6);
		Aluno b = new Aluno("Jauri", "HTML", 7.6);
		Aluno c = new Aluno("José", "JDk", 8.6);
		Aluno d = new Aluno("Johnsons", "JavaScrypt", 9.6);
		Aluno e = new Aluno("John Senna", "Java", 10.6);

		mapa.put("John Senna", a);
		mapa.put("Jauri", b);
		mapa.put("José", c);
		mapa.put("Johnsons", d);
		mapa.put("John Senna", e);
		System.out.println(mapa);
		System.out.println(mapa.get("José"));

		Collection<Aluno> alunos = mapa.values();
		for (Aluno e1 : alunos) {
			System.out.println(e1);

		}
	}
}
