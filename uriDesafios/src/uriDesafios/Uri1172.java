package uriDesafios;

import java.util.Scanner;

public class Uri1172 {

	public static void main(String[] args) {

		// URI 1172
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] <= 0) {
				vet[i] = 1;
			}
			System.out.println("X[" + i + "] = " + vet[i]);
		}

		sc.close();
	}
}
