package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1178 {

	public static void main(String[] args) {

		// URI 1178
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] n = new double[100];
		double x = sc.nextDouble();
		n[0] = x;

		for (int i = 0; i < n.length; i++) {
			if (i == 0) {
				System.out.printf("N[%d] = %.4f%n", i, n[i]);
			} else {
				x = x / 2.0;
				n[i] = x;
				System.out.printf("N[%d] = %.4f%n", i, n[i]);
			}
		}

		sc.close();
	}
}
