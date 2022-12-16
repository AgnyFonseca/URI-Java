package uriDesafios;

import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {

		// URI 1134
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (n != 4) {
			n = sc.nextInt();
			switch (n) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();
	}
}
