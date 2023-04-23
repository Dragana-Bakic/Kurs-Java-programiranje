package p2;

import p1.Base;

public class OtherPackage {

	OtherPackage() {
		
		p1.Base p = new p1.Base();
		System.out.println("Konstruktor klase OtherPackage");

		// System.out.println("n_pri = " + b.n_pri); 
		//System.out.println("Same package klasa: n_def = " + b.n_def);
		//System.out.println("Same package klasa: n_pro = " + b.n_pro);
		System.out.println("Other package klasa: n_pub = " + p.n_pub);
	}
// specifikator pristupa: private,protected,public,package
}
