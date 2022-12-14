package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {

		// URI 1042
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int min1 = 0;
		int min2 = 0;
		int min3 = 0;
		min1 = Math.min(X, Math.min(Y, Z));

		if (min1 == X) {
			min2 = Math.min(Y, Z);
			min3 = Math.max(Y, Z);
		}
		if (min1 == Y) {
			min2 = Math.min(X, Z);
			min3 = Math.max(X, Z);
		}
		if (min1 == Z) {
			min2 = Math.min(X, Y);
			min3 = Math.max(X, Y);
		}
		System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
		System.out.print(X + "\n" + Y + "\n" + Z + "\n");

		sc.close();
	}

}
