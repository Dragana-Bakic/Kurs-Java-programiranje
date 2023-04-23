package vezba_grananje;

import java.util.Scanner;

public class Zadatak2 {

	// Vozacka dozvola - IF ELSE

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite kategoriju: ");
		char kat = sc.next().charAt(0);

		if (kat == 'a' || kat == 'A') {
			System.out.println("Sa kategorijom A mozete voziti Motor.");
		} else if (kat == 'b' || kat == 'B') {
			System.out.println("Sa kategorijom B mozete voziti Auto");
		} else if (kat == 'c' || kat == 'C') {
			System.out.println("Sa kategorijom C mozete voziti Auto i kamion.");
		} else if (kat == 'd' || kat == 'D') {
			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus.");
		} else if (kat == 'e' || kat == 'E') {
			System.out.println("Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom.");
		} else {
			System.out.print("Neispravan unos.");

		}
		sc.close();
	}

}
