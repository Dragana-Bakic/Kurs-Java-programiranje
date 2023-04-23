package Primer3;

public class KutijaPrikaz {
	// Koriscenje promenljive klase u drugoj klasi

	public static void main(String[] args) {

		Kutija b1 = new Kutija();

		double zapremina;

		b1.sirina = 10;
		b1.visina = 15;
		b1.dubina = 20;

		zapremina = b1.sirina * b1.dubina * b1.visina;

		System.out.println("Zapremina: " + zapremina);

	}

}
