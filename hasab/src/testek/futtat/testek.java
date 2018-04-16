package testek.futtat;

import testek.henger;
import testek.teglatest;

public class testek {

	public static void main(String[] args) {
		henger henger = new henger(1, 2);
		
		System.out.println(henger);
		System.out.println("Terfogat= "+henger.terfogat());
		
		teglatest teglatest = new teglatest(3, 4, 5);
		System.out.println(teglatest);
		System.out.println("Terfogat= "+teglatest.terfogat());
		
		if (teglatest.terfogatnagyobb(henger)) {
			System.out.println("A teglatest nagyobb terfogatú");
			
		} else {
			System.out.println("A henger nagyobb terfogatú");
		}
	}

}
