package uriDesafios;

import java.util.Scanner;

public class Uri1759 {

	public static void main(String[] args) {

		// URI 175
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i != n) {
				System.out.print("Ho ");
			} else if (i == n) {
				System.out.print("Ho!\n");
			}
		}

		sc.close();
	}
}
