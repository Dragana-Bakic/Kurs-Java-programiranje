package paket;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("dragana.txt"); // napravljen fajl u okviru foldera Java projekta, u
																	// ovom slucaju Output

		System.out.println("Sadrzaj fajla: ");

		// Metoda read () cita jedan po jedan bajt iz datoteke i vraca ga kao celobrojnu
		// vrednost. Kada stigne do kraja metoda vraca vrednost -1.

		int ch;

		while ((ch = fis.read()) != -1) {
			System.out.print((char) ch);
		}

		fis.close();
	}

}
