package paket;

public class Main4 {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		// Kada odredjenoj niti zelite da dodate prioritet izvrsavanja,
		// pozovite metodu setPriority() koja je clan klase Thread
		
		// void setPriority(nivo)
		// Parametrom "nivo" zadajete nivo prioriteta niti za koju je metoda pozvana.
		// Vrednost mora biti u opsegu izmedju MIN_PRIORITY i MAX_PRIORITY
		// a vrednosti tih konstanti su izmedju 1 i 10
		// Default tj. podrazumevana vrednost iznosi 5, a moze se zadati preko NORM_PRIORITY
		
		b.setPriority(Thread.MAX_PRIORITY -0); // 10 -> 3
		a.setPriority(Thread.MIN_PRIORITY +3); // 1 -> 6
		
		a.start();
		b.start();

		
		System.out.println("Kraj glavne niti. ");
		


	}

}
