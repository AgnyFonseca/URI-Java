package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {

		// URI 1046
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

		sc.close();
	}

}
