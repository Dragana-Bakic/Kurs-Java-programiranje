package Algoritam;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Unos podataka
		double x;
		System.out.println("Unesite vrednost x: ");
		x = input.nextDouble();

		// Izdračunavanje funkcije
		double y;
		y = Math.sqrt((Math.exp(x / 2) + 1.2 * Math.sin(2 * x)) / (3.3 * Math.cos(x) - 7.1 * Math.exp(x)));

		// Štampanje funkcije
		System.out.println("y = " + y);

		input.close();

	}
}
