package paket;

import java.util.LinkedList;
import java.util.List;

public class MainLL2 {

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Zika", "Fica"};
		
		List<String> listaImena = new LinkedList<String>();
		for(String s : imena)
			listaImena.add(s);
		
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};

		List<String> listaImena1 = new LinkedList<String>();
		for(String ime : imena1)
		listaImena1.add(ime);

		System.out.println("Lista pre dodavanja imena: " + listaImena);
		
		//metoda addAll dodavanje elemenata druge liste

		listaImena.addAll(listaImena1);
		System.out.println("Lista posle dodavanja imena: " + listaImena);
		
		listaImena.subList(1, 3).clear();
		System.out.println("Lista nakon brisanja elemenata sa indeksima od 1 do 4: " + listaImena);


	}

}
