package uriDesafios;

import java.util.Scanner;

public class Uri1078 {

	public static void main(String[] args) {

		// URI 1078
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", i, n, i * n);
		}

		sc.close();
	}

}
