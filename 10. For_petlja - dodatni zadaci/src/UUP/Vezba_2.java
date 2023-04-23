package UUP;

import java.text.DecimalFormat;

public class Vezba_2 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.###");

		double s = 0;
		for (int i = 1; i <= 50; i++) {
			s += Math.pow(-1, i - 1) * i / (i + 1);
		}

		System.out.println("Dobijena vrednost sume je " + df.format(s));

	}

}
