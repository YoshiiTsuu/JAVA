import java.util.Scanner;

public class TestaSwitchCase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma letra");
		String letra = ler.nextLine();

		switch (letra) {
		case "a":// ASPAS DUPLAS E DOIS PONTOS!!!
			System.out.println("Roi joliana n�?");
			break;
		case "b":// ASPAS DUPLAS E DOIS PONTOS!!!
			System.out.println("Roi Bruna n�?");
			break;
		case "c":// ASPAS DUPLAS E DOIS PONTOS!!!
			System.out.println("Roi Carlinhos UwU");
			break;

		default:// caso n�o seja nenhum dos outros casos acima!!! vai pra este comando
			System.out.println("mer m�o, ou � a, b ou c. Para de ser troxa!");
		}

		ler.close();

	}
}
