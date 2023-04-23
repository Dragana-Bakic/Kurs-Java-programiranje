package Primer8;

public class Box8 {
	private double width;
	private double height;
	private double depth;

	Box8(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width * height * depth;
	}
}
