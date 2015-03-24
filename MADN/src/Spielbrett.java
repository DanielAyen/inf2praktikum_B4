import java.util.ArrayList;

/**
 * Die Klasse Spielbrett
 * 
 * @param spielFeldArray
 *            Array fuer alle normalen Spielfelder
 * 
 * @param startFeldArray
 *            Array fuer Startfelder der Spieler
 * 
 * @param endFeldArray
 *            Array fuer Endfelder der Spieler
 * 
 **/
public class Spielbrett {

	private Spielfeld[] spielFeldArray;
	private Spielfeld[][] startFeldArray;
	private Spielfeld[][] endFeldArray;

	/**
	 * Konstruktor des Spielbretts
	 * 
	 * 
	 **/

	public Spielbrett(Spielfeld[][] startFeldArray,
			Spielfeld[][] zielFeldArray, Spielfeld[] spielFeldArray,
			Spielfeld[][] endFeldArray) {

		spielFeldArray = new Spielfeld[40];
		for (int i = 0; i <= 39; i++) {
			spielFeldArray[i] = new Spielfeld();
		}

		this.spielFeldArray = spielFeldArray;

		startFeldArray = new Spielfeld[4][4];

		for (int i = 0; i <= 3; i++) {
			startFeldArray[i][i] = new Spielfeld();
		}
		this.startFeldArray = startFeldArray;

		endFeldArray = new Spielfeld[4][4];
		for (int i = 0; i <= 3; i++) {
			endFeldArray = new Spielfeld();
		}
		this.endFeldArray = endFeldArray;

	}

}

