package paket;

import java.io.*;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int s, m;
		System.out.println("Unesite sati: ");
		s = Integer.parseInt(bf.readLine());
		System.out.println("Unesite minute: ");
		m = Integer.parseInt(bf.readLine());

		if (s >= 9 && s < 17) {
			if (m > 0 && m < 59) {
				System.out.println("Da");
			}
		} else if (s == 17 && m == 0) {
			System.out.println("Da");

		}

		else {
			System.out.println("Ne");

		}

	}

}
