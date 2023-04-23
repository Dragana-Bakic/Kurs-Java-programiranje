package Zadatak6;

public class Matrica {

	private double[][] matr; // deklaracija matrice

	public Matrica(int vrs, int kol) { // kreiranje matrice kroz konstruktor
		matr = new double[vrs][kol];
	}

	public int vrs() { // geter

		return matr.length; // lenght = osobina, vratice koliko ima polja
	}

	public int kol() { // geter

		return matr[0].length;
	}

	public Matrica postavi(int v, int k, double vr) { // postavljanje odredjene vrednosti na zadati red i zadatu kolonu
		// if (v > 0 || k > 0) {
		matr[v][k] = vr;
		return this;
	}

	public double dohvati(int v, int k) { // ispisati vrednost elementa odredjenog reda i kolone
		return matr[v][k];
	}

	public String toString() { // ispisivanje matrice
		String s = "";
		for (int v = 0; v < matr.length; v++) {
			for (int k = 0; k < matr[0].length; k++) {
				System.out.print("\t" + matr[v][k]);
			}
			System.out.println();
		}
		return s;
	}
}
