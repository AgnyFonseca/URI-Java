package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {

		// URI 1009
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		double salary = sc.nextDouble();
		double sales = sc.nextDouble();
		System.out.printf("TOTAL = R$ %.2f%n", salary + (sales * 15 / 100));

		sc.close();
	}

}
