package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {

		// URI 1002
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double n = 3.14159;
		double area = n * Math.pow(raio, 2);
		System.out.printf("A=%.4f", area);

		sc.close();
	}

}
