package uriDesafios;

import java.util.Scanner;

public class Uri1143 {

	public static void main(String[] args) {

		// URI 1143
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
		}

		sc.close();
	}
}
