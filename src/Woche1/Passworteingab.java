package Woche1;
import java.util.Scanner;

public class Passworteingab {
	
	public static Boolean pwEingabe() {
		final int VERSUCHE = 3;
		String passwort = "12345";
		String eingabe = "";
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < VERSUCHE; i++) {
			System.out.println("Bitte Passwort eingben: ");
			eingabe = scanner.nextLine();
			if (eingabe.equals(passwort) == true) {
				System.out.println("Passwort korrekt!");
				return true;				
			} else {
				System.out.println("Passwort falsch! " + (VERSUCHE-i-1) + " Versuche übrig!" );
			}
			
			
		} return false;
		
	}
	
	

	public static void main(String[] args) {
		pwEingabe();

	}

}
