package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class IF5 {

	public static void main(String[] args) {

		// Za uneti broj ispitati da li je broj pozitivan, negativan ili jedank 0.
		// za vise slucajeva
		// if-else

		Scanner sc = new Scanner(System.in);

		int broj;

		System.out.println("Unesite broj: ");
		broj = sc.nextInt();

		if (broj > 0) {
			System.out.println("Broj je pozitivan!");

		} else if (broj < 0) {
			System.out.println("Broj je negativan!");

		} else if (broj == 0) {
			System.out.println("Broj je nula!");

		} else {
			System.out.println("Pogresan unos!");
		}

		sc.close();
	}

}
