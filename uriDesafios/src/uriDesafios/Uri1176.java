package uriDesafios;

import java.util.Scanner;

public class Uri1176 {

	public static void main(String[] args) {

		// URI 1176
		Scanner sc = new Scanner(System.in);
		long[] fibonacci = new long[61];
		int teste = sc.nextInt();
		int n;

		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i <= 60; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
		}

		for (int j = 0; j < teste; j++) {
			n = sc.nextInt();
			System.out.printf("Fib(%d) = %d%n", n, fibonacci[n]);
		}

		sc.close();
	}
}
