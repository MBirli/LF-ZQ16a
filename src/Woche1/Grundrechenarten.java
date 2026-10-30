package Woche1;
import javax.swing.JOptionPane;

public class Grundrechenarten {

	public static void main(String[] args) {
		int zahl1 = 16;
		int zahl2 = 4;
		final double pi = 3.14;
		
		//System.out.println("Ergebnis der Addition: "+(zahl1+zahl2));
		//System.out.println("Erbegnis der Subtraktion: "+(zahl1-zahl2));
		//System.out.println("Ergebnis der Multiplikation: "+(zahl1*zahl2));
		//System.out.println("Ergebnis der DIvision: "+(zahl1/zahl2));
		//System.out.println("Multiplikation mit Konstante: "+(zahl1*pi));
		
		JOptionPane.showMessageDialog(null,"Ergebnis der Addition: "+(zahl1+zahl2)+"\nErbegnis der Subtraktion: "+(zahl1-zahl2)+
				"\nErgebnis der Multiplikation: "+(zahl1*zahl2)+
				"\nErgebnis der DIvision: "+(zahl1/zahl2)+
				"\nErgebnis der DIvision: "+(zahl1/zahl2)+
				"\nMultiplikation mit Konstante: "+(zahl1*pi)); 

	}

}
