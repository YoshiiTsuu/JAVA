import java.util.Scanner;

public class TestaSwitchCase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma letra");
		String letra = ler.nextLine();

		switch (letra) {
		case "a":// ASPAS DUPLAS E DOIS PONTOS!!!
			System.out.println("Roi joliana né?");
			break;
		case "b":// ASPAS DUPLAS E DOIS PONTOS!!!
			System.out.println("Roi Bruna né?");
			break;
		case "c":// ASPAS DUPLAS E DOIS PONTOS!!!
			System.out.println("Roi Carlinhos UwU");
			break;

		default:// caso não seja nenhum dos outros casos acima!!! vai pra este comando
			System.out.println("mer mão, ou é a, b ou c. Para de ser troxa!");
		}

		ler.close();

	}
}
