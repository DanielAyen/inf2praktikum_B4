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

	private String ID;

	@SuppressWarnings("unused")
	private Spielfigur fig;

	private int[] spielFeldArray = new int[40];
	private String[][] startFeldArray = new String[4][4];
	private String[][] endFeldArray = new String[4][4];

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

		for (int i = 1; i <= 40; i++) {
			spielFeldArray[i - 1] = i;
		}

	}

	/**
	 * Erstellt alle Start Felder (16)
	 * 
	 * @param startFeldArray
	 *            Array für alle Startfelder 16Felder
	 */
	public void erstelleStartFeld(String[][] startFeldArray) { // Start Felder

		for (int i = 1; i <= 4; i++) {

			if (i == 1) {
				for (int j = 1; j <= 4; j++) {

					startFeldArray[i - 1][j - 1] = "SR" + j;
				}

			}

			else if (i == 2) {
				for (int j = 1; j <= 4; j++) {

					startFeldArray[i - 1][j - 1] = "SB" + j;
				}

			}

			else if (i == 3) {
				for (int j = 1; j <= 4; j++) {

					startFeldArray[i - 1][j - 1] = "SY" + j;
				}

			}

			else if (i == 4) {
				for (int j = 1; j <= 4; j++) {

					startFeldArray[i - 1][j - 1] = "SG" + j;
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

		for (int i = 1; i <= 4; i++) {

			if (i == 1) {
				for (int j = 1; j <= 4; j++) {

					endFeldArray[i - 1][j - 1] = "ER" + j;
				}

			}

			else if (i == 2) {
				for (int j = 1; j <= 4; j++) {

					endFeldArray[i - 1][j - 1] = "EB" + j;
				}

			}

			else if (i == 3) {
				for (int j = 1; j <= 4; j++) {

					endFeldArray[i - 1][j - 1] = "EY" + j;
				}

			}

			else if (i == 4) {
				for (int j = 1; j <= 4; j++) {

					endFeldArray[i - 1][j - 1] = "EG" + j;
				}

			}

		}

	}

	/**
	 * Gibt ID zurück
	 * 
	 * @return ID gibt die ID zurück
	 */
	public int getSpielfeld(int x) {

		return spielFeldArray[x];

	}

	public String getStartfeld(int x, int y) {

		return startFeldArray[x][y];
	}

	public String getEndfeld(int x, int y) {

		return endFeldArray[x][y];
	}
}