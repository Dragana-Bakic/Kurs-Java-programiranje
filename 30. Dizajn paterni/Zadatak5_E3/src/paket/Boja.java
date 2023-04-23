package paket;

public enum Boja {

	// Nabrajanje je neka vrsta klase. Instanca klase ne pravi se pomocu kljucne
	// reci new.
	// Rezervvisana rec Enum definise klasi.
	// Svaka konstanta definisana u nabrajanju je objekat ciji tip je to isto
	// nabrajanje.

	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(179), Zuta(124);

	//prvo mora da se unese lista sa vrednostima enuma
	
	private int udeo;

	Boja(int u) {
		udeo = u;
	}

	int getUdeo() {
		return udeo;
	}

}
