package paket;

import java.io.*;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj n: ");
		int n = Integer.parseInt(bf.readLine());

		if (n > 0) {

			System.out.println("Unesite n brojeva: ");

			//if (int i = 0; i<= n; i++
				int zbir = 0;
			
				int brojevi = Integer.parseInt(bf.readLine());

				if (brojevi < 0 && brojevi % 2 != 0) {
					zbir += brojevi;
				}
				System.out.println("Zbir = " + zbir);

			

		}

		else {
			System.out.println("Unesite pozitivan broj ");

		}

	}

}
