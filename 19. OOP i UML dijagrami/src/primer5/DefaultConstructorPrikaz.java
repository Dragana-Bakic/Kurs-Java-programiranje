package primer5;

public class DefaultConstructorPrikaz {

	// defaultni konstruktor

	public static void main(String[] args) {

		Krug c1 = new Krug();

		System.out.println("Povrsina kruga: " + c1.area());

		/*
		 * Kljucnom recju new se kreira nova instanca klase Circle, pri cemu se objekat
		 * inicijalizuje *podrazumevanim vrednostima. Ukoliko zelimo da se
		 * inicijalizacija izvrsi nekim drugim vrednostima koje bismo mi * definisali,
		 * potrebno je realizaciji * klase dodati jos jedan metod - konstruktor klase.
		 * Konstruktor klase je specijalna metoda koja se koristi samo pri kreiranju
		 * objekta da * postavi pocetne vrednosti objekta, * tj. da inicijalizuje
		 * objekat.
		 *
		 * Za konstruktor vazi sledece: Konstrukor mora imati isto ime kao i klasa
		 * konstruktor moze imati i parametre konstruktor ne vraca vrednosti, cak se ne
		 * moze deklarisati ni kao void konstruktor je javna metoda
		 * 
		 * Ukoliko realizacija klase ne ukljucuje kostruktor klase, kompajler
		 * obezbedjuje tzv. podrazumevani konstruktor, * koji nema parametara, i koji
		 * podacima objekata daje podrazumevane vrednosti. Podaci klase imaju
		 * podrazumevane pocetne vrednosti, koje su za primitivne tipove byte, char,
		 * short, int long, float, * i double jednake 0, za tip boolean je false. * Za
		 * referencijske tipove vrednost je null. *
		 *
		 * 
		 */
	}

}
