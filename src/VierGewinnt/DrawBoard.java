package VierGewinnt;

public class DrawBoard {
	final static int boardBreite = 7;
	final static int boardHoehe = 6;
	final static String divH = "---";
	final static String divV = "|";
	final static String divC = "+";
	static String player1 = "X";
	static String player2 = "O";
	final static String boardMatrix[][] = new String[boardHoehe* 2 + 1][boardBreite* 2 + 1];

	public static void boardInit() {
		for (int y = 0; y < boardMatrix.length; y++) {
			for (int x = 0; x < boardMatrix[y].length; x++) {
				if (y % 2 == 0) {
					boardMatrix[y][x] = (x % 2 == 0) ? divC : divH;
				} else {
					if (x % 2 == 0) {
						boardMatrix[y][x] = divV;
					} else {
						boardMatrix[y][x] = "   ";
					}
				}
			}
		}
	}
	public static void printBoard() {
		for (int y = 0; y<boardMatrix.length;y++) {
			for (int x = 0; x<boardMatrix[y].length;x++) {
				System.out.print(boardMatrix[y][x]);
			}
			System.out.println();
		}
	}

}
