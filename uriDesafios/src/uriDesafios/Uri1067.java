package uriDesafios;

import java.util.Scanner;

public class Uri1067 {

	public static void main(String[] args) {

		// URI 1067
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= x; i += 2) {
			System.out.printf("%d%n", i);
		}

		sc.close();
	}

}
