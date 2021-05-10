
public class TestaDoWhile {
	public static void main(String[] args) throws InterruptedException {
		int a = 0;
		do {
			System.out.println(a);
			a++;
			Thread.sleep(1000);
			System.out.flush();  
		} while (a < 10);
	System.out.println("Boooooooooom!!!****");

	}
}