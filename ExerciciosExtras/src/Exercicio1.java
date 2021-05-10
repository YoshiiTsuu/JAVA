import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/*
		 * ⦁ Identifique os dados de entrada, processamento e saída no algoritmo abaixo.
		 * ⦁ Receba código da peça;___________. ⦁ Receba valor de peça;____________. ⦁
		 * Receba quantidades de peças;_____________ ⦁ Calcule o valor total das peças
		 * (Quantidade * valor) ___________. ⦁ Mostre o código da peça e seu valor
		 * total_______________.
		 */
		int code, value, amount, vTotal;

		System.out.print("Insira o código da peça: ");
		code = ler.nextInt();
		System.out.print("\nInsira o valor da peça: ");
		value = ler.nextInt();
		System.out.print("\nInsira a quantidade de peças: ");
		amount = ler.nextInt();

		// valor total = quantidade* valor
		vTotal = amount * value;
		System.out.println("O valor total das peças inserida é: " + vTotal);
		System.out.println("O código da peça inserida é: " + code);
		ler.close();
	}
}
