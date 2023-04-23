package razgranataStruktura;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Primer_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		// Deklarisanje podataka
		double x, y, f;

		// Unos podataka
		System.out.print("Unesite vrednost za x: ");
		x = input.nextDouble();
		System.out.print("Unesite vrednost za y: ");
		y = input.nextDouble();

		// Razgranata struktura
		if (x > y)
			f = Math.sqrt((x - 0.2) / (2 + y));
		else
			f = Math.sqrt((y - 0.2) / (2 + x));

		// Stampanje rezultata
		System.out.println("Vrednost funkcije je " + df.format(f));

		input.close();

	}
}
