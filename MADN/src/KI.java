/**
 * Die Klasse KI
 */
public abstract class KI  {
	private Spieler spieler;
protected boolean KIyn;

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
	
	public boolean gegnerSchlagen(){
		Spiel.figurBewegen();
		Spiel.GegnerSchlagen();
		return false;
		
	}


	public boolean figurenAufsFeld(){
		Spiel.aufStartSpielfeld();
		return false;
	}
	
	public boolean figurenInsEndfeld(){
		Spiel.figurBewegen();
		return false;
	}
}