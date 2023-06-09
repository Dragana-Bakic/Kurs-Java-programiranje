package paket;

public class TestMain {

	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {

		DivljaPatka patka = new DivljaPatka();
		DivljaCurka curka = new DivljaCurka();

		// Umotavamo Curku u CurkaAdapter, zahvaljujuci kome ce izgledati kao Patka

		Patka curkaAdapter = new CurkaAdapter(curka);

		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();

		System.out.println("Patka: ");
		testPatka(patka);

		// Pokusavamo da poturimo Curku kao Patku
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter); // ne zna da je dobila Curku prerusenu u Patku

	}

}
