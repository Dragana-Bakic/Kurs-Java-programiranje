package paket;

public abstract class Vozilo {

	private double tezina; // tezina samog vozila

	Vozilo(double tezina) {
		this.tezina = tezina;
	}

	double getTezina() {
		return this.tezina;
	}

	abstract char vrstaVozila();

	//String opis() {
	//	return "Tezina: " + tezina + "\nOpis: " + vrstaVozila();
//	}

}