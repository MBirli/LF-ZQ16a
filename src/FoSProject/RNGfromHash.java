package FoSProject;
import java.util.Random;


public class RNGfromHash {
	private static Random random;
	public static void init() {
		long seed = Board.getSpieler().getKennzeichen().hashCode();
		random = new Random(seed);
		System.out.println("RNG erfolgreich initalisiert mit Seed "+ seed);		
	}
	public static int genNum(int input) { // input = max value -1
		return random.nextInt(input);
	}

}
