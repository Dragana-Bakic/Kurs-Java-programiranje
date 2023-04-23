package vezba_grananje;

import java.util.Scanner;

public class Zadatak3 {

	// Vozacka dozvola - SWITCH CASE

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite kategoriju dozvole: ");
		char dozvola = sc.next().charAt(0);

		switch (dozvola) {
		case 'a':
		case 'A': {
			System.out.println("Sa kategorijom A mozete voziti Motor. ");
			break;
		}
		case 'b':
		case 'B': {
			System.out.println("Sa kategorijom B mozete voziti Auto.");
			break;
		}
		case 'c':
		case 'C': {
			System.out.println("Sa kategorijom C mozete voziti Auto i kamion. ");
			break;
		}
		case 'd':
		case 'D': {
			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus. ");
			break;
		}
		case 'e':
		case 'E': {
			System.out.println("Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom. ");
			break;
		}

		default: {
			System.out.println("Neispravan unos. ");
		}

		}
		sc.close();
	}
}