package FoSProject;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class SpecialTile {
	
	private final String name;
	protected final Icon icon; 

	public SpecialTile(String name, Icon icon) {
		this.name = name;
		this.icon = icon;
	}

	public abstract void begehe(Spielfigur spieler);
	
	public String getName() { 
		return name;
	}
	
	public Icon getIcon() {
		return icon;
	}
}

class EnergieTile extends SpecialTile {
	private final int energieWert;
	
	public EnergieTile(int energieWert) {
		super("Energie-Tile", TileAssetManager.getIcon("/FoSProject/images/energieTile.png"));
		this.energieWert = energieWert;
	}
	
	@Override
	public void begehe(Spielfigur spieler) {
		System.out.println("bro hat Energie gefunden (testmsg) +" + energieWert + " Energie!");
		spieler.setEnergie(spieler.getEnergie() + energieWert);
		if (spieler.getEnergie() > spieler.getEnergieMax()) {
			spieler.setEnergie(spieler.getEnergieMax());
		}
	}
}

class TreasureTile extends SpecialTile {
	private final int treasureValue;
	
	public TreasureTile(int treasureValue) {
		super("Treasure-Tile", TileAssetManager.getIcon("/FoSProject/images/treasureTile.png"));
		this.treasureValue = treasureValue;
	}
	
	@Override
	public void begehe(Spielfigur spieler) {
		System.out.println("bro hat gold gefunden (testmsg) +" + treasureValue + " Gold!");
		spieler.setGold(spieler.getGold() + treasureValue);
	}
}
