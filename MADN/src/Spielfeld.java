import java.util.ArrayList;

/**
 * Die Klasse Spielfeld
 * 
 * @param SF
 *            ArrayList fuer alle Felder
 **/

public class Spielfeld {

	ArrayList<Object> SF = new ArrayList<Object>();

	/**
	 * Hier wird jedem Feld eine ID (ein Name+Nummer) zugewiesen. Fuegt
	 * Startfelder, normale Felder und EndFelder hinzu.
	 * 
	 * @param i
	 *            Zaehlt die Felder hoch.
	 */

	public void erstelleFeld() {

		// Startfelder
		// Felder RED
		for (int i = 1; i <= 4; i++) {
			SF.add("SR" + i);
		}
		// Felder BLUE
		for (int i = 1; i <= 4; i++) {
			SF.add("SB1" + i);
		}
		// Felder YELLOW
		for (int i = 1; i <= 4; i++) {
			SF.add("SY1" + i);
		}
		// Felder GREEN
		for (int i = 1; i <= 4; i++) {
			SF.add("SG1" + i);
		}

		// Felder Normal
		for (int i = 1; i <= 40; i++) {

			switch (i) {
			case 1:
				SF.add("Feld_SR" + i);// Feld Start1

			case 11:
				SF.add("Feld_SB" + i);// Feld Start11

			case 21:
				SF.add("Feld_SG" + i);// Feld Start21

			case 31:
				SF.add("Feld_SY" + i);// Feld Start31

			default:
				SF.add("Feld" + i); // normale Felder
			}
		}

		// Felder Ziel
		for (int i = 1; i <= 4; i++) { // Zielfelder Rot1-4
			SF.add("ER" + i);

		}
		for (int i = 1; i <= 4; i++) { // Zielfelder Blue1-4
			SF.add("EB1" + i);
		}
		for (int i = 1; i <= 4; i++) { // Zielfelder Yellow1-4
			SF.add("EY1" + i);
		}
		for (int i = 1; i <= 4; i++) { // Zielfelder Green1-4
			SF.add("EG1" + i);
		}

	}

	/*
	 * public void KenntFigur(ArrayList<Object> SF, Spielfigur){ 
	 * int x;
	 *  int temp;
	 *   SF.get(x); x=temp; SF.add(x,Spielfigur); 
	 *   }
	 */

}
