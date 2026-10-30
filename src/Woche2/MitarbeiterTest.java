package Woche2;

public class MitarbeiterTest {

	public static void main(String[] args) {
		
		Mitarbeiter m1 = new Mitarbeiter();
		Mitarbeiter m2 = new Mitarbeiter("001", "bob", "dude", 50000, 0);
		System.out.println(m1.getInfos());
		System.out.println(m2.getInfos());
		Mitarbeiter dummy = new Mitarbeiter();
		System.out.println(dummy.getInfos());
		// eintraege der aufgabe:
		Mitarbeiter m3 = new Mitarbeiter("EMP001", "Max Mustermann", "Entwickler", 5000000, 5);
		Mitarbeiter m4 = new Mitarbeiter("EMP002", "Maria Müller", "Manager", 7500000, 8);
		Mitarbeiter m5 = new Mitarbeiter("EMP003", "John Doe", "Designer", 4500000, 3);
		
		System.out.println(m3.getInfos());
		System.out.println(m4.getInfos());
		System.out.println(m5.getInfos());

	}

}
