package Woche2;

public class Mitarbeiter {
	
	String mitarbeiterID;
	String mitarbeiterName;
	String position;
	Integer gehaltCent;
	Integer erfahrungsjahre;
	
	// Constructor I
	public Mitarbeiter() {
		this("Unbekannt", "Unbekannt", "Angestellter", 0, 0);
	}	
	// Constructor II
	public Mitarbeiter(String mitarbeiterID, String mitarbeiterName, String position) {
		this(mitarbeiterID, mitarbeiterName, position, 0, 0);
	}	
	// Constructor III
	public Mitarbeiter(String mitarbeiterID, String mitarbeiterName, String position, Integer gehaltCent, Integer erfahrungsjahre) {
		setMitarbeiterID(mitarbeiterID);
		setMitarbeiterName(mitarbeiterName);
		setPosition(position);
		setGehalt(gehaltCent);
		setErfahrungsjahre(erfahrungsjahre);
	}	
	
	public String getMitarbeiterID() {
		return mitarbeiterID;
	}
	
	public String getMitarbeiterName() {
		return mitarbeiterName;
	}
	
	public String getPosition() {
		return position;
	}
	
	public Integer getGehaltCent() {
		return gehaltCent;
	}
	
	public Integer getErfahrungsjahre() {
		return erfahrungsjahre;
	}
	
	public void setMitarbeiterID(String mitarbeiterID) {
		if (mitarbeiterID == null || mitarbeiterID.isBlank()) {
			throw new IllegalArgumentException("Mitarbeiter ID darf nicht leer sein!");			
		}
		this.mitarbeiterID = mitarbeiterID;
	}
	public void setMitarbeiterName(String mitarbeiterName) {
		if (mitarbeiterName == null || mitarbeiterName.isBlank()) {
			throw new IllegalArgumentException("Mitarbeitername Fehlt!");
		}
		this.mitarbeiterName = mitarbeiterName;
	}
	public void setPosition(String position) {
		if (position == null || position.isBlank()) {
			throw new IllegalArgumentException("Position fehlt!");
		}
		this.position = position;
	}
	public void setGehalt(Integer gehaltCent) {
		if (gehaltCent <0) {
			throw new IllegalArgumentException("Gehalt darf nicht negativ sein!");
		}
		this.gehaltCent = gehaltCent;
	}
	public void setErfahrungsjahre(Integer erfahrungsjahre) {
		if (erfahrungsjahre < 0) {
			throw new IllegalArgumentException("Erfahrungsjahre dürfen nicht negativ sein!");
		}
		this.erfahrungsjahre = erfahrungsjahre;
		
	}
	public String getInfos() {
		return ("Mitarbeiter ID: " + getMitarbeiterID() + "\nName: " + getMitarbeiterName() + "\nPosition: " 
	+ getPosition() + "\nGehalt: " + String.format("%.2f",(getGehaltCent()/100.0)) +" EUR\nErfahrungsjahre: "+getErfahrungsjahre()+"\n");
	}
			
	

}
