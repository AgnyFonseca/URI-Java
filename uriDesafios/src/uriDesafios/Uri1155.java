package uriDesafios;

import java.util.Locale;

public class Uri1155 {

	public static void main(String[] args) {

		// URI 1155
		Locale.setDefault(Locale.US);
		double s = 1;

		for (int i = 2; i <= 100; i++) {
			s = (double) s + 1.0 / i;
		}
		System.out.printf("%.2f%n", s);
	}
}
