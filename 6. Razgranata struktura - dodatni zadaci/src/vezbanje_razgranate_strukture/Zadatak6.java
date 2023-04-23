package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		// Test - ocenjivanje, skala ocenjivanja je:

		// 0-49 je ocena 1
		// 50-60 je ocena 2
		// 61-69 je ocena 3
		// 70-80 je ocena 4
		// 81-100 je ocena 5
		// ostalo je greska

		// Prikazati koja ocena se dobija na testu na osnovu ostvarenih bodova.

		Scanner db = new Scanner(System.in);

		int bodovi;

		System.out.print("Unesite vrednost bodova na testu: ");
		bodovi = db.nextInt();

		if (bodovi >= 0 && bodovi < 50) {
			System.out.println("Vasa ocena na testu je 1.");
		} else if (bodovi >= 50 && bodovi <= 60) {
			System.out.println("Vasa ocena na testu je 2.");
		} else if (bodovi >= 61 && bodovi <= 69) {
			System.out.println("Vasa ocena na testu je 3.");
		} else if (bodovi >= 70 && bodovi <= 80) {
			System.out.println("Vasa ocena na testu je 4.");
		} else if (bodovi > 80 && bodovi <= 100) {
			System.out.println("Vasa ocena na testu je 5.");
		} else {
			System.out.println("Greska");

		}

		db.close();
	}

}
