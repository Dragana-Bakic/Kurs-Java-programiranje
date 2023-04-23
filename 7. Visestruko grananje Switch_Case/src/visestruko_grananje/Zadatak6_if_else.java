package visestruko_grananje;

import java.util.Scanner;

public class Zadatak6_if_else {

	public static void main(String[] args) {

		Scanner db = new Scanner(System.in);

		char znak;
		double x, y;

		System.out.print("Unesite znak za operaciju: ");
		znak = db.next().charAt(0);
		System.out.println("Unesite prvi realan broj x: ");
		x = db.nextDouble();
		System.out.println("Unesite drugi realan broj y: ");
		y = db.nextDouble();

		if (znak == '+') {
			System.out.println("Sabiranje: x+y= " + (x + y));
		} else if (znak == '-') {
			System.out.println("Oduzimanje: x-y= " + (x - y));
		} else if (znak == '*') {
			System.out.println("Mnozenje: x*y= " + (x * y));
		} else if (znak == '/') {
			System.out.println("Deljenje: x/y= " + (x / y));
		} else {
			System.out.println("Greska!");
		}

		db.close();
	}
}
