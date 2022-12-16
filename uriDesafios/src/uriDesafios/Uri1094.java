package uriDesafios;

import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {

		// URI 1094
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int coelho = 0;
		int rato = 0;
		int sapo = 0;
		String x = " ";
		int aux = 0;
		int total = 0;
		double percentC, percentR, percentS;

		for (int i = 1; i <= n; i++) {
			aux = sc.nextInt();
			x = sc.next();
			switch (x) {
			case "C":
				coelho += aux;
				break;
			case "R":
				rato += aux;
				break;
			case "S":
				sapo += aux;
				break;
			}

			total = coelho + rato + sapo;

		}

		percentC = coelho * 100.00 / total;
		percentR = rato * 100.00 / total;
		percentS = sapo * 100.00 / total;

		System.out.printf("Total: %d cobaias%n", total);
		System.out.printf("Total de coelhos: %d%n", coelho);
		System.out.printf("Total de ratos: %d%n", rato);
		System.out.printf("Total de sapos: %d%n", sapo);
		System.out.printf("Percentual de coelhos: %.2f", percentC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", percentR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", percentS);
		System.out.print(" %\n");

		sc.close();
	}

}
