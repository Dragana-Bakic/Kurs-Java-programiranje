package p;

public class SamePackage {

	SamePackage() {
		Base b = new Base(); // b je objekat klase Base. Objekat se pravi radi pozivanja podataka iz klase
		System.out.println("Konstruktor klase SamePackage");

		// System.out.println("n_pri = " + b.n_pri); // ne vidi iz Base klase i zato prijavljuje gresku
		System.out.println("Same package klasa: n_def = " + b.n_def);
		System.out.println("Same package klasa: n_pro = " + b.n_pro);
		System.out.println("Same package klasa: n_pub = " + b.n_pub);
	}
// specifikator pristupa: private,protected,public,package
}
