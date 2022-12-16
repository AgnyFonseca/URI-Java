package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1158 {

	public static void main(String[] args) {

		// URI 1158
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x, y, j, total, soma;

		for (int i = 1; i <= n; i++) {
			soma = 0;
			x = sc.nextInt();
			y = sc.nextInt();

			for (j = x, total = 0; total < y; j++) {
				if (j % 2 != 0) {
					soma += j;
					total += 1;
				}
			}
			System.out.println(soma);
		}

		sc.close();
	}
}
