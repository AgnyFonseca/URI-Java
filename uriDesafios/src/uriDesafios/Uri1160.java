package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1160 {

	public static void main(String[] args) {

		// URI 1160
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int teste = sc.nextInt();
		int pa, pb, anos;
		double g1, g2;

		for (int i = 1; i <= teste; i++) {
			anos = 0;
			pa = sc.nextInt();
			pb = sc.nextInt();
			g1 = sc.nextDouble();
			g2 = sc.nextDouble();
			while (pb >= pa) {
				pa += (pa * g1) / 100;
				pb += (pb * g2) / 100;
				anos++;
				if (anos > 100) {
					break;
				}
			}
			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(anos + " anos.");
			}
		}

		sc.close();
	}
}
