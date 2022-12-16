package uriDesafios;

import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {

		// URI 1065
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int c = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				c++;
			}
		}
		System.out.printf("%d valores pares%n", c);

		sc.close();
	}

}
