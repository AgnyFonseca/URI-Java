package uriDesafios;

import java.util.Scanner;

public class Uri1149 {

	public static void main(String[] args) {

		// URI 1149
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int soma = 0;

		while (n <= 0) {
			n = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			soma += a;
			a++;
		}
		System.out.println(soma);

		sc.close();
	}
}
