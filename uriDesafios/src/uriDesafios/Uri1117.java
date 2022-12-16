package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {

		// URI 1117
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota;
		double media = 0.0;
		double total = 0.0;
		int contador = 0;

		while (contador != 2) {
			nota = sc.nextDouble();

			if (nota >= 0.0 && nota <= 10.0) {
				total += nota;
				contador++;
			} else {
				System.out.println("nota invalida");
			}
		}
		media = total / 2;
		System.out.printf("media = %.2f%n", media);

		sc.close();
	}
}
