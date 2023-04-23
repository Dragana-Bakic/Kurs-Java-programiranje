package Primer8;

public class Prikaz8 {
	public static void main(String[] args) {
		// This u konstruktoru

		Box8 b1 = new Box8(10, 15, 20);
		Box8 b2 = new Box8(5, 6, 7);

		System.out.println("Zapremina:" + b1.volume());
		System.out.println("Zapremina:" + b2.volume());

	}
}
