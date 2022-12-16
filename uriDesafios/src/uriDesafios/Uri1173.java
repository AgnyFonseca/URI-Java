package uriDesafios;

import java.util.Scanner;

public class Uri1173 {

	public static void main(String[] args) {

		// URI 1173
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {
			if (i == 0) {
				vet[i] = sc.nextInt();
			} else {
				vet[i] = vet[i - 1] * 2;
			}
			System.out.println("N[" + i + "] = " + vet[i]);
		}
		
		sc.close();
	}
}
