package Woche1;
import java.util.Scanner;


public class QuadratischeGleichungen {

		public static void rechnen(double a, double b, double c) {
			if ( a == 0) {
				if (b != b) {
					System.out.println("Lineare Gleichung, Lösung: " + (-c / b));
				} else {
					System.out.println("Ungültige Eingaben! (a und b sind 0)");
				}
				return; // abbruch weil sonst durch null geteilt wird
			}
			
			c /= a;
			b /= a;
			// PQ formel bro
			double x1 = ((-b)/2) + (Math.sqrt(Math.pow(b/2,2)-c));
			double x2 = ((-b)/2) - (Math.sqrt(Math.pow(b/2,2)-c));
			
			System.out.println("x1/2 = " + x1+ "  " + x2);
		}
		
		public static void diskriminante(double a, double b, double c) {
			double d = (b*b) - (4*a*c);
			System.out.println("Der Wert der Diskriminante liegt bei " + d);
			if (d < 0) {
				System.out.println("Die Eingaben erzeugen keine reelle Lösung"); // ausgabe NaN
			} else if (Math.abs(d) < 0.0001) { // winzige toleranz zu +/-0 wegen datentypen
				System.out.println("Die Eingaben erzeugen genau eine Lösung");
			} else {
				System.out.println("Die Eingaben erzeugen 2 Lösungen");
			}
			
		}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a eingeben: ");
		double a = scanner.nextDouble();
		System.out.println("b eingeben: ");
		double b = scanner.nextDouble();
		System.out.println("c eingeben: ");
		double c = scanner.nextDouble();

		diskriminante(a, b, c);
		rechnen(a, b, c);
		
	}

}
