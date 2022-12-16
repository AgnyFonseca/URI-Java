package uriDesafios;

public class Uri1097 {

	public static void main(String[] args) {

		// URI 1097
		int i = 1;
		int j = 7;
		while (i <= 9) {
			for (int k = 0; k < 3; k++) {
				System.out.printf("I=%d J=%d%n", i, j);
				j--;
			}
			j += 5;
			i += 2;
		}
	}

}
