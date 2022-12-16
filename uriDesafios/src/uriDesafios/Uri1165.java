package uriDesafios;

import java.util.Scanner;

public class Uri1165 {

	public static void main(String[] args) {

		// URI 1165
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c, x;

		for (int i = 1; i <= n; i++) {
			c = 0;
			x = sc.nextInt();

			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					c++;
				}
			}
			if (c == 0) {
				System.out.println(x + " eh primo");
			} else {
				System.out.println(x + " nao eh primo");
			}
		}

		sc.close();
	}
}
