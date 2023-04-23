package paket;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int broj = sc.nextInt();
		int a = 0, count = 0;

		while (a <= broj) {
			a = broj % 10;
			broj = broj / 10;
			if (a == 5) {
				count++;
				System.out.println("Broj sadrzi cifru 5.");
				break;
			}
		}
		if (count == 0) {
			System.out.println("Broj ne sadrzi cifru 5.");
		}
	}
}