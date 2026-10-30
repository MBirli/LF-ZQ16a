package Woche2;

public class Reise {
	// Attribute - Eigenschaften:
	private String reiseziel;
	private Reiseart reiseart;
	private Integer reiseDauerTage = 0;
	
	Reise(String reiseziel, Reiseart reiseart, Integer reiseDauerTage){
		setReiseziel(reiseziel);
		setReiseart(reiseart);
		setReiseDauer(reiseDauerTage);
	}
	
	Reise(Reiseart reiseart){
		this("Mallorca", reiseart, 31);
	}



	public String getReiseziel() {
		return reiseziel;
	}

	public void setReiseziel(String reiseziel) {
		this.reiseziel = reiseziel;
	}

	public Reiseart getReiseart() {
		return reiseart;
	}

	public void setReiseart(Reiseart reiseart) {
		this.reiseart = reiseart;
	}

	public Integer getReiseDauerTage() {
		return reiseDauerTage;
	}

	public void setReiseDauer(Integer reiseDauerTage) {
		this.reiseDauerTage = reiseDauerTage;
	}

	// Methode - Verhalten:
	String getBeschreibung() {
		return "Eine " + getReiseart().getName() + " nach " + getReiseziel() + " mit Reisedauer von " + getReiseDauerTage() + " Tage/n!";
	}

}

