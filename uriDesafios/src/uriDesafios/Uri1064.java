package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {

	public static void main(String[] args) {

		// URI 1064
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n;
		double c = 0;
		double media = 0;

		for (int i = 0; i < 6; i++) {
			n = sc.nextDouble();
			if (n > 0) {
				c++;
				media += n;
			}
		}
		media = media / c;

		System.out.printf("%.0f valores positivos%n", c);
		System.out.printf("%.1f%n", media);

		sc.close();
	}

}
