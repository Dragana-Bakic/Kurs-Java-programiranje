package visestruko_grananje;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		int kva;
		System.out.print("Unesite broj kvadranta: ");
		kva = db.nextInt();

		switch (kva) {
		case 1: {
			System.out.println("Ugao: 0 do 90 stepeni");
			break;
		}
		case 2: {
			System.out.println("Ugao: 90 do 180 stepeni");
			break;
		}
		case 3: {
			System.out.println("Ugao: 180 do 270 stepeni");
			break;
		}
		case 4: {
			System.out.println("Ugao: 270 do 360 stepeni");
			break;
		}
		default:
			System.out.println("Nepostojeci kvadrant. Upisite vrednosti od 1 do 4. ");

		}

		db.close();
	}
}
