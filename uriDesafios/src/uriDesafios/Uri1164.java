package uriDesafios;

import java.util.Scanner;

public class Uri1164 {

	public static void main(String[] args) {

		// URI 1164
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int perfeito, x;

		for (int i = 1; i <= n; i++) {
			perfeito = 0;
			x = sc.nextInt();

			for (int j = 1; j < x; j++) {
				if (x % j == 0) {
					perfeito += j;
				}
			}
			if (perfeito == x) {
				System.out.println(x + " eh perfeito");
			} else {
				System.out.println(x + " nao eh perfeito");
			}
		}

		sc.close();
	}
}
