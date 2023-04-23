package p1;

/* Paketi (packages)
 * 
 * Paketi sluze za grupisanje klasa.
 * Primera radi, mozete napraviti dve klase sa istim nazivom unutar dva razlicita paketa.
 * Paket je istovremeno mehanizam  za imenovanje i za upravljanje vidljivoscu klasa.
 * Paketi sadrze klase. Klase sadrze polja (fields) i metode (methods).
 * Metode sadrze lokalne promenljive. Nema globalnih promenljivih u Javi!

 * 
 */

public class First {

	public int a = 5;

	public void view() {
		System.out.print("Ovo je klasa definisana u paketu P1");
	}
}
