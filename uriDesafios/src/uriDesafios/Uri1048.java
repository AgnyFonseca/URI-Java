package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {

		// URI 1048
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double aumento = 0;
		double reajuste = 0;

		if (salario <= 400) {
			aumento = 15;
			reajuste = (salario * aumento / 100);
			salario = salario + reajuste;
		} else if (salario > 400 && salario <= 800) {
			aumento = 12;
			reajuste = (salario * aumento / 100);
			salario = salario + reajuste;
		} else if (salario > 800 && salario <= 1200) {
			aumento = 10;
			reajuste = (salario * aumento / 100);
			salario = salario + reajuste;
		} else if (salario > 1200 && salario <= 2000) {
			aumento = 7;
			reajuste = (salario * aumento / 100);
			salario = salario + reajuste;
		} else {
			aumento = 4;
			reajuste = (salario * aumento / 100);
			salario = salario + reajuste;
		}

		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + (int) aumento + " %");

		sc.close();
	}

}
