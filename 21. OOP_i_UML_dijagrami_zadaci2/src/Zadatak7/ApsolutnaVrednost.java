package Zadatak7;

public class ApsolutnaVrednost {
	private double broj;
	
	ApsolutnaVrednost(double broj) {
	this.broj = broj;
	}
	
	public double ispis() {
		return Math.abs(broj);
	}

}
