package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1113 {

	public static void main(String[] args) {

		// URI 1113
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		while ((x = sc.nextInt()) != (y = sc.nextInt())) {
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
		}
		
		sc.close();
	}
}
