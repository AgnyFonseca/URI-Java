package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {

	public static void main(String[] args) {

		// URI 1118
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota;
		double media;
		double total;
		int contador;
		int sentinela;

		do {
			nota = 0.0;
			media = 0.0;
			total = 0.0;
			contador = 0;
			sentinela = 0;

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

			System.out.println("novo calculo (1-sim 2-nao)");
			sentinela = sc.nextInt();

			while (sentinela < 1 || sentinela > 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				sentinela = sc.nextInt();
			}

		} while (sentinela != 2);

		sc.close();
	}
}
