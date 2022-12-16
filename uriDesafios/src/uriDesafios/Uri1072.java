package uriDesafios;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {

		// URI 1072
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);

		sc.close();
	}

}
