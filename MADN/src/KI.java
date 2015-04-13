/**
 * Die Klasse KI
 */
public abstract class KI {
	private Spieler spieler;

	/**
	 * Konstruktor der KI
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
	 * @return Spieler
	 */
	public Spieler getSpieler() {
		return this.spieler;
	}
	
	public static void gegnerSchlagen(){
		Spiel.figurBewegen();
		Spiel.GegnerSchlagen();
		
		
	}


	public void figurenAufsFeld(){
		Spiel.aufStartSpielfeld();
		
	}
	
	public void figurenInsEndfeld(){
		Spiel.figurBewegen();
		
	}
}