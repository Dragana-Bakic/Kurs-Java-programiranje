package paket;

public class Main {

	public static void main(String[] args) {
		
		// TestiraBroj paranBroj = /* ovde dolazi lambda izraz */
		/* levaStranaLambdaIzraza -> desna strana lambda izraza */

	//	() -> 123.45
		
		// double nekaMetoda() { return 123.45 }
		
		
		 TestiraBroj paranBroj =  (n) -> (n % 2) == 0;
		 // ovo je lambda izraz "(n) -> (n % 2) == 0" smesten u okviru promenljive paranBroj
		 //lambda operator ->
		 
		 if (paranBroj.test(9)) {
			 System.out.println("Broj je paran broj.");
		 }
		 else {
			 System.out.println("Broj nije paran.");

		 }
	}

}
