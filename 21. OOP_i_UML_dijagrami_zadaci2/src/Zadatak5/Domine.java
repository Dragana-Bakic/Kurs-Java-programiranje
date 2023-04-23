package Zadatak5;

public class Domine {
	private int a, b;

	// konstruktor

	public Domine(int aa, int bb) {
		a = aa;
		b = bb;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Domine zamena() {
		int p = a;
		a = b;
		b = p;
		return this;
	}

	public boolean uporediDomine(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}

}
