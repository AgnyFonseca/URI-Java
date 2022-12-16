package uriDesafios;

import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {

		// URI 1080
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int maior = 0;
		int posicao = 0;

		for (int i = 1; i <= 100; i++) {
			n = sc.nextInt();
			if (n == maior) {
				maior = n;
				posicao = i;
			} else if (n > maior) {
				maior = n;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);

		sc.close();
	}

}
