package paket;

public class TeretnoVozilo extends Vozilo {

	private double tezinaTereta;

	TeretnoVozilo(double tezina, double teret) {
		super(tezina);
		this.tezinaTereta = teret;
	}

	public char vrstaVozila() {
		return 'T';
	}

	public double getOpterecenje() {
		return this.tezinaTereta + this.getTezina();
	}

	public String opis() {
		return "Vozilo opterecenja " + getOpterecenje() + " ima oznaku: " + vrstaVozila();
	}

}
