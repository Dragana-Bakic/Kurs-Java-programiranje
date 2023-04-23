package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// a) Glavna dijagonala
		System.out.println("Elementi glavne dijagonale su: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == j)
					System.out.print(a[i][j] + " ");
			}
		}
		// b) Sporedna dijagonala
		System.out.println("\nElementi sporedne dijagonale su: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i + j == red - 1)
					System.out.print(a[i][j] + " ");
			}
		}
		sc.close();
	}
}