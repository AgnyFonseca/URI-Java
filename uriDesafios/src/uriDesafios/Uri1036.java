package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) {

		// URI 1036
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - (4 * a * c);

		if ((a == 0) || (delta < 0)) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = (((-1 * b) + Math.pow(delta, 0.5)) / (2 * a));
			double r2 = (((-1 * b) - Math.pow(delta, 0.5)) / (2 * a));
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}

		sc.close();
	}

}
