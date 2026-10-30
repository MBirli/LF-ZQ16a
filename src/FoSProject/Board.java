package FoSProject;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Board extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static final int BREITE = 15;
	public static final int HOEHE = 15;
	final static int ABSTANDPIXELS = 0;
	public static final int FRAMEGROESSE = 700;
	public JLabel[][] spielfeldMatrix = new JLabel[HOEHE][BREITE];
	// Spielfigur setzen
	private static Spielfigur spieler = new Spielfigur();
	public static Spielfigur getSpieler() {
		return spieler;
	}
	private MovementGUI steuerung;


	public static void main(String[] args) {
		RNGfromHash.init();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board frame = new Board();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static int getBoardBreite(){
		return BREITE;
	}
	public static int getBoardHoehe() {
		return HOEHE;
	}
	public static int getFramegroesse() {
		return FRAMEGROESSE;
	}
	public static int getBreite() {
		return BREITE;
	}
	public static int getHoehe() {
		return HOEHE;
	}
		

	public Board() {
		setDefaultCloseOperation(Board.EXIT_ON_CLOSE);
		setBounds(100, 100, FRAMEGROESSE, FRAMEGROESSE*140/100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,10));

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(HOEHE, BREITE, ABSTANDPIXELS, ABSTANDPIXELS));
		for (int r = 0; r < HOEHE; r++) {
			for (int c = 0; c < BREITE; c++) {
				JLabel feld = new JLabel();
				feld.setOpaque(true);
				feld.setBackground(Color.CYAN);
				feld.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
				spielfeldMatrix[r][c] = feld;
				panel.add(feld);
			}

		}
		JPanel southContainer = new JPanel();
		southContainer.setBackground(Color.LIGHT_GRAY);
		// contentPane.add(panel, BorderLayout.CENTER);
		steuerung = new MovementGUI(this);
		southContainer.add(steuerung);
		contentPane.add(southContainer, BorderLayout.SOUTH);
		
		if (spieler.getIcon() != null) {
			spielfeldMatrix[spieler.getPosY()][spieler.getPosX()].setIcon(spieler.getIcon());
		} else {
			spielfeldMatrix[spieler.getPosY()][spieler.getPosX()].setText("AUTO");
		}	
		SpecialTilesSetup specialTiles = new SpecialTilesSetup(this);
		specialTiles.generateSpecialTilesInit();
		
	}	
	
	public void bewegeSpieler(int deltaX, int deltaY) {
		if (spieler.getEnergie()<spieler.getEnergieVerbrauch()) {
			System.out.println("Spiel verloren, sorry bru! Gold gesammelt: "+spieler.getGold()+"! WOW!"); //gameover
			return;
		}
		int neuesX = spieler.getPosX() + deltaX;
		if (neuesX <0) {
			neuesX = BREITE-1;
		} else if (neuesX > BREITE-1) {
			neuesX = 0;
		}
		int neuesY = spieler.getPosY() + deltaY;
		if (neuesY <0) {
			neuesY = HOEHE-1;
		} else if (neuesY > HOEHE-1) {
			neuesY = 0;
		}
		spieler.setEnergie(spieler.getEnergie()-spieler.getEnergieVerbrauch());
		spielfeldMatrix[spieler.getPosY()][spieler.getPosX()].setIcon(null);
		spielfeldMatrix[spieler.getPosY()][spieler.getPosX()].setText(null);
		movementTilesCheck(neuesX, neuesY);
		spieler.setPosX(neuesX);
		spieler.setPosY(neuesY);
		System.out.println(RNGfromHash.genNum(100));
		if (spieler.getIcon() != null) {
			spielfeldMatrix[spieler.getPosY()][spieler.getPosX()].setIcon(spieler.getIcon());
		} else {
			spielfeldMatrix[spieler.getPosY()][spieler.getPosX()].setText("AUTO");
		}
		steuerung.updateAnzeigen();
		
	}
	public void movementTilesCheck(int neuesX, int neuesY) {
		Point neuePosSpieler = new Point (neuesX, neuesY);
		if (SpecialTilesSetup.getSpecialTilesMap().containsKey(neuePosSpieler)){
			//System.out.println("test");
			SpecialTile begehtesTile = SpecialTilesSetup.getSpecialTilesMap().get(neuePosSpieler);
			System.out.println(begehtesTile);
			begehtesTile.begehe(spieler);
			SpecialTilesSetup.getSpecialTilesMap().remove(neuePosSpieler);
			
			
		}
		
	}
	
}
