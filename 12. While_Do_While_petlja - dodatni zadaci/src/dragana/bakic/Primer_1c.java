package dragana.bakic;

import java.io.*;

public class Primer_1c {

	public static void main(String[] args) throws Exception {

		double suma = 0;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		int i = 1;
		do {
			suma += (double) i / (i + 1);
			i++;
		} while (i <= n);

		System.out.println("Dobijena vrednost sume je " + suma);
	}
}
