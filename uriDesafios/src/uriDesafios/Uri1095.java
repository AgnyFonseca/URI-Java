package uriDesafios;

public class Uri1095 {

	public static void main(String[] args) {

		// URI 1095
		int i = 1;
		int j = 60;

		System.out.printf("I=%d", i);
		System.out.printf(" J=%d%n", j);
		do {
			System.out.printf("I=%d", i += 3);
			System.out.printf(" J=%d%n", j -= 5);
		} while (j != 0);
	}

}
