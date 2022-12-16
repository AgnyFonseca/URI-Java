package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {

		// URI 1159
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x != 0) {
			int total = 0;
			for (int i = 1; i <= 5; i++) {
				if (x % 2 != 0) {
					x++;
				}
				if (x % 2 == 0) {
					total += x;
				}
				x += 2;
			}
			System.out.println(total);
			x = sc.nextInt();
		}

		sc.close();
	}
}
