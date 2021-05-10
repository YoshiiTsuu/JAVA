import java.util.Scanner;

public class TestaWhile {
	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		ler.close();
		int a = 0;
		while (a <= 10) {
			a++;
			Thread.sleep(1000);
			System.out.println("O valor de a é: " + a);
		}
	}
}
