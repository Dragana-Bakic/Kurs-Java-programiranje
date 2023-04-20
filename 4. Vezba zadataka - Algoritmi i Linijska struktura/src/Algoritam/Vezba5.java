package Algoritam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vezba5 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double a, b, c;

		// Unos podataka
		System.out.println("Unesite vrednosti stranice trougla a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednosti stranice trougla b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednosti stranice trougla c: ");
		c = Double.parseDouble(ulaz.readLine());

		// Izracunavanje dužine simetrale ugla iz temena A
		double La = 1 / (b + c) * Math.sqrt(b * c * (Math.pow(b + c, 2) - Math.pow(a, 2)));

		// Izracunavanje dužine simetrale stranice a
		double ma = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) / 2;

		// Stampanje rezultata
		System.out.println("La iznosi " + La + ", dok je ma " + ma);

	}
}
