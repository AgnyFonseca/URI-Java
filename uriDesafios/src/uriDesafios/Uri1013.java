package uriDesafios;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {

		// URI 1013
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior;

		if (a > b && a > c) {
			maior = a;
		} else if (b > c) {
			maior = b;
		} else {
			maior = c;
		}
		System.out.printf("%d eh o maior%n", maior);

		sc.close();
	}

}
