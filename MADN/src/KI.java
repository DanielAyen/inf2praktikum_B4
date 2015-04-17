/**
 * Die Klasse KI
 */
public abstract class KI  {
	private Spieler spieler;
protected boolean KIyn;
private Spiel spiel;
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
		spiel.figurBewegen();
		spiel.GegnerSchlagen();
		return false;
		
	}


	public boolean figurenAufsFeld(){
		spiel.aufStartSpielfeld();
		return false;
	}
	
	public boolean figurenInsEndfeld(){
		spiel.figurBewegen();
		return false;
	}
}