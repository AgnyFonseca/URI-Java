package uriDesafios;

import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) {

		// URI 1066
		Scanner sc = new Scanner(System.in);
		int num;
		int par = 0;
		int imp = 0;
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				imp++;
			}
			if (num > 0) {
				pos++;
			} else if (num < 0) {
				neg++;
			}
		}
		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", imp);
		System.out.printf("%d valor(es) positivo(s)%n", pos);
		System.out.printf("%d valor(es) negativo(s)%n", neg);

		sc.close();
	}

}
