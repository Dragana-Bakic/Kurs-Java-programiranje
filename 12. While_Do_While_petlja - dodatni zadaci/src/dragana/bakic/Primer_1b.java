package dragana.bakic;

import java.io.*;

public class Primer_1b {

	public static void main(String[] args) throws Exception {

		double suma = 0;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		int i = 1;
		while (i <= n) {
			suma += (double) i / (i + 1);
			i++;
		}

		System.out.println("Dobijena vrednost sume je " + suma);

	}
}
