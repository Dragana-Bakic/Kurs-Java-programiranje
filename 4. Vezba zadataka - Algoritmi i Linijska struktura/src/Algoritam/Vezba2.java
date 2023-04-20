package Algoritam;

import java.io.*;

public class Vezba2 {

	public static void main(String[] args) throws Exception {
		// Deklarisanje podataka

		boolean x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite vrednost za x: ");
		x = Boolean.parseBoolean(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Boolean.parseBoolean(ulaz.readLine());

		// Izracunavanje vrednosti funkcije z

		boolean z;
		z = !(x || y) && x || y;

		// Stampanje rezultata
		System.out.println("Vrednost funkcije z je " + z);
	}
}
