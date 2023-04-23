package visestruko_grananje;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		int ocena;

		System.out.print("Unesite ocenu: ");
		ocena = db.nextInt();

		switch (ocena) {

		case 5: {
			System.out.println("Odlican. ");
			break;
		}
		case 4: {
			System.out.println("Vrlo dobar. ");
			break;
		}
		case 3: {
			System.out.println("Dobar. ");
			break;
		}
		case 2: {
			System.out.println("Dovoljan. ");
			break;
		}
		case 1: {
			System.out.println("Nedovoljan. ");
			break;
		}
		default: {
			System.out.println("Pogresna ocena. ");
		}

		}

		db.close();
	}

}
