/**
 * Die Klasse Spielfeld
 * 
 * @param brett
 *            Das Spielbrett
 * @param fig
 *            Die Spielfigur
 * @param spielFeldArray
 *            Array für alle normalen Felder 40Felder
 *
 * @param startFeldArray
 *            Array für alle Startfelder 16Felder
 *
 * @param endFeldArray
 *            Array für alle Endfelder 16Felder
 **/

public class Spielfeld {
	
	

	private Spielfigur fig;

	private int[] spielFeldArray;
	private String[][] startFeldArray;
	private String[][] endFeldArray;

	/**
	 * Konstruktor für das Spielfeld
	 * 
	 * ruft erstelleFeld, erstelleStartFeld, erstelleEndFeld auf.
	 * 
	 */

	public Spielfeld() {
		System.out.println("bla");

		erstelleFeld(spielFeldArray);

		erstelleStartFeld(startFeldArray);

		erstelleEndFeld(endFeldArray);
	}

	/**
	 * Hier wird jedem Feld eine ID (ein Name+ eine Nummer) zugewiesen. Fuegt
	 * Startfelder, normale Felder und EndFelder hinzu.
	 */

	public void erstelleFeld(int[] spielFeldArray) { //Normale Felder

		for (int i = 1; i != 40; i++) {
			spielFeldArray[i] = i;
		}

	}

	public void erstelleStartFeld(String[][] startFeldArray) { //Start Felder

		for (int i = 1; i != 4; i++) {

			switch (i) {

			case 1:
				for (int j = 1; j != 4; j++) {

					startFeldArray[i][j] = "SRi";

				}

			case 2:
				for (int j = 1; j != 4; j++) {

					startFeldArray[i][j] = "SBi";

				}

			case 3:
				for (int j = 1; j != 4; j++) {

					startFeldArray[i][j] = "SYi";

				}

			case 4:
				for (int j = 1; j != 4; j++) {

					startFeldArray[i][j] = "SGi";

				}

			}

		}
	}

	public void erstelleEndFeld(String[][] endFeldArray) { //End Felder

		for (int i = 1; i != 4; i++) {

			switch (i) {

			case 1:
				for (int j = 1; j != 4; j++) {

					endFeldArray[i][j] = "ERi";

				}

			case 2:
				for (int j = 1; j != 4; j++) {

					endFeldArray[i][j] = "EBi";

				}

			case 3:
				for (int j = 1; j != 4; j++) {

					endFeldArray[i][j] = "EYi";

				}

			case 4:
				for (int j = 1; j != 4; j++) {

					endFeldArray[i][j] = "EGi";

				}

			}

		}

	}
}