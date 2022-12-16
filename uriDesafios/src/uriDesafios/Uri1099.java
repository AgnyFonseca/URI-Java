package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1099 {

	public static void main(String[] args) {

		// URI 1099
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int soma;

		for (int i = 0; i < n; i++) {
			soma = 0;
			x = sc.nextInt();
			y = sc.nextInt();

			if (y > x) {
				for (int j = x + 1; j < y; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}

			} else {
				for (int j = y + 1; j < x; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			}

			System.out.println(soma);
			sc.close();
		}
	}

}
