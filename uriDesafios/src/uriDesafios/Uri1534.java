package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1534 {

	public static void main(String[] args) {

		// URI 1534
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;

		while (sc.hasNext()) {
			n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (i + j == (n - 1)) {
						System.out.print("2");
					} else if (i == j) {
						System.out.print("1");
					} else {
						System.out.print("3");
					}
				}
				System.out.println("");
			}
		}

		sc.close();
	}
}
