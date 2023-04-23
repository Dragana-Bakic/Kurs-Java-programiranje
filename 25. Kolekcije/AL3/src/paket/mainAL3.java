package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mainAL3 {

	public static void main(String[] args) {

		String imena[] = { "Mika", "Zika", "Ana", "Lana", "Hana", "Una" };

		List<String> listaImena = new ArrayList<String>();

		for (String s : imena)
			listaImena.add(s);

		String imenaZaBrisanje[] = { "Mika", "Lana", "Hana" };

		List<String> listaImenaZaBrisanje = new ArrayList<String>();

		for (String ime : imenaZaBrisanje)
			listaImenaZaBrisanje.add(ime);

		// Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora

		Iterator<String> iter = listaImena.iterator();

		System.out.println("Stampanje elemenata pomocu iteratora: ");
		while (iter.hasNext())
			System.out.print(iter.next() + " ");

		// Brisanje elemenata liste imena koja se nalaze u listi listaImenaZaBrisanje

		iter = listaImena.iterator();

		while (iter.hasNext())
			if (listaImenaZaBrisanje.contains(iter.next())) // utvrdjujemo da li lista 
				//imena za brisanje sadrzi element na koju ukazuje iterator
				//ako je odgovor true, brisemo element
				iter.remove();

		System.out.println("\nLista nakon brisanja: ");
		for (int i = 0; i < listaImena.size(); i++)
			System.out.print(listaImena.get(i) + " ");

	}

}
