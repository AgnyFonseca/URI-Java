package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1115 {

	public static void main(String[] args) {

		// URI 1115
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		do {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}

		} while (x != 0 && y != 0);

		sc.close();
	}
}
