package FoSProject;
import java.util.Random;
// Random number generator der das eingegebene kennzeichen des fahrzeugs als seed nutzt
// d.h. das selbe eingetragene kennzeichen wird immer die exakt selben random nummbern generieren, zB beim erstellen der special tiles

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
