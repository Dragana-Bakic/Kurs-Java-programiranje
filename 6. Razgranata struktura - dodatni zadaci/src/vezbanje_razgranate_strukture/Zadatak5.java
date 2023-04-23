package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		// Ispitivanje da li je godina prestupna

		Scanner db = new Scanner(System.in);

		int godina;

		System.out.print("Unesite godinu: ");
		godina = db.nextInt();

		if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
			System.out.println("Uneta godina " + godina + " JE prestupna.");
		} else {
			System.out.println("Uneta godina " + godina + " NIJE prestupna.");
		}

		db.close();
	}

}
