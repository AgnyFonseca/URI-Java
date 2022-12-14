package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {

		// URI 1017
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horas = sc.nextInt();
		int velocidade = sc.nextInt();
		double litros = (double) velocidade / 12 * horas;
		System.out.printf("%.3f%n", litros);

		sc.close();
	}

}
