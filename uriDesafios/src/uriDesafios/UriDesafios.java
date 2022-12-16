package uriDesafios;

import java.util.Locale;
import java.util.Scanner;

public class UriDesafios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
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
