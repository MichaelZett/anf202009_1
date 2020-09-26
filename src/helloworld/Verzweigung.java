package helloworld;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Verzweigung {

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

		boolean istGerade = zahl1 % 2 == 0;
		boolean istGross = zahl1 > 2000;

		if (istGerade && !istGross) {
			System.out.println("Die Zahl ist gerade, aber nicht groﬂ.");
		} else if (istGross) {
			System.out.println("Die Zahl ist groﬂ");
		} else {
			System.out.println("Die Zahl ist ungerade.");
		}

	}

}
