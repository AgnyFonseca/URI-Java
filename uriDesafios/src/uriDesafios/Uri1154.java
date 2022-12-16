package uriDesafios;

import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {

		// URI 1154
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		int c = 0;
		double media;

		while (x > 0) {
			soma += x;
			c++;
			x = sc.nextInt();
		}

		media = (double) soma / c;
		System.out.printf("%.2f%n", media);

		sc.close();
	}
}
