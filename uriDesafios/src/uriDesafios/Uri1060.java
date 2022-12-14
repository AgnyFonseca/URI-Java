package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {

		// URI 1060
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] num = new double[6];
		double contador = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();

		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				contador++;
			}
		}

		System.out.printf("%.0f valores positivos%n", contador);

		sc.close();
	}

}
