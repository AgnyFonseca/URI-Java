package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {

		// URI 1018
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("%d%n", n);
		System.out.printf("%d nota(s) de R$ 100,00%n", n / 100);
		n %= 100;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 50,00%n", n / 50);
		n %= 50;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 20,00%n", n / 20);
		n %= 20;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 10,00%n", n / 10);
		n %= 10;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 5,00%n", n / 5);
		n %= 5;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 2,00%n", n / 2);
		n %= 2;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 1,00%n", n / 1);

		sc.close();
	}

}
