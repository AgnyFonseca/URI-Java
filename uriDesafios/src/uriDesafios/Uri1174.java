package uriDesafios;

import java.util.Scanner;

public class Uri1174 {

	public static void main(String[] args) {

		// URI 1174
		Scanner sc = new Scanner(System.in);
		double[] a = new double[100];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j] <= 10) {
				System.out.printf("A[%d] = %.1f%n", j, a[j]);
			}
		}

		sc.close();
	}
}
