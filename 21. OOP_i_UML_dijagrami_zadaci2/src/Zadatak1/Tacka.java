package Zadatak1;

public class Tacka {

	private double x;
	private double y;

	Tacka(double xx, double yy) {
		x = xx;
		y = yy;
	}

	public double getx() { // geter uzima tj. dohvata vrednost za koordinatu x
		return x;
	}

	public double gety() {
		return y;
	}

	public String ispisi() {
		return "(" + this.x + " , " + this.y + ")";
	}

}
