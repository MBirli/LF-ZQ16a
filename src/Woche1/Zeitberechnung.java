package Woche1;
import javax.swing.JOptionPane;

public class Zeitberechnung {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog(
	            null, 
	            "Gib die Zahl in Millesekunden ein: ", 
	            "Eingabe", 
	            JOptionPane.QUESTION_MESSAGE
	        );
	    if (eingabe != null && !eingabe.isEmpty()) {
            try {
            	long eingabeAsLong = Long.parseLong(eingabe);
            	int jahre = (int) (eingabeAsLong / (1000 * 60 * 60 * 24 * 365.25));
            	

            } catch (NumberFormatException e) {
                System.out.println("Bitte gib eine gültige volle Zahl ein.");
            }
        } else {
            System.out.println("Eingabe wurde abgebrochen.");
        }
	     

	}

}
