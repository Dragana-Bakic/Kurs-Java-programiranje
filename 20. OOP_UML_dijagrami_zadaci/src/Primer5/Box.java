package Primer5;

public class Box {

	private double width;
	private double height;
	private double depth;

	void intBox(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	 double volume() {
		return width * height * depth;
	}
}
