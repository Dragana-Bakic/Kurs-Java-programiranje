package Zadatak2;

public class Osoba {

	public String ime, datumRodjenja, adresaStanovanja;

	/*
	 * public String ispisi() { return "Ime:" + ime + " \nDatum Rodjenja: " +
	 * datumRodjenja + "\nAdresaStanovanja" + adresaStanovanja; }
	 * 
	 */

	public void ispis() {
		System.out.println(
				"Ime: " + ime + " \nDatum Rodjenja: " + datumRodjenja + "\nAdresaStanovanja: " + adresaStanovanja);

	}
}
