package visestruko_grananje;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		int dan;
		System.out.print("Unesite redni broj dana u nedelji: ");
		dan = db.nextInt();

		switch (dan) {
		case 1: {
			System.out.println("Ponedeljak. ");
			break;
		}
		case 2: {
			System.out.println("Utorak. ");
			break;
		}
		case 3: {
			System.out.println("Sreda. ");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak. ");
			break;
		}
		case 5: {
			System.out.println("Petak. ");
			break;
		}
		case 6: {
			System.out.println("Subota. ");
			break;
		}
		case 7: {
			System.out.println("Nedelja. ");
			break;
		}
		default: {
			System.out.println("Pogresan redni broj dana u nedelji. Uneti ponovo. ");
		}

		}

		db.close();
	}

}
