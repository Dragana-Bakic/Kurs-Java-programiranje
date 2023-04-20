package linearnizadaci;

import java.util.Scanner;

public class TrocfreniBrojevi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Cifre trocifrenog broja (100-999) ");

		int a = input.nextInt();
		int s, t, d, j;
		s = a / 100;
		t = a / 10;
		d = t % 10;
		j = a % 10;

		System.out.println("broj = " + a + " ;" + "cifra jedinica = " + j + " " + "cifra desetica = " + d + " "
				+ "cifra stotine = " + s);

		System.out.println(100 * j + 10 * d + s);

		// II način
		System.out.print("Trocifren broj:");
		int broj = input.nextInt();
		int x, y, z;
		x = broj / 100; // cifra stotica
		y = (broj / 10) % 10; // cifra desetica
		z = broj % 10; // cifra jedinica
		System.out.println(
				"broj = " + broj + ", cifra stotina = " + x + ", cifra desetica = " + y + ", cifra jedinica = " + z);

		input.close();

	}
}
