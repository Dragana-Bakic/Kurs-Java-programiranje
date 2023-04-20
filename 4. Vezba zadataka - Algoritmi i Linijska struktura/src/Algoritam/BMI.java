package Algoritam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");

		// Unos podataka
		double m, h;
		System.out.println("Unesite visinu:");
		h = input.nextDouble();
		System.out.println("Unesite masu:");
		m = input.nextDouble();

		System.out.println("Indeks telesne mase BMI iznosi = " + df.format(m / Math.pow(h, 2)));
		input.close();

	}

}
