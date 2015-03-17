/**
 * Die Klasse KI
 */
class KI {
	private Spieler s;

	/**
	 * Konstruktor der KI
	 * 
	 * @exception RuntimeException
	 *                wenn kein Spieler vorhanden ist
	 */
	public KI(Spieler s) {
		if (s == null)
			throw new RuntimeException("Es ist kein Spieler vorhanden!");
		this.s =s;
	}

}
