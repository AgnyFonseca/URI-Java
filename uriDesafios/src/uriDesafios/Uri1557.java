package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1557 {

	public static void main(String[] args) {

		// URI 1557
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x, t, y;

		while (n != 0) {

			int[][] mat = new int[n][n];
			x = 1;

			for (int i = 1; i <= n; i++) {
				y = x;
				for (int j = 1; j <= n; j++) {
					mat[i - 1][j - 1] = y;
					y *= 2;
				}
				x *= 2;
			}

			t = String.valueOf(mat[n - 1][n - 1]).length();

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.printf("%" + t + "d", mat[i - 1][j - 1]);
					if (j < n) {
						System.out.print(" ");
					} else {
						System.out.print("\n");
					}
				}
			}
			System.out.print("\n");
			n = sc.nextInt();
		}

		sc.close();
	}
}
