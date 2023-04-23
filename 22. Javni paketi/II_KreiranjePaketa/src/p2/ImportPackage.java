package p2;

import p1.*; // Drugi nacin (Kucanjem) Importovanjem paketa. Sve klase se importuju u ovom slucaju

public class ImportPackage {
	
	public static void main(String[] args) {
		
		First f = new First(); //Kreiranje objekta klase
		f.view(); // za dati objekat poziv funkcije.
	}

}
