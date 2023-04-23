package paket;

import java.util.Scanner;

public class Palindrom {

	// Ispitati da li je broj palindrom

	private static void daLiJePalindrom(String r) {
		String rec = "";
		for (int i = r.length() - 1; i >= 0; i--) {
			rec += r.charAt(i);
		}
		if (r.equals(rec))
			System.out.println("Jeste palindrom");
		else
			System.out.println("Nije palindrom");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();
		int m = n;
		int s = 0, k = 0, g = 0;
		while (n != 0) {
			s = n % 10;
			k = s * 10;
			n = n / 10;
			g = g * 10 + k;
		}
		g = g / 10;
		if (m == g)
			System.out.println("Broj je palindrom");
		else
			System.out.println("Nije");
		/* Kao reč */ sc.next();
		System.out.println("Unesite reč:");
		String r = sc.nextLine();
		String rec = "";
		for (int i = r.length() - 1; i >= 0; i--) {
			rec += r.charAt(i);
		}
		if (r.equals(rec))
			System.out.println("Jeste palindrom");
		else
			System.out.println("Nije palindrom");
		daLiJePalindrom(r);
		sc.close();
	}

}
