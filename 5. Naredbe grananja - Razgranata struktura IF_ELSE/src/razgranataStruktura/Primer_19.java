package razgranataStruktura;

import java.io.*;

public class Primer_19 {

	// Funkcija

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite vrednost za q: ");
		int q = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za r: ");
		int r = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za s: ");
		int s = Integer.parseInt(ulaz.readLine());

		// Izračunavanje vrednosti funkcije
		int y = (r > s) ? r : s;

		if (q < y)
			y = q;

		/*
		 * II nacin:
		 * 
		 * int y;
		 * 
		 * if (r > s) y = r; else y = s;
		 * 
		 * if (q < y) y = q;
		 * 
		 */

		// Štampanje rezultata
		System.out.println("Vrednost funkcije y je " + y);

	}
}
