package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1185 {

	public static void main(String[] args) {

		// URI 1185
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j < mat.length - i - 1)
					soma += mat[i][j];
			}
		}

		if (ch == 'M') {
			soma /= ((mat.length * mat.length) - 12) / 2;
		}
		System.out.println(String.format("%.1f", soma));

		sc.close();
	}
}
