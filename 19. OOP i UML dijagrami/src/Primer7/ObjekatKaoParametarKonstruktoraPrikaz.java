package Primer7;

public class ObjekatKaoParametarKonstruktoraPrikaz {

	public static void main(String[] args) {

		Circle7 c1 = new Circle7(10);

		Circle7 c2 = new Circle7(c1); // c1 je objekat koji je vec kreiran

		System.out.println("Povrsina kruga: " + c2.area());

	}

}
