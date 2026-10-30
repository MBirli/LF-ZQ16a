package FoSProject;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;

public class MovementGUI extends JPanel {
	
	private Board Board;
	private JTextField txtX;
    private JTextField txtY;
    private JTextField txtEnergie;
    private JLabel goldAnzeige;

	private static final long serialVersionUID = 1L;


	public MovementGUI(Board board) {
		this.Board = board;
		this.goldAnzeige = new JLabel("Gold: 0");
	    setBackground(Color.LIGHT_GRAY);
	    setBorder(new EmptyBorder(10, 10, 10, 10));
	    GridBagLayout gbl = new GridBagLayout();
	    gbl.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0}; 
	    this.setLayout(gbl);
	    Insets standardInsets = new Insets(5, 5, 5, 5);
	    //GridBagConstraints gbc = new GridBagConstraints();
	    JLabel lblTitle = new JLabel("Finde das Schloss");
	    lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
	    GridBagConstraints gbc_lblTitle = new GridBagConstraints();
	    gbc_lblTitle.gridx = 0;
	    gbc_lblTitle.gridy = 0;
	    gbc_lblTitle.gridwidth = 5;
	    gbc_lblTitle.insets = new Insets(5, 5, 15, 5); 
	    this.add(lblTitle, gbc_lblTitle);
	    JLabel lblKennzeichen = new JLabel("Kennzeichen:");
	    GridBagConstraints gbc_lblKennzeichen = new GridBagConstraints();
	    gbc_lblKennzeichen.gridx = 0;
	    gbc_lblKennzeichen.gridy = 1;
	    gbc_lblKennzeichen.anchor = GridBagConstraints.WEST;
	    gbc_lblKennzeichen.insets = standardInsets;
	    this.add(lblKennzeichen, gbc_lblKennzeichen);
	    // Kennzeichen+ Pfeil hoch
	    JTextField txtKennzeichen = new JTextField();
	    GridBagConstraints gbc_txtKennzeichen = new GridBagConstraints();
	    gbc_txtKennzeichen.gridx = 1;
	    gbc_txtKennzeichen.gridy = 1;
	    gbc_txtKennzeichen.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtKennzeichen.insets = standardInsets;
	    txtKennzeichen.setEditable(false);
	    this.add(txtKennzeichen, gbc_txtKennzeichen);

	    JButton buttonHoch = new JButton("^");
	    GridBagConstraints gbc_btnUp = new GridBagConstraints();
	    gbc_btnUp.gridx = 3;
	    gbc_btnUp.gridy = 1;
	    gbc_btnUp.fill = GridBagConstraints.HORIZONTAL;
	    gbc_btnUp.insets = standardInsets;
	    this.add(buttonHoch, gbc_btnUp);
	    buttonHoch.addActionListener(e -> board.bewegeSpieler(0, -1));

	    // Marke + Pfeil links + Pfeil rechts
	    JLabel lblMarke = new JLabel("Marke:");
	    GridBagConstraints gbc_lblMarke = new GridBagConstraints();
	    gbc_lblMarke.gridx = 0;
	    gbc_lblMarke.gridy = 2;
	    gbc_lblMarke.anchor = GridBagConstraints.WEST;
	    gbc_lblMarke.insets = standardInsets;
	    this.add(lblMarke, gbc_lblMarke);

	    JTextField txtMarke = new JTextField();
	    GridBagConstraints gbc_txtMarke = new GridBagConstraints();
	    gbc_txtMarke.gridx = 1;
	    gbc_txtMarke.gridy = 2;
	    gbc_txtMarke.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtMarke.insets = standardInsets;
	    txtMarke.setEditable(false);
	    this.add(txtMarke, gbc_txtMarke);

	    JButton buttonLinks = new JButton("<");
	    GridBagConstraints gbc_btnLeft = new GridBagConstraints();
	    gbc_btnLeft.gridx = 2;
	    gbc_btnLeft.gridy = 2;
	    gbc_btnLeft.insets = standardInsets;
	    this.add(buttonLinks, gbc_btnLeft);
	    buttonLinks.addActionListener(e -> board.bewegeSpieler(-1, 0));

	    JButton buttonRechts = new JButton(">");
	    GridBagConstraints gbc_btnRight = new GridBagConstraints();
	    gbc_btnRight.gridx = 4;
	    gbc_btnRight.gridy = 2;
	    gbc_btnRight.insets = standardInsets;
	    this.add(buttonRechts, gbc_btnRight);
	    buttonRechts.addActionListener(e -> board.bewegeSpieler(1, 0));

	    // Leistung + Pfeil runter
	    JLabel lblLeistung = new JLabel("Leistung:");
	    GridBagConstraints gbc_lblLeistung = new GridBagConstraints();
	    gbc_lblLeistung.gridx = 0;
	    gbc_lblLeistung.gridy = 3;
	    gbc_lblLeistung.anchor = GridBagConstraints.WEST;
	    gbc_lblLeistung.insets = standardInsets;
	    this.add(lblLeistung, gbc_lblLeistung);

	    JTextField txtLeistung = new JTextField();
	    GridBagConstraints gbc_txtLeistung = new GridBagConstraints();
	    gbc_txtLeistung.gridx = 1;
	    gbc_txtLeistung.gridy = 3;
	    gbc_txtLeistung.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtLeistung.insets = standardInsets;
	    txtLeistung.setEditable(false);
	    this.add(txtLeistung, gbc_txtLeistung);

	    JButton buttonRunter = new JButton("v");
	    GridBagConstraints gbc_btnDown = new GridBagConstraints();
	    gbc_btnDown.gridx = 3;
	    gbc_btnDown.gridy = 3;
	    gbc_btnDown.fill = GridBagConstraints.HORIZONTAL;
	    gbc_btnDown.insets = standardInsets;
	    this.add(buttonRunter, gbc_btnDown);
	    buttonRunter.addActionListener(e -> board.bewegeSpieler(0, 1));

	    // X Pos
	    JLabel lblX = new JLabel("X-Position:");
	    GridBagConstraints gbc_lblX = new GridBagConstraints();
	    gbc_lblX.gridx = 0;
	    gbc_lblX.gridy = 4;
	    gbc_lblX.anchor = GridBagConstraints.WEST;
	    gbc_lblX.insets = standardInsets;
	    this.add(lblX, gbc_lblX);

	    txtX = new JTextField(""+Board.getSpieler().getPosX());
	    GridBagConstraints gbc_txtX = new GridBagConstraints();
	    gbc_txtX.gridx = 1;
	    gbc_txtX.gridy = 4;
	    gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtX.insets = standardInsets;
	    txtX.setEditable(false);
	    this.add(txtX, gbc_txtX);

	    // Y Pos
	    JLabel lblY = new JLabel("Y-Position:");
	    GridBagConstraints gbc_lblY = new GridBagConstraints();
	    gbc_lblY.gridx = 0;
	    gbc_lblY.gridy = 5;
	    gbc_lblY.anchor = GridBagConstraints.WEST;
	    gbc_lblY.insets = standardInsets;
	    this.add(lblY, gbc_lblY);

	    txtY = new JTextField(""+Board.getSpieler().getPosY());
	    GridBagConstraints gbc_txtY = new GridBagConstraints();
	    gbc_txtY.gridx = 1;
	    gbc_txtY.gridy = 5;
	    gbc_txtY.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtY.insets = standardInsets;
	    txtY.setEditable(false);
	    this.add(txtY, gbc_txtY);

	    // Energie
	    JLabel lblEnergie = new JLabel("Energie:");
	    GridBagConstraints gbc_lblEnergie = new GridBagConstraints();
	    gbc_lblEnergie.gridx = 0;
	    gbc_lblEnergie.gridy = 6;
	    gbc_lblEnergie.anchor = GridBagConstraints.WEST;
	    gbc_lblEnergie.insets = standardInsets;
	    this.add(lblEnergie, gbc_lblEnergie);

	    txtEnergie = new JTextField(""+Board.getSpieler().getEnergie());
	    GridBagConstraints gbc_txtEnergie = new GridBagConstraints();
	    gbc_txtEnergie.gridx = 1;
	    gbc_txtEnergie.gridy = 6;
	    gbc_txtEnergie.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtEnergie.insets = standardInsets;
	    txtEnergie.setEditable(false);
	    this.add(txtEnergie, gbc_txtEnergie);

	    // Nachricht
	    JLabel lblNachricht = new JLabel("Nachricht / Letztes Ereignis:");
	    GridBagConstraints gbc_lblNachricht = new GridBagConstraints();
	    gbc_lblNachricht.gridx = 0;
	    gbc_lblNachricht.gridy = 7;
	    gbc_lblNachricht.anchor = GridBagConstraints.WEST;
	    gbc_lblNachricht.insets = new Insets(15, 5, 5, 5); 
	    this.add(lblNachricht, gbc_lblNachricht);

	    // Nachricht textarea
	    JTextArea txtAreaNachricht = new JTextArea();
	    txtAreaNachricht.setRows(5); 
	    GridBagConstraints gbc_txtAreaNachricht = new GridBagConstraints();
	    gbc_txtAreaNachricht.gridx = 0;
	    gbc_txtAreaNachricht.gridy = 8;
	    gbc_txtAreaNachricht.gridwidth = 5; 
	    gbc_txtAreaNachricht.fill = GridBagConstraints.BOTH; 
	    gbc_txtAreaNachricht.weighty = 1.0; 
	    gbc_txtAreaNachricht.insets = standardInsets;
	    txtAreaNachricht.setEditable(false);
	    this.add(txtAreaNachricht, gbc_txtAreaNachricht);

	    // Buttons Anwenden + Beenden
	    JButton btnAnwenden = new JButton("Anwenden");
	    GridBagConstraints gbc_btnAnwenden = new GridBagConstraints();
	    gbc_btnAnwenden.gridx = 0;
	    gbc_btnAnwenden.gridy = 9;
	    gbc_btnAnwenden.insets = new Insets(10, 5, 5, 5);
	    this.add(btnAnwenden, gbc_btnAnwenden);

	    JButton btnBeenden = new JButton("Beenden");
	    GridBagConstraints gbc_btnBeenden = new GridBagConstraints();
	    gbc_btnBeenden.gridx = 1;
	    gbc_btnBeenden.gridy = 9;
	    gbc_btnBeenden.anchor = GridBagConstraints.WEST; 
	    gbc_btnBeenden.insets = new Insets(10, 5, 5, 5);
	    this.add(btnBeenden, gbc_btnBeenden);
	    
	    // anzeige der items/money
		JPanel itemInfo = new JPanel();
		itemInfo.setBackground(Color.DARK_GRAY);
		goldAnzeige.setFont(new Font("Tahoma",Font.BOLD, 24));
		goldAnzeige.setForeground(Color.YELLOW);
		itemInfo.add(goldAnzeige);
		GridBagConstraints gbc_goldAnzeige = new GridBagConstraints();
	    gbc_lblNachricht.gridx = 5;
	    gbc_lblNachricht.gridy = 2;
	    gbc_lblNachricht.anchor = GridBagConstraints.WEST;
	    gbc_lblNachricht.insets = new Insets(15, 5, 5, 5); 
	    this.add(goldAnzeige, gbc_goldAnzeige);
	    
	    	    
	}
	public void updateAnzeigen() {
	    txtX.setText("" + Board.getSpieler().getPosX());
	    txtY.setText("" + Board.getSpieler().getPosY());
	    txtEnergie.setText("" + Board.getSpieler().getEnergie());
	    goldAnzeige.setText("Gold: "+ Board.getSpieler().getGold());
	}

	    
	    
	    
	    
	    
	    
}


