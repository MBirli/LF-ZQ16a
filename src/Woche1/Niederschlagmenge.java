package Woche1;
import javax.swing.JOptionPane;

public class Niederschlagmenge {
	
	public static float niederschlag(String monat) {
		String eingabe = JOptionPane.showInputDialog(
	            null, 
	            "Geben Sie die Niederschlagsmenge für " + monat + " in l/qm ein:", 
	            "Eingabe", 
	            JOptionPane.QUESTION_MESSAGE
	        );
	    if (eingabe != null && !eingabe.isEmpty()) {
            try {
                float eingabeAsFloat = Float.parseFloat(eingabe);
                return eingabeAsFloat;
            } catch (NumberFormatException e) {
                System.out.println("Bitte gib eine gültige Zahl ein.");
            }
        } else {
            System.out.println("Eingabe wurde abgebrochen.");
        }
	    return 0; 
	}

	public static void main(String[] args) {
		float niederSchlagAPril = niederschlag("April");
		float niederSchlagMai = niederschlag("Mai");
		float niederSchlagJuni = niederschlag("Juni");
		float durchschnitt = (niederSchlagAPril+niederSchlagMai+niederSchlagJuni)/3;
		
		 JOptionPane.showMessageDialog(null, 
				 "Die Niederschlagsmelge für April ist: "+niederSchlagAPril+ " l/qm"+
				 "\nDie Niederschlagsmelge für Mai ist: "+niederSchlagMai+" l/qm"+
				 "\nDie Niederschlagsmelge für Juni ist: "+niederSchlagJuni+" l/qm"+
				 "\n\nDie durchschnittliche Niederschlagsmenge beträgt: "+ String.format("%.2f",durchschnitt)+"l/qm");
				 
		

	}

}
