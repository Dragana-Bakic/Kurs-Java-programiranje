package Primer10;

public class Knjiga {

	private String ime;
	private int brojStrana;

	Knjiga(String ime, int brojStrana) {
		this.ime = ime;
		this.brojStrana = brojStrana;
	}

	public void ispis() {
		System.out.println("Ime knjige je: " + this.ime);
		System.out.println("Broj strana knjige je: " + this.brojStrana);
	}

	/* public void setime(String name) {
	 * ime = name;
	 * }
	 * public String getime() {
	 * return ime;
	 * }
	 * 
	 * public void setbrojStrana(int br) {
	 * broj strana = br;
	 * }
	 * public int getbrojStrana() {
	 * return brojStrana;
	 * }
	 * 
	 * public void imeistr() {
	 * System.out.println("Ime: " + getime() + ".Broj stranica: " + getbrojStrana());
	 * }
	 * 
	 * */
	 
	
	
	
	/*
	 * String ime() { 
	 * return ime; } 
	 * 
	 * int brojStrana() { 
	 * return brojStrana; }
	 * 
	 */

}
