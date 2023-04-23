package paket;

public class PutnickoVozilo extends Vozilo {

	private int brojPutnika;
	private double prosecnaTezinaPutnika;

	PutnickoVozilo(double tezina, int brP, double pTP) {
		super(tezina);
		this.brojPutnika = brP;
		this.prosecnaTezinaPutnika = pTP;

	}

	public char vrstaVozila() {
		return 'P';
	}

	double tezinaPutnika() {
		return brojPutnika * prosecnaTezinaPutnika;
	}

	public double getOpterecenje() {
		return tezinaPutnika() + this.getTezina();
	}

	public String opis() {
		return "Vozilo opterecenja " + getOpterecenje() + " ima oznaku: " + vrstaVozila();
	}

}
