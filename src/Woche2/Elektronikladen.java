package Woche2;

public class Elektronikladen {
	public static void main(String[] args) {

		Smartphone s1 = new Smartphone("Apple", Farbe.SCHWARZ, 256);
		System.out.println(s1.getBeschreibung());

		Smartphone s2 = new Smartphone("Samsung", Farbe.BLAU, 128);
		System.out.println(s2.getBeschreibung());

		Smartphone s3 = new Smartphone("Xiaomi", Farbe.SCHWARZ, 128);
		System.out.println(s3.getBeschreibung());

		Smartphone s4 = new Smartphone("Apple");
		System.out.println(s4.getBeschreibung());
		
		s1.erweitereSpeicher(64);
		System.out.println(s1.getBeschreibung());
	}
}
