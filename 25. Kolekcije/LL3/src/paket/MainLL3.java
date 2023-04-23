package paket;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainLL3 {

	public static void main(String[] args) {

		List<String> LList = new LinkedList<String>();
		
		LList.add("1");
		LList.add("2");
		LList.add("3");
		LList.add("4");
		LList.add("5");
		
		ListIterator<String> itr = LList.listIterator();
		
		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa: ");
		while(itr.hasNext()) { // 0 . . n 
			System.out.println(itr.next() + " ");
		}
	
			System.out.println("Kretanje kroz listu od poslednjeg do prvog elementa: ");

			while(itr.hasPrevious()) { // n . . 0
				System.out.println(itr.previous() + " ");

			}

	}

}
