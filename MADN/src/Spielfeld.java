import java.util.ArrayList;

/**
 * Die Klasse Spielfeld
 * 
 * @param SF
 *            ArrayList fuer alle Felder
 **/

public class Spielfeld {

	/**
	 * FeldID ArrayList für alle Spielfelder
	 */

	private ArrayList<Object> FeldID = new ArrayList<Object>();

	/**
	 * Hier wird jedem Feld eine ID (ein Name+Nummer) zugewiesen. Fuegt
	 * Startfelder, normale Felder und EndFelder hinzu.
	 * 
	 * @param i
	 *            Zaehlt die Felder hoch.
	 * 
	 * @param SR
	 *            Startfelder fuer Rot
	 * @param SB
	 *            Startfelder fuer Blau
	 * @param SY
	 *            Startfelder fuer Gelb
	 * @param SG
	 *            Startfelder fuer Gruen
	 * 
	 * @param x
	 *            Normales Feld
	 * 
	 * @param ER
	 *            Endfeld fuer Rot
	 * @param EB
	 *            Endfeld fuer Blau
	 * @param EY
	 *            Endfeld fuer Gelb
	 * @param EG
	 *            Endfeld fuer Gruen
	 */

	public void erstelleFeld() {

		// Startfelder
		// Felder RED
		for (int i = 1; i <= 4; i++) {
			FeldID.add("SR" + i);
		}
		// Felder BLUE
		for (int i = 1; i <= 4; i++) {
			FeldID.add("SB1" + i);
		}
		// Felder YELLOW
		for (int i = 1; i <= 4; i++) {
			FeldID.add("SY1" + i);
		}
		// Felder GREEN
		for (int i = 1; i <= 4; i++) {
			FeldID.add("SG1" + i);
		}

		// Felder Normal
		for (int x = 1; x <= 40; x++) {

			FeldID.add(x); //
		}

		// Felder Ziel
		for (int i = 1; i <= 4; i++) { // Zielfelder Rot1-4
			FeldID.add("ER" + i);

		}
		for (int i = 1; i <= 4; i++) { // Zielfelder Blue1-4
			FeldID.add("EB1" + i);
		}
		for (int i = 1; i <= 4; i++) { // Zielfelder Yellow1-4
			FeldID.add("EY1" + i);
		}
		for (int i = 1; i <= 4; i++) { // Zielfelder Green1-4
			FeldID.add("EG1" + i);
		}

	}
	/**
		 * 
		 */
	/*
	 * public void KenntFigur(ArrayList<Object> SF, Spielfigur){ int x; int
	 * temp; FeldID.get(x); x=temp; FeldID.add(x,Spielfigur);
	 * 
	 * }
	 * 
	 * public Object GetFeld(ArrayList<Object> SF,x){
	 * 
	 * return FeldID.get(x); }
	 */

}