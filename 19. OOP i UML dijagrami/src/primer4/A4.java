package primer4;

public class A4 {

	private String message;

	// Deklarisanjem privatnih podataka vrsi se enkapsulacija - skrivanje podataka
	// Sprecava se promena vrednosti promenljivih iz koda van zadate klase

	// podatak = atribut = osobina klase
	// Objekti imaju svoje atribute
	// atributi se predstavljaju preko promenljivih u deklaraciji klase
	// deklarisu se unutar klase van svih metoda

	// Metode klase

	// Metoda setMessage postavlja poruku

	public void setMessage(String msg) {

		// seterima postavljamo vrednost
		// metoda je publi, da bi se omogucilo pristup podacima
		// void znaci da ne vracaju rezultat, kao parametar imaju promenljivu istog tipa

		// pravilo je da pocinje naziv metode sa set ali ne mora
		// msg - vrednost promenljive

		message = msg; // postavlja vrednost promenljivoj message

	}

	// Metoda getMessage*() vraca poruku.
	// geterima ispisujemo poruku

	public String getMessage() { // nema parametara, vracaju odgovarajuci tip podataka

		return message;
	}

	// private = vidi samo klasa u kojoj je, a publik i ostale klase u paketu
	// string je u ovom slucaju tip podataka promenljive message, iako postoji klasa
	// String

	/*
	 * Parametri i argumenti metoda Promenljiva deklarisana u zaglavlju metode
	 * nazivamo parametrom - ovde String message Argument se prosledjuje metodi
	 * prilikom poziva metode Argument se prosledjuje metodi prilikom poziva metode
	 * !!! Prilikom poziva, parametri dobijaju vrednosti argumenata metode
	 */

}
