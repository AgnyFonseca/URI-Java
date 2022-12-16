package uriDesafios;

import java.util.Scanner;

public class Uri1150 {

	public static void main(String[] args) {

		// URI 1150
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z = sc.nextInt();
		int contador = 0;
		int soma = 0;

		while (z <= x) {
			z = sc.nextInt();
		}

		while (soma < z) {
			soma += x;
			contador++;
			x++;
		}
		System.out.println(contador);

		sc.close();
	}
}
