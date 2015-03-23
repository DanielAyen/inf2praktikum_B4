/**
 * Die Klasse Spielfeld
 * 
 * @param brett
 *            Das Spielbrett
 * @param fig
 *            Die Spielfigur
 *
 **/

public class Spielfeld {

	private Spielbrett brett;
	private Spielfigur fig;

	private int[] spielfeldArray
	private String[][] startFeldArray
	private String[][] endFeldArray

	/**
	 * Konstruktor für das Spielfeld
	 */

	public Spielfeld(Spielbrett brett) {

		if (brett == null){
			throw new RuntimeException("Ohne Brett kein Feld");
			}
		else{
		this.brett = brett;
		}
		
		erstelleFeld(spielfeldArray);
		
		erstelleStartFeld(startFeldArray);
		
		erstelleEndFeld(endFeldArray);
	}
	

	/**
	 * @return Gibt Brett zurück.
	 */
	public Spielbrett getBrett() {

		return this.brett;

	}

	/**
	 * Hier wird jedem Feld eine ID (ein Name+ eine Nummer) zugewiesen. Fuegt
	 * Startfelder, normale Felder und EndFelder hinzu.
	 
	 */

	public void erstelleFeld(int[] spielfeldArray) {

		for (int i = 1; i != 40; i++) {
			spielfeldArray[i] = i;
		}

	}

	public void erstelleStartFeld(String[][] startFeldArray) {

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

	public void erstelleEndFeld(String[][] endFeldArray) {

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