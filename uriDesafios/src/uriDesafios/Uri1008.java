package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {

		// URI 1008
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hours = sc.nextInt();
		double salaryHour = sc.nextDouble();
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", salaryHour * hours);

		sc.close();
	}

}
