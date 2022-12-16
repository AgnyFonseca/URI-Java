package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {

	public static void main(String[] args) {

		// URI 1079
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			double media = ((x * 2) + (y * 3) + (z * 5)) / 10;
			System.out.printf("%.1f%n", media);

		}

		sc.close();
	}

}
