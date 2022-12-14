package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {

		// URI 1019
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int horas = n / 3600;
		System.out.println(horas);
		n -= horas * 3600;
		int minutos = n / 60;
		n -= minutos * 60;
		System.out.printf("%d:%d:%d%n", horas, minutos, n);

		sc.close();
	}

}
