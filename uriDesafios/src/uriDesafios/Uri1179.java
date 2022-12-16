package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1179 {

	public static void main(String[] args) {

		// URI 1179
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] par = new int[5];
		int[] impar = new int[5];
		int cPar = 0, cImpar = 0;

		for (int i = 0; i < 15; i++) {
			if (cPar == 5) {
				for (int k = 0; k < cPar; k++) {
					System.out.println("par[" + k + "] = " + par[k]);
				}
				cPar = 0;

			} else if (cImpar == 5) {
				for (int j = 0; j < cImpar; j++) {
					System.out.println("impar[" + j + "] = " + impar[j]);
				}
				cImpar = 0;
			}

			int n = sc.nextInt();

			if (n % 2 == 0) {
				par[cPar] = n;
				cPar++;

			} else {
				impar[cImpar] = n;
				cImpar++;
			}
		}

		for (int i = 0; i < cImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
		}

		for (int i = 0; i < cPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
		}

		sc.close();
	}
}
