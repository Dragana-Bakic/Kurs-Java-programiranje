package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak2 {

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

		// a) ispisivanje parnih elemenata:
		
		System.out.println("Parni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0)
					System.out.print(niz[i][j] + " ");

			}
		}

		// b) ispisivanje neparnih elemenata:

		System.out.println("\nNeparni elementi dvodimenzionalnog niza su:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}

		sc.close();
	}

}
