package uriDesafios;

import java.util.Locale;

public class Uri1156 {

	public static void main(String[] args) {

		// URI 1156
		Locale.setDefault(Locale.US);
		double s = 1.0;
		double x = 2.0;

		for (int i = 3; i <= 39; i += 2) {
			s = s + i / x;
			x = x * 2;
		}
		System.out.printf("%.2f%n", s);
	}
}
