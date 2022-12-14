package uriDesafios;

import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {

		// URI 1007
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int DIFERENCA = (A * B - C * D);
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);

		sc.close();
	}

}
