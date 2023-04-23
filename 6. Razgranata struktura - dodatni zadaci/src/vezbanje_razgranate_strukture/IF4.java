package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class IF4 {

	public static void main(String[] args) {

		// Ispitati da li je broj paran.

		Scanner sc1 = new Scanner(System.in);

		int broj;

		System.out.println("Unesite broj: ");

		broj = sc1.nextInt();

		if (broj % 2 == 0) {
			System.out.println("Broj je paran!");
		} else {
			System.out.println("Broj je neparan!");

		}
		sc1.close();
	}

}
