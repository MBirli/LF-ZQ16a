package Woche1;
import javax.swing.JOptionPane;

public class MinutenInSekunden {

	public static void main(String[] args) {
		 String eingabe = JOptionPane.showInputDialog(
		            null, 
		            "Gib die Anzahl der Minuten ein:", 
		            "Eingabe", 
		            JOptionPane.QUESTION_MESSAGE
		        );
		 if (eingabe != null && !eingabe.isEmpty()) {
	            try {
	                int minuten = Integer.parseInt(eingabe);
	                JOptionPane.showMessageDialog(null, minuten + " Minuten sind " + (minuten*60) + " Sekunden." );
	            } catch (NumberFormatException e) {
	                System.out.println("Bitte gib eine gültige volle Zahl ein.");
	            }
	        } else {
	            System.out.println("Eingabe wurde abgebrochen.");
	        }

	}

}
