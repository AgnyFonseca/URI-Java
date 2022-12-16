package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1073 {

	public static void main(String[] args) {

		// URI 1073
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n; i += 2) {
			if (i % 2 == 0) {
				double q = Math.pow(i, 2);
				System.out.printf("%d^2 = %d%n", i, (int) q);
			}

		}

		sc.close();
	}

}
