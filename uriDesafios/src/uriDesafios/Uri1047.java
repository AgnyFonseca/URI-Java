package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {

		// URI 1047
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		int totH = horaFinal - horaInicial;
		int totM = minutoFinal - minutoInicial;

		if (totH < 0) {
			totH = 24 + (horaFinal - horaInicial);
		}
		if (totM < 0) {
			totM = 60 + (minutoFinal - minutoInicial);
			totH--;
		}

		if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totH, totM);
		}

		sc.close();
	}

}
