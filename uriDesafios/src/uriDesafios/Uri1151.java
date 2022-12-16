package uriDesafios;

import java.util.Scanner;

public class Uri1151 {

	public static void main(String[] args) {

		// URI 1151
		Scanner sc = new Scanner(System.in);
		int f1 = 0;
		int f2 = 1;
		int f3;
		int n = sc.nextInt();

		System.out.print(f1 + " " + f2);

		for (int i = 2; i < n; ++i) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
		}
		System.out.print("\n");

		sc.close();
	}
}
