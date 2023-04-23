package visestruko_grananje;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		char znak;
		double x, y;

		System.out.print("Unesite znak za operaciju: ");
		znak = db.next().charAt(0);
		System.out.println("Unesite dva realna broja: ");
		x = db.nextDouble();
		y = db.nextDouble();

		switch (znak) {
		case '+': {
			System.out.println("Sabiranje: x+y= " + (x + y));
			break;
		}
		case '-': {
			System.out.println("Oduzimanje: x-y= " + (x - y));
			break;
		}
		case '*': {
			System.out.println("Mnozenje: x*y= " + (x * y));
			break;
		}
		case '/': {
			System.out.println("Deljenje: x/y= " + (x / y));
			break;
		}
		default: {
			System.out.println("Greska!");

		}

			db.close();
		}

	}

}
