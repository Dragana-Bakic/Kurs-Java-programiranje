package for_petlja;

import java.util.Scanner;

public class Zadatak6 {

	// Faktorijel

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prirodan broj: ");
		int n = sc.nextInt();

		int f = 1; // 1 predstavlja neutral za mnozenje
		for (int i = 1; i <= n; i++) {
			f = i * f;
		}
		System.out.println("Faktorijel broja " + n + " iznosi " + f);

		sc.close();

	}
}
