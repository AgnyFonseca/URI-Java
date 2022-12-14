package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {

		// URI 1020
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int idadeEmDias = sc.nextInt();
		int ano = idadeEmDias / 365;
		System.out.printf("%d ano(s)%n", ano);
		idadeEmDias -= ano * 365;
		int mes = idadeEmDias / 30;
		System.out.printf("%d mes(es)%n", mes);
		idadeEmDias -= mes * 30;
		System.out.printf("%d dia(s)%n", idadeEmDias);

		sc.close();
	}

}
