package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		int a[][] = new int[red][kolone];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// a) Najveci element
		int max = a[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				if (a[i][j] > max)
					max = a[i][j];
			}
		}
		System.out.println("Najveci element je: " + max);

		// b) Najmanji element

		int min = a[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				if (a[i][j] < min)
					min = a[i][j];
			}
		}
		System.out.println("Najmanji element je: " + min);
		sc.close();

	}

}
