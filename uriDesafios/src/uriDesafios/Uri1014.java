package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {

		// URI 1014
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double media = x / y;
		System.out.printf("%.3f km/l%n", media);

		sc.close();
	}

}
