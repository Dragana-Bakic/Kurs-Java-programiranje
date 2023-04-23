package Zadatak4;

public class Radnik {

	private String ime;

	private double prihod, procenat;

	Radnik(String i, double pri, double pro) {
		ime = i;
		prihod = pri;
		procenat = pro;
	}

	public double getPrihod() {
		return prihod;
	}

	public double obracunPlate() {
		return prihod * procenat / 100;
	}

	public void opis() {
		System.out.println("Plata radnika " + ime + " iznosi " + obracunPlate());
	}

}
