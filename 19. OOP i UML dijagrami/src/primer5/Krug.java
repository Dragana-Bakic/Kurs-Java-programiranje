package primer5;

public class Krug {

	private double poluprecnik;

	Krug() { // konstruktor, ima isti naziv kao i klasa
		poluprecnik = 10.0;
	}

	// konstruktor se poziva kreiranjem objekta,
	// konstruktor inicijalizuje vrednost promenljive (ovde vrednost poluprecnika)
	// ukoliko ne dodelimo vrednost konstruktoru dodelice podrazumevanu vrednost, 0
	// ili null za referentne

	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}
}
