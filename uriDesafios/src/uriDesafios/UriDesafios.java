package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class UriDesafios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		//URI 1037
        	/*double num = sc.nextDouble();
        
        	if (num < 0 || num > 100) {
            	   	System.out.println("Fora de intervalo");
        	} else if (num >= 0 && num <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (num > 25 && num <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (num > 50 && num <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (num > 75 && num <=100) {
			System.out.println("Intervalo (75,100]");
		} */
		
		//URI 1038
		/*int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double preco = 0;
		double total;
		
		switch(codigo) {
		case 1:
			preco = 4.0;
			break;
		case 2:
			preco = 4.5;
			break;
		case 3:
			preco = 5.0;
			break;
		case 4:
			preco = 2.0;
			break;
		case 5:
			preco = 1.5;
			break;	
		}
		
		total = preco * qtd;
		System.out.printf("Total: R$ %.2f%n", total); */
		
		//URI 1040
		/*double n1, n2, n3, n4, media;
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
		} */
		
		//URI 1041
		/*double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}  else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		} */
		
		//URI 1042
		/*int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int min1 = 0;
		int min2 = 0;
		int min3 = 0;
		min1 = Math.min(X, Math.min(Y, Z));
		
		if (min1 == X) {
			min2 = Math.min(Y, Z);
			min3 = Math.max(Y, Z);
		}
		if (min1 == Y) {
			min2 = Math.min(X, Z);
			min3 = Math.max(X, Z);
		}
		if (min1 == Z) {
			min2 = Math.min(X, Y);
			min3 = Math.max(X, Y);
		}
		System.out.print(min1+"\n"+min2+"\n"+min3+"\n\n");
		System.out.print(X+"\n"+Y+"\n"+Z+"\n"); */
		
		//URI 1043
		/*double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double tri;
		double tra;
		
		if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {
		    	tri = a + b + c;
	            	System.out.printf("Perimetro = %.1f%n", tri);	
		} else {
	     	    	tra = (a + b) * c / 2;
		    	System.out.printf("Area = %.1f%n", tra);
		} */
		
		//URI 1044
		/*int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		} */
		
	        //URI 1045
		/*double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double aux;
		
		if (b > a && b > c) {
			aux = a;
			a = b;
			b = aux;
		} else if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}
		
		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (a*a == (b*b) + (c*c)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (a*a > (b*b) + (c*c)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (a*a < (b*b) + (c*c)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		} */
		
		//URI 1046
		/*int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao); */
		
		// URI 1047
		/*int horaInicial = sc.nextInt();
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
		*/
		
	        //URI 1048
		/*double salario = sc.nextDouble();
		double aumento = 0;
		double reajuste = 0;
		
		if (salario <= 400) {
			aumento = 15;
			reajuste = (salario * aumento /100);
			salario = salario + reajuste;
		} else if (salario > 400 && salario <= 800) {
			aumento = 12;
			reajuste = (salario * aumento /100);
			salario = salario + reajuste;
		} else if (salario > 800 && salario <= 1200) {
			aumento = 10;
			reajuste = (salario * aumento /100);
			salario = salario + reajuste;
		} else if (salario > 1200 && salario <= 2000) {
			aumento = 7;
			reajuste = (salario * aumento /100);
			salario = salario + reajuste;
		} else {
			aumento = 4;
			reajuste = (salario * aumento /100);
			salario = salario + reajuste;
		}
		
		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + (int) aumento + " %");
		*/
		
		//URI 1049
		/*String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
				
		if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {
			System.out.println("aguia");
		} 
		if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
			System.out.println("pomba");
		}
		if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
			System.out.println("homem");
		} 
		if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {
			System.out.println("vaca");
		}
		if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {
			System.out.println("pulga");
		}
		if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")) {
			System.out.println("minhoca");
		} */
		
	        //URI 1050
		/*int d = sc.nextInt();
		
		switch (d) {
		case 61:
			System.out.println("Brasilia");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("Sao Paulo");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 27:
			System.out.println("Vitoria");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD nao cadastrado");
			break;
		} */
		
		//URI 1051
		/*double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		} */
		
		//URI 1052
		/*int x = sc.nextInt();
		String m = " ";
		
		switch (x) {
		case 1:
			m = "January";
			break;
		case 2:
			m = "February";
			break;
		case 3:
			m = "March";
			break;
		case 4:
			m = "April";
			break;
		case 5:
			m = "May";
			break;
		case 6:
			m = "June";
			break;
		case 7:
			m = "July";
			break;
		case 8:
			m = "August";
			break;
		case 9:
			m = "September";
			break;
		case 10:
			m = "October";
			break;
		case 11:
			m = "November";
			break;
		case 12:
			m = "December";
			break;
		}
				
		System.out.println(m);	*/
		
		//URI 1059
		/*for (int i = 2; i <= 100; i+=2) {
			System.out.printf("%d%n", i);
		}*/
		
		//URI 1060
		/*double[] num = new double[6];
		double contador = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
			
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				contador++;			
			}
		}
		
		System.out.printf("%.0f valores positivos%n", contador);
		*/
		
		//URI 1064
		/*double n;
		double c = 0;
		double media = 0;
				
		for (int i = 0; i < 6; i++) {
			n = sc.nextDouble();
			if (n > 0) {
				c++;
				media += n;
			}
		}
		media = media / c;
				
		System.out.printf("%.0f valores positivos%n", c);
		System.out.printf("%.1f%n", media); */
		
		//URI 1065
		/*int[] num = new int[5];
		int c = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				c++;
			}
		}
		System.out.printf("%d valores pares%n", c); */
		
		//URI 1066
		/*int num;
		int par = 0;
		int imp = 0;
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				imp++;
			}
			if (num > 0) {
				pos++;
			} else if (num < 0) {
				neg++;
			}
		}
		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", imp);
		System.out.printf("%d valor(es) positivo(s)%n", pos);
		System.out.printf("%d valor(es) negativo(s)%n", neg);
		*/
		
		//URI 1067
		
		/*int x = sc.nextInt();
		for (int i = 1; i <= x; i += 2) {
			System.out.printf("%d%n", i);
		} */
		
		//URI 1070
		
		/*int x = sc.nextInt();
		int c = 0;
		
		while (c < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				c++;
			}
			x++;
		}*/
		
		//URI 1071
		/*int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
				
		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma); */
		
		//URI 1072
		/*int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out); */
		
		//URI 1073
		/*int n = sc.nextInt();
		for (int i = 2; i <= n; i += 2) {
			if (i % 2 == 0) {
				double q = Math.pow(i, 2);
				System.out.printf("%d^2 = %d%n", i, (int) q);
			}
			
		}*/
		
		//URI 1074
		/*int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x == 0) {
				System.out.println("NULL");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			} 
		}*/
		
		//URI 1075
		/*int n = sc.nextInt();
		
		for (int i = 0; i < 10000; i++) {
			if (i % n == 2) {
				System.out.println(i); 
			}
		}*/
		
		//URI 1078
		/*int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", i, n, i*n);
		} */
		
		//URI 1079
		/*int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			double media = ((x * 2) + (y * 3) + (z * 5)) / 10;
			System.out.printf("%.1f%n",media);
			
		}*/
		
		//URI 1080
		/*int n = 0;
		int maior = 0;
		int posicao = 0;
		
		for (int i = 1; i <= 100; i++) {
			n = sc.nextInt();
			if (n == maior) {
				maior = n;
				posicao = i;
			} else if (n > maior) {
				maior = n;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);*/
		
		//URI 1094
		/*int n = sc.nextInt();
		int coelho = 0;
		int rato = 0;
		int sapo = 0;
		String x = " ";
		int aux = 0;
		int total = 0;
		double percentC, percentR, percentS;
		
		for (int i = 1; i <= n; i++) {
			aux = sc.nextInt();
			x = sc.next();
			switch(x) {
			case "C":
				coelho += aux;
				break;
			case "R":
				rato += aux;
				break;
			case "S":
				sapo += aux;
				break;
			}
			
			total = coelho + rato + sapo;
			
		}
		
		percentC = coelho * 100.00 / total;
		percentR = rato * 100.00 / total;
		percentS = sapo * 100.00 / total;
		
		System.out.printf("Total: %d cobaias%n", total);
		System.out.printf("Total de coelhos: %d%n", coelho);
		System.out.printf("Total de ratos: %d%n", rato);
		System.out.printf("Total de sapos: %d%n", sapo);
		System.out.printf("Percentual de coelhos: %.2f", percentC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", percentR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", percentS);
		System.out.print(" %\n");
		*/

		//URI 1095
		/*int i = 1;
		int j = 60;
		
		System.out.printf("I=%d", i);
		System.out.printf(" J=%d%n", j);
		do {
			System.out.printf("I=%d", i+=3);
			System.out.printf(" J=%d%n", j-=5);
		} while (j != 0); */
		
		//URI 1096
		/*int i = 1;
		while (i <= 9) {
			for (int j = 7; j > 4; j--) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
			i+=2;
		} */
		
		//URI 1096
		/*int i = 1;
		do {
			for (int j = 7; j > 4; j--) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
				
			i+= 2;
		} while (i <= 9); */
		
		//URI 1097
		/*int i = 1;
		int j = 7;
		while (i <= 9) {
			for (int k = 0; k < 3; k++) {
				System.out.printf("I=%d J=%d%n", i, j);
				j--;
			}
			j+=5;
			i+=2;
		} */
		
		//URI 1098
		/*double i = 0;
		double j = 1;
		while (i <= 2) {
			for (int k = 0; k < 3; k++) {
				if (i == 0 || i == 1 || i >= 1.9) {
					System.out.println("I=" + Math.round(i) + " J=" + Math.round(j));
				} else {
					System.out.printf("I=%.1f J=%.1f%n", i, j);
				}
				j++;
			}
			j-=3.0;
			j = j + 0.2;
			i = i + 0.2;			
		} */
		
		//URI 1099
		/*int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int soma;
		
		for (int i = 0; i < n; i++) {
			soma = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (y > x) {
				for (int j = x+1; j < y; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			
			} else {
				for (int j = y+1; j < x; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			}
			
			System.out.println(soma);
		} */
		
		//URI 1101
		/*int m;
		int n;
		
		while (((m = sc.nextInt()) > 0) && ((n = sc.nextInt()) > 0)) {
			int x = 0;
			
			if (m > n) {
				for (int i = n; i <= m; i++) {
					System.out.printf("%d ", i);
					 x += i;
				}
				System.out.printf("Sum=%d%n", x);
			} else {
				for (int j = m; j <= n; j++) {
					System.out.printf("%d ", j);
					x += j;
				}
				System.out.printf("Sum=%d%n", x);
			}
			
		} */
		
		//URI 1113
		/*int x;
		int y;
		
		while ((x = sc.nextInt()) != (y = sc.nextInt())) {
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
		} */

		//URI 1114
		/*int senha = 2002;
		int x = 0;
		
		do {
			x = sc.nextInt();
			if (x != senha) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso Permitido");
			}
			
		} while (x != senha); */
		
		//URI 1115
		/*int x;
		int y;
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
		} while (x != 0 && y != 0); */
		
		//URI 1116
		/*int n = sc.nextInt();
		int x;
		int y;
		double resp;
		
		for (int i = 0; i < n; i++) {
			x = 0;
			y = 0;
			resp = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				resp = (double) x / y;
				System.out.printf("%.1f%n", resp);
			}
		} */
		
		//URI 1117
		/*double nota;
		double media = 0.0;
		double total = 0.0;
		int contador = 0;
		
		while (contador != 2) {
			nota = sc.nextDouble();
			
			if (nota >= 0.0 && nota <= 10.0) {
				total += nota;
				contador++;
			} else {
				System.out.println("nota invalida");
			}
		}
		media = total / 2;
		System.out.printf("media = %.2f%n", media);
		*/
		
		//URI 1118
		/*double nota;
		double media;
		double total;
		int contador;
		int sentinela;
		
		do {
			nota = 0.0;
			media = 0.0;
			total = 0.0;
			contador = 0;
			sentinela = 0;
			
			while (contador != 2) {
				nota = sc.nextDouble();
				
				if (nota >= 0.0 && nota <= 10.0) {
					total += nota;
					contador++;
				} else {
					System.out.println("nota invalida");
				}
			}
			media = total / 2;
			System.out.printf("media = %.2f%n", media);
			
			System.out.println("novo calculo (1-sim 2-nao)");
			sentinela = sc.nextInt();
			
			while (sentinela < 1 || sentinela > 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				sentinela = sc.nextInt();
			}
			
		} while (sentinela != 2); */

		//URI 1131
		/*int inter;
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
		} */
		
		//URI 1132
		/*int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		
		if (x > y) {
			for (int i = y; i <= x; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i = x; i <= y; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma); */
		
		//URI 1133
		/*int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			for (int i = y+1; i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		
		} else if (y > x) {
			for (int i = x+1; i < y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}	
			}
		} */
		
		//URI 1134
		/*int n = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (n != 4) { 
			n = sc.nextInt();
			switch (n) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel); */
		
		//URI 1142
		/*int n = sc.nextInt();
		int c = 1;
		int p = 0;
		
		while (c <= n) {
			System.out.println((p+1) + " " + (p+2) + " " + (p+3) + " PUM");
			p+=4;
			
			c++;
		} */
		
		//URI 1142
		/*int n = sc.nextInt();
		int p = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println((p+1) + " " + (p+2) + " " + (p+3) + " PUM");
			p+=4;
		} */
		
		//URI 1143
		/*int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
		} */
		
		//URI 1145
		/*int x = sc.nextInt();
		int y = sc.nextInt();
		int i = 1;
		
		while (i <= y) {
			for (int j = 0; j < x; j++) {
				System.out.printf("%d", i);
				if (i % x == 0) {
					System.out.print("");
				} else {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
		} */
		
		//URI 1146
		/*int x = sc.nextInt();
		
		while (x != 0) {
			for (int i = 1; i <= x; i++) {
				if (i == x) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + " ");
				}
			}
			x = sc.nextInt();
		} */

		//URI 1151
		/*int f1 = 0;
		int f2 = 1;
		int f3;
		int n = sc.nextInt();
		
		System.out.print(f1 + " " + f2);
		
		for (int i = 2; i < n; ++i) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
		}
		System.out.print("\n"); */
		
		//URI 1176
		/*long[] fibonacci = new long[61];
		int teste = sc.nextInt();
		int n;
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i <= 60; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
		}
		
		for (int j = 0; j < teste; j++) {
			n = sc.nextInt();
			System.out.printf("Fib(%d) = %d%n", n, fibonacci[n]);
		} */
		
		//URI 1149
		/*int a = sc.nextInt();
		int n = sc.nextInt();
		int soma = 0;
		
		while (n <= 0) {
			n = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			soma += a;
			a++;
		}
		System.out.println(soma); */
		
		//URI 1150
		/*int x = sc.nextInt();
		int z = sc.nextInt();
		int contador = 0;
		int soma = 0;
		
		while (z <= x) {
			z = sc.nextInt();
		}
		
		while (soma < z) {
			soma += x;
			contador++;
			x++;
		}
		System.out.println(contador); */
		
		//URI 1153
		/*int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial); */
		
		//URI 1154
		/*int x = sc.nextInt();
		int soma = 0;
		int c = 0;
		double media;
		
		while (x > 0) {
			soma += x;
			c++;
			x = sc.nextInt();
		}
		
		media = (double) soma / c;
		System.out.printf("%.2f%n", media); */
		
		//URI 1155
		/*double s = 1;
		
		for (int i = 2; i <= 100; i++) {
			s = (double) s + 1.0/i;
		}
		System.out.printf("%.2f%n", s); */
		
		//URI 1156
		/*double s = 1.0;
		double x = 2.0;
		
		for (int i = 3; i <= 39; i+=2) {
			s = s + i/x;
			x = x * 2;	
		}
		System.out.printf("%.2f%n",s); */
		
		//URI 1157
		/*int n = sc.nextInt();
		int i = 1;
		
		while (i <= n) {
			if (n % i == 0) {
				System.out.println(i);
			}
			i++;
		} */
		
		//URI 1158
		/*int n = sc.nextInt();
		int x, y, j, total, soma;
		
		for (int i = 1; i <= n; i++) {
			soma = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			
			for (j = x, total = 0; total < y; j++) {
				if (j % 2 != 0) {
					soma += j;
					total += 1;
				}
			}
			System.out.println(soma);
		} */

		//URI 1159
		/*int x = sc.nextInt();
		
		while (x != 0) {
			int total = 0;
			for (int i = 1; i <= 5; i++) {
				if (x % 2 != 0) {
					x++;
				}
				if (x % 2 == 0) {
					total += x;
				}
				x += 2;
			}
			System.out.println(total);
			x = sc.nextInt();
		} */

		//URI 1160
		/*int teste = sc.nextInt();
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
		} */

		//URI 1164
		/*int n = sc.nextInt();
		int perfeito, x;
		
		for (int i = 1; i <= n; i++) {
			perfeito = 0;
			x = sc.nextInt();
			
			for (int j = 1; j < x; j++) {
				if (x % j == 0) {
					perfeito += j;
				}
			}
			if (perfeito == x) {
				System.out.println(x + " eh perfeito");
			} else {
				System.out.println(x + " nao eh perfeito");
			}
		} */

		//URI 1165
		/*int n = sc.nextInt();
		int c, x;
		
		for (int i = 1; i <= n; i++) {
			c = 0;
			x = sc.nextInt();
			
			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					c++;
				}
			}
			if (c == 0) {
				System.out.println(x + " eh primo");
			} else {
				System.out.println(x + " nao eh primo");
			}
		} */

		//URI 1172
		/*int[] vet = new int[10];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] <= 0) {
				vet[i] = 1;
			}
			System.out.println("X[" + i + "] = " + vet[i]);
		} */

		//URI 1173
		/*int[] vet = new int[10];
		
		for (int i = 0; i < vet.length; i++) {
			if (i == 0) {
				vet[i] = sc.nextInt();
			} else {
				vet[i] = vet[i - 1] * 2;
			}
			System.out.println("N[" + i + "] = " + vet[i]);
		} */

		//URI 1174
		/*double[] a = new double[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		
		for (int j = 0; j < a.length; j++) {
			if (a[j] <= 10) {
				System.out.printf("A[%d] = %.1f%n", j, a[j]);
			}
		} */

		//URI 1175
		/*int n[] = new int[20];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		int iFinal = n.length - 1;
		for (int i = 0; i < n.length / 2; i++) {
			int auxiliar = n[i];
			n[i] = n[iFinal];
			n[iFinal] = auxiliar;
			iFinal--;
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("N[" + i + "]" + " = " + n[i]);
		} */

		//URI 1177
		/*int[] n = new int [1000];
		int t = sc.nextInt();
		int c = 0;
		
		for (int i = 0; i < n.length; i++) {
			if (c < t) {
				System.out.printf("N[%d] = %d%n", i, c);
				c++;
			} 
			if (c == t) {
				c = 0;
			}
		} */

		//URI 1178
		/*double[] n = new double[100];
		double x = sc.nextDouble();
		n[0] = x;
		
		for (int i = 0; i < n.length; i++) {
			if (i == 0) {
				System.out.printf("N[%d] = %.4f%n", i, n[i]);
			}
			else {
				x = x / 2.0;
				n[i] = x;
				System.out.printf("N[%d] = %.4f%n", i, n[i]);
			}
		} */

		//URI 1179
		/*int[] par = new int[5];
		int[] impar = new int[5];
		int cPar = 0, cImpar = 0;
		
		for (int i = 0; i < 15; i++) {
			if(cPar == 5) {
				for (int k = 0; k < cPar; k++) {
					System.out.println("par[" + k + "] = " + par[k]);
				}
				cPar = 0;
			
			} else if(cImpar == 5) {
				for (int j = 0; j < cImpar; j++) {
					System.out.println("impar[" + j + "] = " + impar[j]);
				}
				cImpar = 0;
			}
			
			int n = sc.nextInt();
			
			if (n % 2 == 0) {
				par[cPar] = n;
				cPar++;
			
			} else {
				impar[cImpar] = n;
				cImpar++;
			}
		}
		
		for (int i = 0; i < cImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
		}
		
		for (int i = 0; i < cPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
		} */
		
		//URI 1179
		/*int x, cPar = 0, cImpar = 0;
		int[] par = new int[5];
		int[] impar = new int[5];
		
		for (int i = 0; i < 15; i++) {
			x = sc.nextInt();
			
			if (x % 2 == 0) {
				par[cPar] = x;
				cPar++;
			} else {
				impar[cImpar] = x;
				cImpar++;
			}
			
			if (cPar == 5) {
				cPar = 0;
				for (int j = 0; j < par.length; j++) {
					System.out.println("par[" + j + "] = " + par[j]);
				}
				
			} else if (cImpar == 5) {
				cImpar = 0;
				for (int j = 0; j < impar.length; j++) {
					System.out.println("impar[" + j + "] = " + impar[j]);
				}
			}
		}
		
		for (int i = 0; i < cImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
		}
		
		for (int i = 0; i < cPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
		} */

		//URI 1180
		/*int n = sc.nextInt();
		int[] x = new int[n];
		int iMenor = 0, menor = 0;
		
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			
			if (i == 0) {
				menor = x[i];
				iMenor = i;
			}
			
			else if (x[i] < menor) {
				menor = x[i];
				iMenor = i;
			}
		}
		System.out.printf("Menor valor: %d%n", menor);
		System.out.printf("Posicao: %d%n", iMenor); */
		
		//URI 1181
		/*double[][] mat = new double[12][12];
		int linha = sc.nextInt();
		double soma = 0.0;
		char t = sc.next().toUpperCase().charAt(0);
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			soma += mat[linha][i];
		}
				
		if (t == 'M') {
			soma /= mat.length;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1182
		/*double[][] mat = new double[12][12];
		int coluna = sc.nextInt();
		double soma = 0.0;
		char t = sc.next().toUpperCase().charAt(0);
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			soma += mat[i][coluna];
		}
				
		if (t == 'M') {
			soma /= mat.length;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1183
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j > i) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= ((mat.length * mat.length) - 12) / 2;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1184
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j < i) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= ((mat.length * mat.length) - 12) / 2;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1185
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j < mat.length-i-1) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= ((mat.length * mat.length) - 12) / 2;
		}
		System.out.println(String.format("%.1f", soma)); */
		
		//URI 1186
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j > mat.length-i-1) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= ((mat.length * mat.length) - 12) / 2;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1187
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j > i && j < mat.length-i-1) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= 30;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1188
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j < i && j > mat.length-i-1) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= 30;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1189
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j < i && j < mat.length-i-1) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= 30;
		}
		System.out.println(String.format("%.1f", soma)); */
				
		//URI 1190
		/*char ch = sc.next().toUpperCase().charAt(0);
		double[][] mat = new double[12][12];
		double soma = 0;
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j > i && j > mat.length-i-1) soma += mat[i][j];
			}
		}
				
		if (ch == 'M') {
			soma /= 30;
		}
		System.out.println(String.format("%.1f", soma)); */
		
		//URI 1435
		/*int n = sc.nextInt();
		int x;

		while (n != 0) {

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					x = i;
					
					if (j < x) {
						x = j;
					}
					if (n-i+1 < x) {
						x = n-i+1;
					}
					if (n-j+1 < x) {
						x = n-j+1;
					}
					
					System.out.printf("%3d", x);
					if (j < n) {
						System.out.print(" ");
					} else {
						System.out.print("\n");
					}
				}
			}
			System.out.print("\n");
			n = sc.nextInt();
		} */
		
		//URI 1478
		/*int n = sc.nextInt();

		while (n != 0) {

			int[][] mat = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					mat[i][j] = 1 + Math.abs(i - j);
				}
			}

			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < n; i++) {
				sb.append(String.format("%3d", mat[i][0]));
				for (int j = 1; j < n; j++) {
					sb.append(String.format(" %3d", mat[i][j]));
				}
				sb.append(System.lineSeparator());
			}
			System.out.println(sb);

			n = sc.nextInt();
		} */
		
		//URI 1534
		/*int n;

		while (sc.hasNext()) {
			n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (i + j == (n - 1)) {
						System.out.print("2");
					} else if (i == j) {
						System.out.print("1");
					} else {
						System.out.print("3");
					}
				}
				System.out.println("");
			}
		} */
		
		//URI 1557
		/*int n = sc.nextInt();
		int x, t, y;

		while (n != 0) {

			int[][] mat = new int[n][n];
			x = 1;

			for (int i = 1; i <= n; i++) {
				y = x;
				for (int j = 1; j <= n; j++) {
					mat[i - 1][j - 1] = y;
					y *= 2;
				}
				x *= 2;
			}

			t = String.valueOf(mat[n - 1][n - 1]).length();

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.printf("%" + t + "d", mat[i - 1][j - 1]);
					if (j < n) {
						System.out.print(" ");
					} else {
						System.out.print("\n");
					}
				}
			}
			System.out.print("\n");
			n = sc.nextInt();
		} */
		
		//URI 1564
		/*int n;

		while (sc.hasNext()) {
			n = sc.nextInt();

			if (n == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		} */
		
		//URI 1759
		/*int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (i != n) {
				System.out.print("Ho ");
			} else if (i == n) {
				System.out.print("Ho!\n");
			}
		} */
		
		sc.close();
	}
}
