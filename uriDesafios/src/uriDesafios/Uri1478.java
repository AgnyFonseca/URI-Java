package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1478 {

	public static void main(String[] args) {

		// URI 1478
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n != 0) {

			int[][] mat = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					mat[i][j] = 1 + Math.abs(i - j);
				}
			}

			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < n; i++) {
				sb.append(String.format("%3d", mat[i][0]));
				for (int j = 1; j < n; j++) {
					sb.append(String.format(" %3d", mat[i][j]));
				}
				sb.append(System.lineSeparator());
			}
			System.out.println(sb);

			n = sc.nextInt();
		}

		sc.close();
	}
}
