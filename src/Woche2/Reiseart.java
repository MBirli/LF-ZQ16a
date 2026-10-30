package Woche2;

public enum Reiseart {
	PAUSCHALREISE, STAEDTEREISE, KREUZFAHRT, ADVENTURE_REISE;
	
	public String getName() {
		// über die fordefinierte Funktion name() kann ich auf den Wert zugreifen,
		// den ich gerade repräsentiere (z.B. KREUZFAHRT)
		
		// Variante 1 - mit toLowerCase() gebe ich den Namen in Kleinbuchstaben zurück
		// return name().toLowerCase();
		
		// Variante 2 - Erster Buchstabe groß, alle restlichen Buchstaben klein!
		String nameKlein = name().toLowerCase();
		return nameKlein.substring(0, 1).toUpperCase() + nameKlein.substring(1);
	}
}
