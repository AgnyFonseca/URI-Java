package uriDesafios;

import java.util.Scanner;

public class Uri1175 {

	public static void main(String[] args) {

		// URI 1175
		Scanner sc = new Scanner(System.in);
		int n[] = new int[20];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		int iFinal = n.length - 1;
		for (int i = 0; i < n.length / 2; i++) {
			int auxiliar = n[i];
			n[i] = n[iFinal];
			n[iFinal] = auxiliar;
			iFinal--;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println("N[" + i + "]" + " = " + n[i]);
		}

		sc.close();
	}
}
