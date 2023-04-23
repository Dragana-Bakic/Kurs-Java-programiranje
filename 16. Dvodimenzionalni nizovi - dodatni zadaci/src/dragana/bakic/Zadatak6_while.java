package dragana.bakic;

import java.util.Scanner;

public class Zadatak6_while {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int red, kolone;
		do {
			System.out.print("Unesite broj redova: ");
			red = sc.nextInt();
			System.out.print("Unesite broj kolona: ");
			kolone = sc.nextInt();
		} while (red <= 0 || kolone <= 0);

		int a[][] = new int[red][kolone];

		System.out.println("Elementi prve matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elemenata
		System.out.println("Elementi matrice a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// Suma kvadrata elemenata

		int suma = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				suma += a[i][j] * a[i][j];
			}
		}
		System.out.println("Suma kvadrata: " + suma);

		sc.close();
	}
}
