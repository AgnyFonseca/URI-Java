package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {

		// URI 1010
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		int peca2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		double total = (qtd1 * preco1) + (qtd2 * preco2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}

}
