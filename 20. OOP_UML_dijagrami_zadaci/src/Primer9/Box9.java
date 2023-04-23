package Primer9;

public class Box9 {
	
	private double width;
	private double height;
	private double depth;

	Box9() {
		width = 1;
		height = 1;
		depth = 1;
	}

	Box9(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box9(double len) {
		width = height = depth = len;
	}

	Box9(Box9 b) {
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	double volume() {
		return width * height * depth;
	}
}
