package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {

		// URI 1116
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		int y;
		double resp;

		for (int i = 0; i < n; i++) {
			x = 0;
			y = 0;
			resp = 0;
			x = sc.nextInt();
			y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				resp = (double) x / y;
				System.out.printf("%.1f%n", resp);
			}
		}
		
		sc.close();
	}
}
