package uriDesafios;

import java.util.Scanner;

public class Uri1142 {

	public static void main(String[] args) {

		// URI 1142
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1;
		int p = 0;

		while (c <= n) {
			System.out.println((p + 1) + " " + (p + 2) + " " + (p + 3) + " PUM");
			p += 4;

			c++;
		}

		// URI 1142
		/*
		 * int n = sc.nextInt(); int p = 0;
		 * 
		 * for (int i = 0; i < n; i++) { System.out.println((p+1) + " " + (p+2) + " " +
		 * (p+3) + " PUM"); p+=4; }
		 */

		sc.close();
	}
}
