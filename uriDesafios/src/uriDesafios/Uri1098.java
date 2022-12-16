package uriDesafios;

import java.util.Locale;

public class Uri1098 {

	public static void main(String[] args) {

		// URI 1098
		Locale.setDefault(Locale.US);
		double i = 0;
		double j = 1;
		while (i <= 2) {
			for (int k = 0; k < 3; k++) {
				if (i == 0 || i == 1 || i >= 1.9) {
					System.out.println("I=" + Math.round(i) + " J=" + Math.round(j));
				} else {
					System.out.printf("I=%.1f J=%.1f%n", i, j);
				}
				j++;
			}
			j -= 3.0;
			j = j + 0.2;
			i = i + 0.2;
		}
	}

}
