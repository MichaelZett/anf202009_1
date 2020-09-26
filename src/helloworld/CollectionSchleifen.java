package helloworld;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionSchleifen {

	public static void main(String[] args) {
		LinkedList<String> liste = new LinkedList<>();
		liste.add("Peter");
		liste.add("Frauke");
		liste.add("Maria");

		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}

		int i = 0;
		while (i < liste.size()) {
			System.out.println(liste.get(i));
			i++;
		}

		System.out.println("##############");
		Iterator<String> iterator = liste.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("##############");
		Iterator<String> iterator2 = liste.iterator();
		do {
			System.out.println(iterator2.next());
		} while (iterator2.hasNext());

		for (String name : liste) {
			System.out.println(name);
		}
	}

}
