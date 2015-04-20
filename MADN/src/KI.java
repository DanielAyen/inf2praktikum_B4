/**
 * Die Klasse KI
 */
public abstract class KI {
	private Spieler spieler;
	protected boolean KIyn;
	private Spiel spiel;

	/**
	 * Konstruktor der KI
	 * 
	 * @param spieler
	 *            Spieler
	 * 
	 * @throws RuntimeException
	 *             wenn kein Spieler vorhanden ist
	 */
	public KI(Spieler spieler) {
		if (spieler == null)
			throw new RuntimeException("Es ist kein Spieler vorhanden!");
		this.spieler = spieler;
	}

	/**
	 * gibt Spieler zurück
	 * 
	 * @return spieler Spieler
	 */
	public Spieler getSpieler() {
		return this.spieler;
	}

	/**
	 * schlägt den Gegner
	 * 
	 * @return false
	 */
	public boolean gegnerSchlagen() {
		spiel.figurBewegen();
		spiel.GegnerSchlagen();
		return false;

	}

	/**
	 * setzt Figuren auf das Spielfeld
	 * 
	 * @return false
	 */
	public boolean figurenAufsFeld() {
		spiel.aufStartSpielfeld();
		return false;
	}

	/**
	 * setzt Figuren ins Spielfeld
	 * 
	 * @return false
	 */
	public boolean figurenInsEndfeld() {
		spiel.figurBewegen();
		return false;
	}
}