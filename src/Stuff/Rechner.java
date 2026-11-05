package Stuff;

import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {

		rechnen();

	}

	public static void rechnen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl 1 eingeben: ");
		int zahl1 = scanner.nextInt();
		System.out.println("Zahl 2 eingeben: ");
		int zahl2 = scanner.nextInt();
		System.out.println("Operator auswählen: \n1 Addition\n2 Subtraktion\n3Multiplikation\n4Division\n5 Modulo");
		int operator = scanner.nextInt();
		scanner.close();
		switch (operator) {
		case 1:
			System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
			break;
		case 2:
			System.out.println(zahl1 + " - " + zahl2 + " = " + (zahl1 - zahl2));
			break;
		case 3:
			System.out.println(zahl1 + " * " + zahl2 + " = " + (zahl1 * zahl2));
			break;
		case 4:
			if (zahl2 == 0) {
				System.out.println("Durch Null darf nicht geteilt werden!");
			} else {
				System.out.println(zahl1 + " / " + zahl2 + " = " + (zahl1 / zahl2));
			}
			break;
		case 5:
			System.out.println(zahl1 + " % " + zahl2 + " = " + (zahl1 % zahl2));
			break;
		default:
			System.out.println("Fehler!");
		}

	}

}
