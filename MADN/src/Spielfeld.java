/**
 * Die Klasse Spielfeld
 * 
 */
/**
 * @param fig
 *            Die Spielfigur
 * 
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

	@SuppressWarnings("unused")
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

		erstelleFeld(spielFeldArray);

		erstelleStartFeld(startFeldArray);

		erstelleEndFeld(endFeldArray);
	}

	/**
	 * Erstellt alle normalen Felder (40)
	 * 
	 * @param spielFeldArray
	 *            Array für alle normalen Felder 40Felder
	 */
	public void erstelleFeld(int[] spielFeldArray) { // Normale Felder

		for (int i = 1; i != 40; i++) {
			spielFeldArray[i] = i;
		}

	}

	/**
	 * Erstellt alle Start Felder (16)
	 * 
	 * @param startFeldArray
	 *            Array für alle Startfelder 16Felder
	 */
	public void erstelleStartFeld(String[][] startFeldArray) { // Start Felder

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

	/**
	 * Erstellt alle End Felder (16)
	 * 
	 * @param endFeldArray
	 *            Array für alle Endfelder 16Felder
	 */
	public void erstelleEndFeld(String[][] endFeldArray) { // End Felder

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