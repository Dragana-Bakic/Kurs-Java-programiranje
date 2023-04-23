package dragana.bakic;

import java.util.Scanner;
import java.util.Random;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		char m1[][] = new char[10][10];
		char m2[][] = new char[10][10];

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m1[i][j] = '0';
			}
		}

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		m1[ra.nextInt(m1.length)][ra.nextInt(m1[0].length)] = 'x';

		System.out.print("Trazeni simbol se nalazi u kom redu? ");
		int r = sc.nextInt();
		System.out.print("U kojoj koloni? ");
		int k = sc.nextInt();

		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				m2[i][j] = '0';
			}
		}
		m2[r][k] = 'x';

		System.out.println("\nIzabrali ste:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}

		if (m1[9][9] == m2[9][9]) {
			System.out.println("Bravo! Pogodili ste. Rešenje je:");
		} else {
			System.out.println("\nIzgubili ste. Resenje je:");
		}

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
