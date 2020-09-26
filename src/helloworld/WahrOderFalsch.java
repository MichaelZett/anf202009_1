package helloworld;

import java.util.Scanner;

public class WahrOderFalsch {

	public static void main(String[] args) {
		System.out.println("Gib' was ein.");
		Scanner scanner = new Scanner(System.in);

		String eingabe = scanner.next();

		if ("ja".equals(eingabe) || "j".equals(eingabe)) {
			System.out.println("true");
		} else if ("nein".equals(eingabe) || "n".equals(eingabe)) {
			System.out.println("false");
		} else {
			System.out.println("Kenne ich nicht.");
		}

		scanner.close();
	}

}
