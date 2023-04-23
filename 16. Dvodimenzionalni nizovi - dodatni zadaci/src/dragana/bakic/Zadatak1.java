package dragana.bakic;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x[][] = new int[5][5];

		System.out.println("Unesite elemente matrice 5x5:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("x[" + i + "," + j + "] = ");
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica 5x5:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		// suma elemenata treceg reda
		int s = 0;
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 5; j++) {
		// if (i == 2)
		// s += x[i][j];
		for (int j = 0; j < 5; j++) {
			s += x[2][j];
			// }
		}

		System.out.print("Suma elemenata treceg reda niza: s= " + s);
		sc.close();
	}

}
