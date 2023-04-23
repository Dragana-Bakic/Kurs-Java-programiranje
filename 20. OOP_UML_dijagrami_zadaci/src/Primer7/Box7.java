package Primer7;

public class Box7 {
	private double width;
	private double height;
	private double depth;
	
	Box7(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
}
}