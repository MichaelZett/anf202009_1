package helloworld;

import java.util.Scanner;

public class HelloMichael {

	public static void main(String[] args) {
		System.out.println("How is your name?");

		Scanner scanner = new Scanner(System.in);

		String someone = scanner.next();

		System.out.println("Hello, " + someone);

		scanner.close();
	}

}
