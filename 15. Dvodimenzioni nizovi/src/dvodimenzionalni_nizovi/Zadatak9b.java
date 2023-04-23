package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak9b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		// ispisivanje elemenata
		System.out.println("Pocetni izgled: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				a[i][j] = 1;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Novi izgled: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i >= j)
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
