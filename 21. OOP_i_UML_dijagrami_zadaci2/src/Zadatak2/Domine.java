package Zadatak2;

public class Domine {
	private int a, b;

	// konstruktor
	Domine (int aa, int bb) {
	 a = aa; 
	 b = bb; }
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Domine okreni() {
		int p = a;
		a = b;
		b = p;
		return this;
	}

	public boolean ista(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	public String tekstualniOpis() {
		return "(" + a + ", " + b + ")";
	}

}
