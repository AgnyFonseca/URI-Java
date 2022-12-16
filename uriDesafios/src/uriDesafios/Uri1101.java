package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1101 {

	public static void main(String[] args) {

		// URI 1101
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m;
		int n;

		while (((m = sc.nextInt()) > 0) && ((n = sc.nextInt()) > 0)) {
			int x = 0;

			if (m > n) {
				for (int i = n; i <= m; i++) {
					System.out.printf("%d ", i);
					x += i;
				}
				System.out.printf("Sum=%d%n", x);
			} else {
				for (int j = m; j <= n; j++) {
					System.out.printf("%d ", j);
					x += j;
				}
				System.out.printf("Sum=%d%n", x);
			}

		}
		
		sc.close();
	}
}
