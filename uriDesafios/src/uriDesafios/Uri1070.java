package uriDesafios;

import java.util.Scanner;

public class Uri1070 {

	public static void main(String[] args) {

		// URI 1070
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int c = 0;

		while (c < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				c++;
			}
			x++;
		}

		sc.close();
	}

}
