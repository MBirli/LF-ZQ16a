package Woche1;
import javax.swing.JOptionPane;

public class ModuloBerechnen {
	
	public static int eingabe1() {
		String eingabe = JOptionPane.showInputDialog(
	            null, 
	            "Gib die erste Zahl ein:", 
	            "Eingabe 1", 
	            JOptionPane.QUESTION_MESSAGE
	        );
	    if (eingabe != null && !eingabe.isEmpty()) {
            try {
                int eingabeAsInt = Integer.parseInt(eingabe);
                return eingabeAsInt;
            } catch (NumberFormatException e) {
                System.out.println("Bitte gib eine gültige volle Zahl ein.");
            }
        } else {
            System.out.println("Eingabe wurde abgebrochen.");
        }
	    return 0; 
	}
	
	public static int eingabe2() {
		String eingabe = JOptionPane.showInputDialog(
	            null, 
	            "Gib die zweite Zahl ein:", 
	            "Eingabe 2", 
	            JOptionPane.QUESTION_MESSAGE
	        );
		if (eingabe != null && !eingabe.isEmpty()) {
	        try {
	            int eingabeAsInt = Integer.parseInt(eingabe);
	            return eingabeAsInt;
	        } catch (NumberFormatException e) {
	            System.out.println("Bitte gib eine gültige volle Zahl ein.");
	        }
	    } else {
	        System.out.println("Eingabe wurde abgebrochen.");
	    }
		return 0; 
	}

	public static void main(String[] args) {
		 int eingabe1 = eingabe1();
		 int eingabe2 = eingabe2();
		 
		 if (eingabe2 == 0) {
			 JOptionPane.showMessageDialog(null, "Division durch 0 ist nicht erlaubt!");
		 } else {
			 int rest = eingabe1 % eingabe2;
			 JOptionPane.showMessageDialog(null, "Der Rest der Division von "+ eingabe1 + " durch " + eingabe2 + " ist " + rest +".");
		 }
	}
}
