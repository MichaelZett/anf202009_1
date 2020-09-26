package helloworld;

public class SchleifenArrays {

	public static void main(String[] args) {
		String[] woerter = new String[] { "Hallo", "Wie", "Geht", "Es", "Dir" };

		String[] namen = new String[5];
		namen[0] = "Peter";
		namen[1] = "Werner";
		namen[2] = "Frank";
		namen[3] = "Martina";
		namen[4] = "Frauke";

		System.out.println("Inhalt von Wörter: ");

		for (int i = 0; i < 5; i++) {
			System.out.println(woerter[i]);
		}

		System.out.println("Inhalt von Namen: ");

		for (int i = 0; i < namen.length; i++) {
			System.out.println(namen[i]);
		}
	}

}
