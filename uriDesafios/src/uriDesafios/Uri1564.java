package uriDesafios;

import java.util.Scanner;

public class Uri1564 {

	public static void main(String[] args) {

		// URI 1564
		Scanner sc = new Scanner(System.in);
		int n;

		while (sc.hasNext()) {
			n = sc.nextInt();

			if (n == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		}

		sc.close();
	}
}
