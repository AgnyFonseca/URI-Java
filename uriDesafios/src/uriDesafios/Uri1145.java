package uriDesafios;

import java.util.Scanner;

public class Uri1145 {

	public static void main(String[] args) {

		// URI 1145
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i = 1;

		while (i <= y) {
			for (int j = 0; j < x; j++) {
				System.out.printf("%d", i);
				if (i % x == 0) {
					System.out.print("");
				} else {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
		}

		sc.close();
	}
}
