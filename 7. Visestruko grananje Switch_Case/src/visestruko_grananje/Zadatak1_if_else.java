package visestruko_grananje;

import java.util.Scanner;

public class Zadatak1_if_else {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		int ocena;

		System.out.print("Unesite ocenu: ");
		ocena = db.nextInt();

		if (ocena == 5) {
			System.out.print("Odlican");
		} else if (ocena == 4) {
			System.out.print("Vrlo dobar");
		} else if (ocena == 3) {
			System.out.print("Dobar");
		} else if (ocena == 2) {
			System.out.print("Dovoljan");
		} else if (ocena == 2) {
			System.out.print("Nedovoljan");
		} else {
			System.out.print("Uneta ocena ne postoji");
		}
		
		db.close();
	}

}
