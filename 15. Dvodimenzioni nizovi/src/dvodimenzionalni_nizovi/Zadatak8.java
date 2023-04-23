package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak8 {

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
		System.out.println("Pocetni dvodimenzionalni niz: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// Zamena redova i kolona
		System.out.println("Transponovani elementi su: ");
		for (int j = 0; j < kolona; j++) {
			for (int i = 0; i < red; i++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		// Zamena redova i kolona 2.nacin
		System.out.println("Transponovani elementi 2.nacin su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
