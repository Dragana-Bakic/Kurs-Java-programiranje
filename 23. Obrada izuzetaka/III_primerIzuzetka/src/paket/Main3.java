package paket;

public class Main3 {

	public static void main(String[] args) {
		int d, a;

		try { /*
				 * U try bloku se stavljaju naredbe koje mogu baciti izuzetak, kao i one naredbe
				 * koje se nece izvrsiti ako dodje do izuzetka
				 */
			d = 0;
			a = 10 / d;
			System.out.println("Ova poruka nece biti odstampana!" + a);

		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom.");
		}

		System.out.println("Program nastavlja sa izvrsenjem!");
	}

}
/* Izuzetak jeste znak da se desio problem prilikom izvršenja programa. 
 * Upravljanje izuzetaka predstavlja hvatanje i obradu izuzetaka. 
 * Neki izuzeci se mogu obraditi tako da program neometano nastavi sa radom, 
 * dok drugi zahtevaju prekid rada programa. 
 *  
 */

/* 
 * Hijerarhija izuzetaka
 * 
 * Svi izuzeci izvedeni su iz klase Throwable.
 * Klasa Throwable ima dva direktna naslednika(potomka): Error i Exception.
 * 
 * Klasa Error opisuje fatalne greske. (greske na koje ne mozemo uticati).
 * Za greske tog tipa nije potrebno navoditi try/catch blokove.
 * 
 * Klasa Exception jeste klasa iz koje se izvode klase koje pripadaju 
 * ne proverenim tipovima izuzetaka.
 * 
 * Exception {RuntimeException, IOException}
 * 
 * RuntimeException {IndexOutOfBoundsException, ArithmeticException}
 * 
 */
