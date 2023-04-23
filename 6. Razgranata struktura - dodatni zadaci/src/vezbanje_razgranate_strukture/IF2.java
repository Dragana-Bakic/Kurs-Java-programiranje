package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class IF2 {

	public static void main(String[] args) {

		// Ispitivanje da li je broj pozitivan, negativan ili jednak nuli - IF

		// 1. deo: Unos podataka (uocavanje potrebnih ulaznih podataka)

		Scanner sc = new Scanner(System.in);

		int broj;

		System.out.println("Unesite broj: ");
		broj = sc.nextInt();

		// 2. deo: Obrada podataka

		if (broj > 0) {
			System.out.println("Broj je pozitivan. ");

		}
		if (broj < 0) {
			System.out.println("Broj je negativan. ");

		}

		if (broj == 0) {
			System.out.println("Uneti broj je nula.");
		}

		sc.close();
	}
}
