package paket;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * Osnovne UI operacije
		 * 
		 * Za UI operacie Java koristi tokove (Stream). Strimovi obezbeđuju način za
		 * rad sa podacima koji se primaju i šalju.
		 */

		// Klasa koja omogućuje da se poveže tastatura sa Stream-om ili tastaturom
		DataInputStream dis = new DataInputStream(System.in);

		// Povezivanje fajla sa klasom FileOutputStream
		FileOutputStream fos = new FileOutputStream("rezultat.txt");

		System.out.println("Unesite string (unos prekinite unosom karaktera $");

		// read() - metoda čita znak po znak sistema otput
		// write

		char ch;

		while ((ch = (char) dis.read()) != '$') {
			fos.write(ch);
		}

		fos.close();

		// fajl sa rezultatima (sta je pisano na konzoli) se nalazi u folderu java
		// projekta - u ovom slucaju Input folder
		// u ovom slucaju sam kreira datoteku .txt
		// datoteka brise staro napisano, u njoj se nalazi poslednje napisano na konzoli

	}

}
