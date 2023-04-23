package visestruko_grananje;

import java.util.Scanner;

public class Zadatak5_if_else {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		double C1, C2;
		int veza;

		System.out.print("Unesite kapacitet prvog kondenzatora: ");
		C1 = db.nextDouble();
		System.out.print("Unesite kapacitet drugog kondenzatora: ");
		C2 = db.nextDouble();
		System.out.print("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu: ");
		veza = db.nextInt();

		if (veza == 1) {
			System.out.println("Redna veza: Ce = " + (C1 * C2 / (C1 + C2)));
		} else if (veza == 2) {
			System.out.println("Paralelna veza: Ce = " + (C1 + C2));
		} else {
			System.out.println("Greska!");
		}

		db.close();
	}

}
