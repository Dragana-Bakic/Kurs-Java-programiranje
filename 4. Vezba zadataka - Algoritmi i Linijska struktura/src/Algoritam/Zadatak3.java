package Algoritam;

import java.io.*;

public class Zadatak3 {

	public static void main(String[] args) throws Exception {

		// Deklarisanje podataka

		double a, P, V;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());

		P = 6 * Math.pow(a, 2);
		V = Math.pow(a, 3);

		System.out.println("Površina je " + P);
		System.out.println("Zapremina je " + V);

	}

}
