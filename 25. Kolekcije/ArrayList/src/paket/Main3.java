package paket;
import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		
		/*opsti oblik deklaracije:
		 * 
		 * interfejs <T> ime = new ArrayList<T>();
		 * 
		 * T - (tip promenljive) oznaka za tip podataka i smesta se izmedju znaka vece/manje
		 */
		
		//deklaracija kolekcije:
		List<Integer> kolekcijaAL = new ArrayList<Integer>();
		
		//add - metoda, dodavanje kolekciji
		
		//Dodavanje elemenata kolekciji:
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		
		System.out.println(kolekcijaAL);
		
		//Koristite ArrayList kada ne znate unapred velicinu niza, mogu da se dodaju naknadno elemnti


	}

}
