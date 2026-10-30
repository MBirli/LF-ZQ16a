package Woche1;
import javax.swing.JOptionPane;

public class RechnerMitTextMenue {
	
	public static void rechner() {
		String eingabe = JOptionPane.showInputDialog(null,"Die gib erste Zahl ein: ","Eingabe",JOptionPane.QUESTION_MESSAGE);
		double zahl1 = Double.parseDouble(eingabe);
		eingabe = JOptionPane.showInputDialog(null,"Die gib zweite Zahl ein: ","Eingabe",JOptionPane.QUESTION_MESSAGE);
		double zahl2 = Double.parseDouble(eingabe);
		eingabe = JOptionPane.showInputDialog(null,"Wähle einen Operatoren:\n"
				+ "1. Addition\n"
				+ "2. Subtraktion\n"
				+ "3. Multiplikation\n"
				+ "4. Division\n"
				+ "5. Beenden","Eingabe",JOptionPane.QUESTION_MESSAGE);
		double ergebnis = 0;
		int operator = Integer.parseInt(eingabe);
		switch(operator) {
		case 1:
			ergebnis = zahl1+zahl2; addition(ergebnis);break;
		case 2:
			ergebnis = zahl1-zahl2; subtraktion(ergebnis); break;
		case 3:
			ergebnis = zahl1*zahl2; multiplikation(ergebnis); break;
		case 4:
			ergebnis = zahl1/zahl2; division(ergebnis); break;
		case 5: beenden(); break;
		default: beenden(); break;
				
		}
	}
	
	public static void addition(double ergebnis) {
		JOptionPane.showMessageDialog(null, "Ergebnis der Addition: "+ ergebnis, "Meldung", JOptionPane.INFORMATION_MESSAGE);
		neustart();
	}
	public static void subtraktion(double ergebnis) {
		JOptionPane.showMessageDialog(null, "Ergebnis der Subtraktion: "+ ergebnis, "Meldung", JOptionPane.INFORMATION_MESSAGE);
		neustart();
	}
	public static void multiplikation(double ergebnis) {
		JOptionPane.showMessageDialog(null, "Ergebnis der Multiplikation: "+ ergebnis, "Meldung", JOptionPane.INFORMATION_MESSAGE);
		neustart();
	}
	public static void division(double ergebnis) {
		JOptionPane.showMessageDialog(null, "Ergebnis der Division :"+ ergebnis, "Meldung", JOptionPane.INFORMATION_MESSAGE);
		neustart();
	}
		
	
	public static void neustart() {
		String eingabe = JOptionPane.showInputDialog(null,"Mochtest du das Programm wiederholen? (ja/nein)","Eingabe",JOptionPane.QUESTION_MESSAGE);
		if (("ja".equals(eingabe)) == true) {
			rechner();
		} else {
			beenden();
		}
	}
	
	public static void beenden() {
        JOptionPane.showMessageDialog(null, "Das Programm wird beendet.", "Meldung", JOptionPane.INFORMATION_MESSAGE);
	}
	

	public static void main(String[] args) {
		rechner();

	}

}
