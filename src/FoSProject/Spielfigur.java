package FoSProject;

import javax.swing.JFrame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Spielfigur {
	private String kennzeichen = "aaaaa";
	private int posX = (Board.getBoardBreite() / 2); // start X
	private int posY = (Board.getBoardHoehe() / 2); // start Y
	private int energieMax = 1500; // startenergie
	private int energie = 1500; // startenergie
	private int energieVerbrauch = 30; // energiekosten pro tile bewegt
	//final int PLAYERSIZE = 50; // groesse der spiefigur in pixeln
	private int gold = 0;
	final static int PLAYERSIZEX = ((Board.getFramegroesse()/Board.getBreite())*105/100); // groesse der spiefigur in pixeln, breite
	final static int PLAYERSIZEY = ((Board.getFramegroesse()/Board.getHoehe())*105/100); // groesse der spiefigur in pixeln, hoehe
	private ImageIcon icon;

	public Spielfigur() {
		try {
			ImageIcon original = new ImageIcon(getClass().getResource("/FoSProject/images/player.png"));
			Image scaled = original.getImage().getScaledInstance(PLAYERSIZEX, PLAYERSIZEY, Image.SCALE_SMOOTH);
			this.icon = new ImageIcon(scaled);
		} catch (Exception e) {
			System.out.println("Spieler-Grafik konnte nicht geladen werden!");
		}
	}

	// getter und setter
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getEnergie() {
		return energie;
	}

	public int getEnergieVerbrauch() {
		return energieVerbrauch;
	}
	public int getGold() {
		return gold;
	}
	public int getEnergieMax() {
		return energieMax;
	}
	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public void setEnergieVerbrauch(int energieverbrauch) {
		this.energieVerbrauch = energieverbrauch;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}

	public ImageIcon getIcon() {
		return icon;
	}
	public void setKennzeichen() {
		this.kennzeichen = kennzeichen;
	}

}

/*
 * JFrame fenster = new JFrame("Bild");
 * fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * fenster.setSize(500,500); ImageIcon icon = new
 * ImageIcon(Spielfigur.class.getResource("/FoSProject/images/player.png"));
 * java.awt.Image iconSkaliert = icon.getImage().getScaledInstance(PLAYERSIZE,
 * PLAYERSIZE, java.awt.Image.SCALE_SMOOTH); ImageIcon iconFinal = new
 * ImageIcon(iconSkaliert); JLabel label = new JLabel(iconFinal);
 * fenster.add(label); fenster.setVisible(true);
 * 
 * 
 * }
 */
