package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1114 {

	public static void main(String[] args) {

		// URI 1114
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int x = 0;

		do {
			x = sc.nextInt();
			if (x != senha) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso Permitido");
			}

		} while (x != senha);
		
		sc.close();
	}
}
