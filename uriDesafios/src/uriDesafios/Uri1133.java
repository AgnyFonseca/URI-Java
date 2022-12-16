package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1133 {

	public static void main(String[] args) {

		// URI 1133
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			for (int i = y + 1; i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}

		} else if (y > x) {
			for (int i = x + 1; i < y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}

		sc.close();
	}
}
