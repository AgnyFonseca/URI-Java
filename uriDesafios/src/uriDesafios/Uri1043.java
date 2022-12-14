package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {

		// URI 1043
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double tri;
		double tra;

		if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {
			tri = a + b + c;
			System.out.printf("Perimetro = %.1f%n", tri);
		} else {
			tra = (a + b) * c / 2;
			System.out.printf("Area = %.1f%n", tra);
		}

		sc.close();
	}

}
