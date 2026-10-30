package FoSProject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Point;

public class SpecialTilesSetup {

	private Board board;

	private static HashMap<Point, SpecialTile> specialTilesMap = new HashMap<>();
	public SpecialTilesSetup(Board board) {
		this.board = board;
	}	

	public static HashMap<Point, SpecialTile> getSpecialTilesMap() {
		return specialTilesMap;
	}
/*
	public int rndGridX() {
		return ThreadLocalRandom.current().nextInt(0, board.getBreite());
	}

	public int rndGridY() {
		return ThreadLocalRandom.current().nextInt(0, board.getHoehe());
	}
*/
	public void generateSpecialTilesInit() {
		final int[] SPECIAL_TILES_SETUP = { 5, 4 };
		for (int i = 0; i < SPECIAL_TILES_SETUP.length; i++) {
			for (int j = 0; j < SPECIAL_TILES_SETUP[i]; j++) {
				int rndX, rndY;
				while (true) {
					rndX = RNGfromHash.genNum(board.getBreite());
					rndY = RNGfromHash.genNum(board.getHoehe());
					if ((board.spielfeldMatrix[rndY][rndX].getText() == null
							&& board.spielfeldMatrix[rndY][rndX].getIcon() == null)
							|| ((board.spielfeldMatrix[rndY][rndX].getText() == ""
									&& board.spielfeldMatrix[rndY][rndX].getIcon() == null))) {
						Point position = new Point(rndX, rndY);
						if (!specialTilesMap.containsKey(position)) {
							SpecialTile specialTile = null;
							switch (i) {
							case 0:
								specialTile = new EnergieTile(200);
								board.spielfeldMatrix[rndY][rndX].setText("Energie");
								break;
							case 1:
								specialTile = new TreasureTile(10);
								board.spielfeldMatrix[rndY][rndX].setText("Treasure");
								break;
							default:
								System.out.println("Irgendwas lief schief, fixen bitte!");
								break;
							}
							specialTilesMap.put(position, specialTile);
							break;
						}

					}
				}
			}
		}

	}

}
/*
 * public void generateSpecialTilesInit() { int anzahlTreasure = 5; int
 * anzahlEnergie = 4; final Map<Integer, String> tileNames = Map.of(1,
 * "Treasure", 2, "Energie");
 * 
 * for (int i = 0; i < anzahlTreasure; i++) { // TODO; deb scgeuss aendern:
 * durch 2d arrays oder idealerweise per // eigener klasse:zB TileINfo(name, id,
 * amountgenerated, effect, // etc.) generateSpecialTile(1); } for (int i = 0; i
 * < anzahlEnergie; i++) { generateSpecialTile(2); } }
 * 
 * public void generateSpecialTile(int tileID) { int rndX, rndY; while (true) {
 * rndX = rndGridX(); rndY = rndGridY(); if
 * ((board.spielfeldMatrix[rndY][rndX].getText() == null &&
 * board.spielfeldMatrix[rndY][rndX].getIcon() == null) ||
 * ((board.spielfeldMatrix[rndY][rndX].getText() == "" &&
 * board.spielfeldMatrix[rndY][rndX].getIcon() == null))) { switch (tileID) {
 * case 1: board.spielfeldMatrix[rndY][rndX].setText("Treasure"); break; case 2:
 * board.spielfeldMatrix[rndY][rndX].setText("Energie"); break; default:
 * System.out.println("ungueltige tile ID (generierung)"); break; } return; } }
 * }
 * 
 * public void collectTreasure() {
 * 
 * }
 * 
 * public void collectEnergie() {
 * 
 * } }
 */
