package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1180 {

	public static void main(String[] args) {

		// URI 1180
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int iMenor = 0, menor = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();

			if (i == 0) {
				menor = x[i];
				iMenor = i;
			}

			else if (x[i] < menor) {
				menor = x[i];
				iMenor = i;
			}
		}
		System.out.printf("Menor valor: %d%n", menor);
		System.out.printf("Posicao: %d%n", iMenor);

		sc.close();
	}
}
