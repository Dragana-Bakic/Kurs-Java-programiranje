package paket;

public class Main5 {

	public static void main(String[] args) {

		Boja b;

		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());

		System.out.println("Sve boje: ");
		for (Boja c : Boja.values())
			System.out.println(c + " " + c.getUdeo());

	}

}
