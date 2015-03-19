/**
 * Die Klasse KI
 */
class KI {
	private Spieler spieler;

	/**
	 * Konstruktor der KI
	 * 
	 * @exception RuntimeException
	 *                wenn kein Spieler vorhanden ist
	 */
	public KI(Spieler spieler) {
		if (spieler == null)
			throw new RuntimeException("Es ist kein Spieler vorhanden!");
		this.spieler =spieler;
	}

}
