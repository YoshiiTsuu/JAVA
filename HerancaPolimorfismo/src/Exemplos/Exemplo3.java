package Exemplos;

public class Exemplo3 {
	private String primeiroNome;
	private String segundoNome;
	private String terceiroNome;

	public Exemplo3 (String primeiro, String segundo, String terceiro) {
		primeiroNome = primeiro;
		segundoNome = segundo;
		terceiroNome = terceiro;
	}

	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + "" + segundoNome + "" + terceiroNome;
		return nomeCompleto;
	}
}
