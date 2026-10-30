package Woche1;
import javax.swing.JOptionPane;

public class ServerWartung {
	
	public static int eingabeAnzahl() {
		return Integer.parseInt(JOptionPane.showInputDialog(null,"Gib die Anzahl der Server ein, die gewartet werden sollen: ","Eingabe",JOptionPane.QUESTION_MESSAGE));
	}
	
	public static void int eingabeAuswahl(String phase, int serverNr) { // 1 = erfolgreich, 2 = schritt uebersprungen, 3 = wartnung fuer diesen server abbrechen
		
	}
	
	public static String phasen(int phaseNr) { // 1 = hardware, 2 = software, 3 = reboot
		switch (phaseNr) {
		case 1: return "Hardware-Check"; break;
		case 2: return "Software-Update"; break;
		case 3: return "Reboot"; break;
		default: System.out.println("Fehlerhafter Input"); break;
		}
	}
	
	public static void ausgabe(int serverNr, int eingabeAuswahl, int status) { // status: 0 = nicht relevant, 1 = beginng, 2 = fertig
		if (eingabeAuswahl == 3) {
			JOptionPane.showMessageDialog(null, "Wartung für Server "+serverNr+" abgebrochen.", "Meldung", JOptionPane.INFORMATION_MESSAGE);
		} else if (status == 1) {
			JOptionPane.showMessageDialog(null, "Wartung für Server "+serverNr+" beginn.", "Meldung", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Wartung für Server "+serverNr+" beginn.", "Meldung", JOptionPane.INFORMATION_MESSAGE);
			
		} 
		
	}
	
	
	

	public static void main(String[] args) {
		

	}

}
