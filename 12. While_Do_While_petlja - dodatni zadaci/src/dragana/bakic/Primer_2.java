package dragana.bakic;

import java.io.*;

public class Primer_2 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost broja: ");
		int broj = Integer.parseInt(ulaz.readLine());

		int cifra;
		do {
			cifra = broj % 10; // izdvojena cifra
			broj = broj / 10; // celobrojna vrednost podeljenog broja sa 10
			System.out.println(cifra); // izdvojena cifra
		} while (broj > 0);

	}
}
