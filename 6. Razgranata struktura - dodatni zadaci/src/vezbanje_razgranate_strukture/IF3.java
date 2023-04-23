package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class IF3 {

	public static void main(String[] args) {

		// Za uneti broj ispitati da li je deljiv brojem 2 i brojem 3

		// 1. Unos podataka

		Scanner scanner = new Scanner(System.in);

		int x;

		System.out.print("Unesite broj: ");
		x = scanner.nextInt();

		// 2. deo: Obrada podataka

		if (x % 2 == 0 && x % 3 == 0)
			System.out.println("\nBroj je deljiv sa 2 i 3");
		else
			System.out.println("\nBroj nije deljiv");
		if (x % 3 != 0)
			System.out.print("\t(Broj nije deljiv sa 3 bez ostatka.)");
		if (x % 2 != 0)
			System.out.print("\t(Broj nije deljiv sa 2 bez ostatka.)");
		
		scanner.close();
	}

}
