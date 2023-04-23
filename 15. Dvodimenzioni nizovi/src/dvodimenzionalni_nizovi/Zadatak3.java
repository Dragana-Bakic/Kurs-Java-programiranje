package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}
		// ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}

			System.out.println();
		}
		// a) ispisivanje parnih elemenata:

		System.out.println("Elementi parnih indeksa redova su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((i + 1) % 2 == 0)
					System.out.print(niz[i][j] + " ");

			}
		}

		// b) Elementi neparnih indeksa kolona su:

		System.out.println("\nElementi neparnih indeksa kolona su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		// c) Elementi parnih indeksa kolona:

		System.out.println("\nElementi parnih indeksa kolona su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((j + 1) % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		// d) Elementi neparnih indeksa redova su::

		System.out.println("\nElementi neparnih indeksa redova su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}

		// e) Elementi parnih indeksa redova i kolona su::

		System.out.println("\nElementi parnih indeksa redova i kolona su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}

}
