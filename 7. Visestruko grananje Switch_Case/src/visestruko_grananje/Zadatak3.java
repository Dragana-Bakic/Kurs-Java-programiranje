package visestruko_grananje;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);
		
		char slovo;
		System.out.print("Unesite neko slovo: ");
		slovo = db.next().charAt(0);

		switch (slovo) {
		case 'a':
		case 'A': {
			System.out.println("Uneto slovo je samoglasnik. ");
			break;
		}
		case 'e':
		case 'E': {
			System.out.println("Uneto slovo je samoglasnik.");
			break;
		}
		case 'i':
		case 'I': {
			System.out.println("Uneto slovo je samoglasnik. ");
			break;
		}
		case 'o':
		case 'O': {
			System.out.println("Uneto slovo je samoglasnik. ");
			break;
		}
		case 'u':
		case 'U': {
			System.out.println("Uneto slovo je samoglasnik. ");
			break;
		}

		default: {
			System.out.println("Uneto slovo je suglasnik. ");
		}

		}
		db.close();
	}

}
