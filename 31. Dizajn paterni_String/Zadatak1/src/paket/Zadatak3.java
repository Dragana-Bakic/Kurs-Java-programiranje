package paket;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int broj = sc.nextInt();
		int cifra;
		while (broj != 0) {
			cifra = broj % 10;
			if (cifra == 5)
				System.out.println("Ima");
			broj /= 10;
		}
	}
}
