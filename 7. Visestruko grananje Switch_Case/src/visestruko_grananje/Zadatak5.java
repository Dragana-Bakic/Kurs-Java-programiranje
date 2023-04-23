package visestruko_grananje;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		double C1, C2, Ce;
		int veza;

		System.out.print("Unesite kapacitet prvog kondenzatora: ");
		C1 = db.nextDouble();
		System.out.print("Unesite kapacitet drugog kondenzatora: ");
		C2 = db.nextDouble();
		System.out.print("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu: ");
		veza = db.nextInt();

		switch (veza) {
		case 2: {
			Ce = C1 + C2;
			System.out.println("Paralelna veza: Ce = " + Ce);
			break;
		}
		case 1: {
			Ce = C1 * C2 / (C1 + C2);
			System.out.println("Redna veza: Ce = " + Ce);
			break;
		}

		default: {
			System.out.println("Greska!");
		}
		}

		db.close();
	}

}
