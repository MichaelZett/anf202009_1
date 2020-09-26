package helloworld;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Gib die erste Zahl ein.");
		Scanner scanner = new Scanner(System.in);
		int zahl1;

		try {
			zahl1 = scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.next();
			System.out.println("Keine Zahl, nochmal bitte.");
			zahl1 = scanner.nextInt();
		}

		System.out.println("Gib die zweite Zahl ein.");
		int zahl2 = scanner.nextInt();

		int result = zahl1 + zahl2;
		System.out.println("Das Ergebnis lautet: " + result);
		scanner.close();
	}

}
