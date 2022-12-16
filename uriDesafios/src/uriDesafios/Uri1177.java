package uriDesafios;

import java.util.Scanner;

public class Uri1177 {

	public static void main(String[] args) {

		// URI 1177
		Scanner sc = new Scanner(System.in);
		int[] n = new int[1000];
		int t = sc.nextInt();
		int c = 0;

		for (int i = 0; i < n.length; i++) {
			if (c < t) {
				System.out.printf("N[%d] = %d%n", i, c);
				c++;
			}
			if (c == t) {
				c = 0;
			}
		}

		sc.close();
	}
}
