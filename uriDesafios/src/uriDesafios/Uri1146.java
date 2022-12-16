package uriDesafios;

import java.util.Scanner;

public class Uri1146 {

	public static void main(String[] args) {

		// URI 1146
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x != 0) {
			for (int i = 1; i <= x; i++) {
				if (i == x) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + " ");
				}
			}
			x = sc.nextInt();
		}

		sc.close();
	}
}
