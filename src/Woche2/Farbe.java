package Woche2;

public enum Farbe {
	GELB, BLAU, ROT, SCHWARZ;
	
	public String getName(){
		return name().substring(0, 1) + name().substring(1).toLowerCase();
	}

}
