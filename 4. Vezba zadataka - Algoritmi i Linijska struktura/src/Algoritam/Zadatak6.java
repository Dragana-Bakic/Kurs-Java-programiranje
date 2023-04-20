package Algoritam;

import java.io.*;

public class Zadatak6 {

	public static void main(String[] args) throws Exception {

		double cm;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost u cm: ");
		cm = Double.parseDouble(ulaz.readLine());

		System.out.println("Vrednost u inčima iznosi " + cm * 2.54);
	}
}
