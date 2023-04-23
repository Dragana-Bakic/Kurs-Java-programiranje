package paket;

public class A extends Thread {
	
	//sleep(milisekunde) privremeno zaustavlja (suspenduje) izvrsavanje niti 
	// argument metode sleep() je interval cekanja u milisekundama
	
	// Metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedException
	// Desice se izuzetak ukoliko neka druga nit pozeli da prekine ovu suspendovanu nit.
	

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);
			// sleep(vrednost u milisekundama)

			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.println("Nit je prekinuta.");
			}
			i++;
		}
	}

}
