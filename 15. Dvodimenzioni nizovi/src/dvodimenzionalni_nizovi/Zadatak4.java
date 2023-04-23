package dvodimenzionalni_nizovi;

import java.util.Scanner;

public class Zadatak4 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		int a[][] = new int[red][kolone];
		int b[][] = new int[red][kolone];
		int c[][] = new int[red][kolone];

		System.out.println("Elementi prve matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi druge matrice b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("b[" + i + ", " + j + "]" + " = ");
				b[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi dvodimenzionalnog niza b su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// a) Zbir elemenata

		System.out.println("Zbir elemenata prve i druge matrice je: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}
		// b) Razlike elemenata

		System.out.println("Razlika elemenata prve i druge matrice je: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = a[i][j] - b[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		// c) Proizvod elemenata

		System.out.println("Proizvod elemenata prve i druge matrice je: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = a[i][j] * b[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		// d) Proizvod matrice skalarom

		System.out.println("Unesite skalar za mnozenje matrice: ");
		int n = sc.nextInt();

		System.out.println("Proizvod matrice a sa skalarom " + n + " je: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = n * a[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("Proizvod matrice b sa skalarom " + n + " je: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = n * b[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();
	}
}
