package Woche2;

public class Smartphone {

	private String hersteller;
	private Farbe farbe;
	private Integer speicher;

	public Smartphone(String hersteller, Farbe farbe, Integer speicher) { // constructor I
		setHersteller(hersteller);
		waehleFarbton(farbe);
		setSpeicher(speicher);
	}

	public Smartphone(String hersteller) { // constructor II
		this(hersteller, Farbe.SCHWARZ, 64);
	}

	public String getHersteller() {
		return hersteller;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	public Integer getSpeicher() {
		return speicher;
	}

	private void setHersteller(String hersteller) {
		if (hersteller == null || hersteller.isBlank()) {
			throw new IllegalArgumentException("Leere Herstellerbezeichnungen sind nicht gestattet!");
		}
		this.hersteller = hersteller;
	}

	public void waehleFarbton(Farbe farbe) {
		if (farbe == null) {
			throw new IllegalArgumentException("Leere Farbangaben sind nicht gestattet!");
		}
		this.farbe = farbe;
	}

	public void setSpeicher(Integer speicher) {
		if (speicher == null || speicher < 1 || speicher > 1024) {
			throw new IllegalArgumentException("Speichereintrag ungültig!");
		}
		this.speicher = speicher;
	}

	public String getBeschreibung() {
		return ("Hersteller: " + getHersteller() + ", Farbe: " + getFarbe().getName() + ", Speicher: " + getSpeicher() + " GB");
	}
	
	public void erweitereSpeicher(Integer speicherErweiterung) {
		if (speicherErweiterung == null || speicherErweiterung < 0 ||  speicherErweiterung > 1024) {
			throw new IllegalArgumentException("Ungültige Eingabe!");
		}
		this.speicher = speicher + speicherErweiterung;
	}
	
	public void verringereSPeicher(Integer speicherVerringerung) {
		if (speicherVerringerung == null || speicherVerringerung < 0 || this.speicher < speicherVerringerung) {
			throw new IllegalArgumentException("Ungültige Eingabe!"); 
		}
		this.speicher = speicher - speicherVerringerung;
	}
}