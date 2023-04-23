package Primer4;

public class Box {
	
	double width, height, depth;
	
	void volume() {
	System.out.print("Zapremina: ");
	System.out.println(width *height *depth);
	}

	
	
	/* Klasa u Javi predstavlja uputstvo koje kaze kako ce izgledati i kako ce se ponasati objekat koji je iz nje kreiran (izveden).
	 * 
	 * Polja (atributi) sadrze trenutno stanje nekog objekta (ili klase).
	 * 
	 * Metode implementiraju ponasanje objekta odnosno klase.
	 */
	
	 /* 
	 * Klase i objekti:  Kontrola pristupa clanovima
	 * 
	 *  U javi specifikatori pristupa se koriste da bi se zastitile promenljive klase i njene metode
	 *  
	 *  Java podrzava sledece nivoe pristupa clanovima klase (promenljivama i metodama): private, protected, public, i ukoliko se ne zada, package.
	  
	 *  Private:  
	 *  - Najrestriktivniji nivo pristupa. Privatnom članu mogu da pristupe samo ostali članovi klase u kojoj je on definisan. 
	 *  - Članovi izvedene klase ne mogu da mu pristupe. Privatni članovi deklarišu se ključnom reči private.

	 *  Protected: 
	 *  - Zaštićenim članovima mogu da pristupaju članovi klase u kojoj je definisa, članovi izvedenih klasa i sve klase unutar istog paketa. 
	 *  - Zaštićeni članovi deklarišu se ključnom reči protected

	 *  Public: 
	 *  - Bilo koja klasa, u bilo kom paketu, ima pravo pristupa javnim članovima neke klase. 
	 *  - Javni članovi klase implementiraju način komunikacije sa nekim objektom. 
	 *  - Ključna reč public se koristi da bi se deklarisao javni član klase.
	 
	 *  Package: 
	 *  - Ovo je nivo pristupa koji se dobija ukoliko se ne navede nijedan deklarator nivoa pristupa. 
	 *  - Ovaj nivo pristupa dozvoljava klasama unutar istog paketa da pristupi članovima klase. Podrazumeva se da su klase unutar istog paketa poverljivi prijatelji.

	 */

}
