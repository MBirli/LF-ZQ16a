package Woche1;

public class Zahlendreieck {
	
	public static void zahlendreieck(int groesse) {
		for (int i = 0; i <= groesse; i++ ){
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			} System.out.printf("\n");
		}
	}

	public static void main(String[] args) {
		
		zahlendreieck(5);

	}
	

}
