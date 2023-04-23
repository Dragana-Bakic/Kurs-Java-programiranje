package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak1 {

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

		// ispisivanje elemenata pod a)
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}

			System.out.println();
		}
		// pod b)
		System.out.println("Elementi prvog reda su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		// pod c)
		System.out.println("\nElementi druge kolone su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 1)
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}
}
