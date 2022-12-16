package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1182 {

	public static void main(String[] args) {

		// URI 1182
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[][] mat = new double[12][12];
		int coluna = sc.nextInt();
		double soma = 0.0;
		char t = sc.next().toUpperCase().charAt(0);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			soma += mat[i][coluna];
		}

		if (t == 'M') {
			soma /= mat.length;
		}
		System.out.println(String.format("%.1f", soma));

		sc.close();
	}
}
