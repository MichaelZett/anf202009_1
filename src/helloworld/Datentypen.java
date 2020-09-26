package helloworld;

public class Datentypen {

	public static void main(String[] args) {
		String text = "";

		short kleineZahl = 1;
		int ganzeZahl = 5;
		Integer ganzeZahlWrapper = Integer.valueOf(5);

		ganzeZahl = ganzeZahlWrapper;

		ganzeZahlWrapper = ganzeZahl;

		long grosseGanzeZahl = 8_364_374_847_474L;

		Long grosserWrappe = 7L;

		float dezimalZahl = 2.2F;
		double grosseDezimalZahl = 373473.784748;
		Double grosseDezimalWraper = grosseDezimalZahl;

		boolean wahrheitsWert = true;
		Boolean falseVar = Boolean.FALSE;
		boolean primVar = falseVar;
		char buchstabe = 'c';
		System.out.println("Ganze grosse Zahl 1: " + grosseGanzeZahl);
		ganzeZahl = (int) grosseGanzeZahl;
		System.out.println("Ganze Zahl 2: " + ganzeZahl);
	}

}
