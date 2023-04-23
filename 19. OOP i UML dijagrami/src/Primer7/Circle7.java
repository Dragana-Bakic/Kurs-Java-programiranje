package Primer7;

public class Circle7 {

	private double radius;

	Circle7() { // konstruktor bez parametara
		radius = 0.0;
	}

	Circle7(double radius) { // ima jedan parametar
		this.radius = radius;
	}

	Circle7(Circle7 ob) { // ima objekat kao parametar
		radius = ob.radius; // postupak inicijalizacije polja (atributa) objekta klase
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
