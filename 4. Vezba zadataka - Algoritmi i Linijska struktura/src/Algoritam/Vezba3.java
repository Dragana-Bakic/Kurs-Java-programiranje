package Algoritam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vezba3 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double a, b, c;

		// Unos podataka
		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za c: ");
		c = Double.parseDouble(ulaz.readLine());

		// Izracunavanje vrednosti funkcija
		double f = (a - b) / (c + a / (c + (b / (c - b))));
		double g = (a + b + Math.sin(a)) * Math.cos(c);

		// Stampanje rezultata
		System.out.println("Vrednost funkcije f je " + f);
		System.out.println("Vrednost funkcije g je " + g);

	}
}
