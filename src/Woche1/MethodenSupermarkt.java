package Woche1;
import java.util.Scanner;

public class MethodenSupermarkt {
	
	public static void einkaufBearbeiten() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Produktname eingeben: ");
		String produkt = scanner.nextLine();
		System.out.println("Anazahl eingeben: ");
		int anzahl = scanner.nextInt();
		System.out.println("Einzelpreis eingeben: ");
		float einzelpreis = scanner.nextFloat();
		druckeKassenbon(produkt, anzahl, einzelpreis);
		scanner.close();		
	}
	
	public static float berechneGesamtpreis(int anzahl, float einzelpreis) {
		return anzahl * einzelpreis;
	}
	
	public static void druckeKassenbon(String produkt, int anzahl, float einzelpreis) {
		float gesamtpreis = berechneGesamtpreis(anzahl, einzelpreis);
		System.out.println("Kassenbon");
		System.out.println("--------------------");
		System.out.println("Produkt: " + produkt);
		System.out.println("Anzahl: " + anzahl);
		System.out.printf("Preis pro Flasche: %.2f€%n", einzelpreis);
		System.out.println("--------------------");
		System.out.printf("Gesamtpreis: %.2f€%n", gesamtpreis);	
	}

	public static void main(String[] args) {
		einkaufBearbeiten();

	}

}
