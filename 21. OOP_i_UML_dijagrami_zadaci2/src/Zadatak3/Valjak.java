package Zadatak3;

public class Valjak {

	private double poluprecnik, visina;

	Valjak(double r, double h) {
		poluprecnik = r;
		visina = h;
	}

	Valjak() {
		poluprecnik = 1;
		visina = 1;
	}

	public double getpoluprecnik() {
		return poluprecnik;
	}

	public double getvisina() {
		return visina;
	}

	public double zapremina() {
		return poluprecnik * poluprecnik * 3.14 * visina;
	}

	public String opis() {
		return "Poluprecnik valjka: " + poluprecnik + ", visina valjka: " + visina;
	}

}
