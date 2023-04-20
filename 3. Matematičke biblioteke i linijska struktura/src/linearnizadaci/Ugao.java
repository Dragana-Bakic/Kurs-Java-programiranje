package linearnizadaci;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ugao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("Unesite vrednost ugla u radijanima: ");
		double x = input.nextDouble();

		System.out.println("Sinus zadatog ugla je: " + df.format(Math.sin(x)));
		System.out.print("Kosinus zadatog ugla je: " + df.format(Math.cos(x)));

		input.close();

	}
}
