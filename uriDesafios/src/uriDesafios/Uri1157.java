package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1157 {

	public static void main(String[] args) {

		// URI 1157
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		while (i <= n) {
			if (n % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		sc.close();
	}
}
