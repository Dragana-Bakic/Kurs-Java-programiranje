package primer8;

public class Circle {

	private double radius; // podatak - atribut

	Circle() { // kontruktor bez parametra
		radius = 0.0;
	}

	Circle(double radius) { // kontruktor sa parametrom
		this.radius = radius;
	}

	public double area() { // metoda za izracunavanje povrsine
		return 3.14 * radius * radius;
	}
}
