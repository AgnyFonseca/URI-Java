package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {

		// URI 1040
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

		System.out.printf("Media: %.1f%n", media);

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em exame.");
			double notaExame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			media = (media + notaExame) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado");
			}
			System.out.printf("Media final: %.1f%n", media);

		} else {
			System.out.println("Aluno reprovado.");
		}

		sc.close();
	}

}
