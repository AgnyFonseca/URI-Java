package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {

		// URI 1038
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double preco = 0;
		double total;

		switch (codigo) {
		case 1:
			preco = 4.0;
			break;
		case 2:
			preco = 4.5;
			break;
		case 3:
			preco = 5.0;
			break;
		case 4:
			preco = 2.0;
			break;
		case 5:
			preco = 1.5;
			break;
		}

		total = preco * qtd;
		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

}
