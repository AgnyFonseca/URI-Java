package uriDesafios;

import java.util.Scanner;

public class Uri1052 {

	public static void main(String[] args) {

		// URI 1052
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
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

		System.out.println(m);

		sc.close();
	}

}
