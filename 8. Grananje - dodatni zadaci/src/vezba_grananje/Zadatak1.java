package vezba_grananje;

import java.util.Scanner;

public class Zadatak1 {

	// Ugnjezdeni IF - najveci broj

	public static void main(String[] args) {

		// 1. Unos podataka
		Scanner db = new Scanner(System.in);

		int najveciBroj;

		System.out.print("Unesite prvi broj: ");
		int br1 = db.nextInt();

		System.out.print("Unesite drugi broj: ");
		int br2 = db.nextInt();

		System.out.print("Unesite treći broj: ");
		int br3 = db.nextInt();

		// 2. Obrada podataka

		if (br1 > br2) {
			if (br1 > br3) {
				najveciBroj = br1;
			} else {
				najveciBroj = br3;
			}
		} else {
			if (br2 > br3) {
				najveciBroj = br2;
			} else {
				najveciBroj = br3;
			}
		}

		// 3. Ispisivanje vrednosti

		System.out.println("Najveći od unetih brojeva je: " + najveciBroj);

		db.close();
	}

}
