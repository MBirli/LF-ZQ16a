package FoSProject;

import javax.swing.Icon;

public abstract class SpecialTile {

	private final String name;
	private Icon icon;

	public SpecialTile(String name) {
		this.name = name;
	}

	public abstract void begehe(Spielfigur spieler);
	public String getName() { return name;
	}
	public Icon getIcon() {
		return icon;
	}
}
class EnergieTile extends SpecialTile {
	private final int energieWert;
	public EnergieTile(int energieWert) {
		super("Energie-Tile");
		this.energieWert = energieWert;
	}
	@Override
	public void begehe(Spielfigur spieler) {
		System.out.println("bro hat Energie gefunden (testmsg) +"+energieWert+" Energie!");
		spieler.setEnergie(spieler.getEnergie()+energieWert);
		if (spieler.getEnergie() > spieler.getEnergieMax()) {
			spieler.setEnergie(spieler.getEnergieMax());
		}
	}
}

class TreasureTile extends SpecialTile{
	private final int treasureValue;
	public TreasureTile(int treasureValue) {
		super("Treasure-Tile");
		this.treasureValue = treasureValue;
	}
	@Override
	public void begehe(Spielfigur spieler) {
		System.out.println("bro hat gold gefunden (testmsg) +"+treasureValue+ " Gold!");
		spieler.setGold(spieler.getGold()+treasureValue);
	}
}
