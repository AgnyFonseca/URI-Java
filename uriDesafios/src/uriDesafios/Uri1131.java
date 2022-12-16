package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1131 {

	public static void main(String[] args) {

		// URI 1131
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int inter;
		int gremio;
		int interContador = 0;
		int gremioContador = 0;
		int grenal = 0;
		int empates = 0;
		int flag = 0;

		while (flag != 2) {
			inter = sc.nextInt();
			gremio = sc.nextInt();
			grenal++;

			if (inter > gremio) {
				interContador++;
			} else if (gremio > inter) {
				gremioContador++;
			} else {
				empates++;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			flag = sc.nextInt();

		}

		System.out.printf("%d grenais%n", grenal);
		System.out.printf("Inter:%d%n", interContador);
		System.out.printf("Gremio:%d%n", gremioContador);
		System.out.printf("Empates:%d%n", empates);

		if (interContador > gremioContador) {
			System.out.println("Inter venceu mais");
		} else {
			System.out.println("Gremio venceu mais");
		}

		sc.close();
	}
}
