package FoSProject;

public class MovementGUIUpdate {
	
	//private Board board;
	
	public static void updateAnzeigen() { // regular values
		Board.getMovementGUI().setTxtX(Board.getSpieler().getPosX());
		Board.getMovementGUI().setTxtY(Board.getSpieler().getPosY());
		Board.getMovementGUI().setTxtEnergie(Board.getSpieler().getEnergie());
		Board.getMovementGUI().setGoldAnzeige(Board.getSpieler().getGold());
		// event log
		Board.getMovementGUI().setTxtAreaNachricht(String.valueOf(RNGfromHash.genNum(100)));
	}

}
