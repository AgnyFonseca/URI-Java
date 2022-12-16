package uriDesafios;

public class Uri1096 {

	public static void main(String[] args) {

		// URI 1096
		int i = 1;
		while (i <= 9) {
			for (int j = 7; j > 4; j--) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
			i += 2;
		}

		// URI 1096
		/*
		 * int i = 1; do { for (int j = 7; j > 4; j--) {
		 * System.out.printf("I=%d J=%d%n", i, j); }
		 * 
		 * i+= 2; } while (i <= 9);
		 */
	}

}
