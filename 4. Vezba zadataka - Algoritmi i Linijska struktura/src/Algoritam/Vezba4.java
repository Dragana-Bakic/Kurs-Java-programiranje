package Algoritam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vezba4 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double a, b, c;

		// Unos podataka
		System.out.println("Unesite vrednost stranica kvadra: ");
		a = Double.parseDouble(ulaz.readLine());
		b = Double.parseDouble(ulaz.readLine());
		c = Double.parseDouble(ulaz.readLine());

		// Izracunavanje povrsine kvadra
		double P = 2 * (a * b + b * c + c * a);

		// Izracunavanje zapremine kvadra
		double V = a * b * c;

		// Stampanje rezultata
		System.out.println("Za unete vrednosti stranica, povrsina kvadra iznosi " + P + ", dok je zapremina " + V);

	}
}
