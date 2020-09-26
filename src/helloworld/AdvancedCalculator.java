package helloworld;

import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zahl = 0;

		do {
			System.out.println("Gib eine Zahl ein!");
			zahl = zahl + getNextNumber(scanner);
		} while (!scanner.hasNext("calc"));

		System.out.println("Die Summe ist: " + zahl);
		scanner.close();
	}

	private static int getNextNumber(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println(scanner.next() + " ist keine Zahl!");
		}
		return scanner.nextInt();
	}

}
