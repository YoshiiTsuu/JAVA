package blaBla;

public class TestaFuncionarios {
	public static void main(String[] args) {
		/*
		 * nome idade altura cidade natal
		 */
		Funcionarios funcionario1 = new Funcionarios();
		funcionario1.setNome("Yoshiii");
		funcionario1.setIdade(20);
		funcionario1.setAltura(168);
		funcionario1.setCidadeNatal("Tochigi");

		System.out.println("O nome do funcion�rio �: " + funcionario1.getNome());
		System.out.println("A idade do funcion�rio �: " + funcionario1.getIdade());
		System.out.println("A altura do funcion�rio �: " + funcionario1.getAltura());
		System.out.println("A cidade natal do funcion�rio �: " + funcionario1.getCidadeNatal());
	}
}