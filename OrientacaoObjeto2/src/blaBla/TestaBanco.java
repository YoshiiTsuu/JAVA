package blaBla;

public class TestaBanco {
	public static void main(String[] args) {
		/*
		 * nome cpf saldo serasa
		 */
		ContaBanco cliente = new ContaBanco();

		cliente.setNome("Mariana de Oliveira Santos");
		cliente.setCpf("484.214.412-90");
		cliente.setSaldo(17000);
		cliente.setSerasa("Limpo");

		System.out.println("O nome da(o) cliente é: " + cliente.getNome());
		System.out.println("O CPF é: " + cliente.getCpf());
		System.out.println("Seu saldo é de: R$" + cliente.getSaldo());
		System.out.println("Seu nome no Serasa está: " + cliente.getSerasa());
	}

}
