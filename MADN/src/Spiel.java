//import java.util.ArrayList;

/**
 * Die Klasse Spiel
 * */
public class Spiel implements iBediener {

	/**
	 * @param spielerZaehler
	 *            zaehlt Anzahl der Spieler
	 * 
	 * @param brettZaehler
	 *            zaehlt Anzahl der Spielbretter
	 * 
	 * @param w
	 *            Wuerfel
	 * 
	 */
	private int spielerZaehler = 0;
	private int brettZaehler = 0;
	private Wuerfel w;

	/**
	 * erstellt die einzelnen Spieler
	 * 
	 * @param name
	 *            Der Spielername
	 * 
	 * @param farbe
	 *            Die Farbe des Spielers
	 * 
	 * @throws wirft
	 *             Exception wenn die Max Spielerzahl überschritten wird
	 */
	@Override
	public void erstelleSpieler(String name, FarbEnum farbe) {
		if (spielerZaehler <= 3) {
			new Spieler(name, farbe);
			spielerZaehler++;
		} else
			throw new RuntimeException("Max Spielerzahl erreicht!");

	}

	/**
	 * erstellt das Spielbrett
	 * 
	 * 
	 * @throws wirft
	 *             Exception wenn die Max Anzahl an Spielbretter überschritten
	 *             wird
	 */
	@Override
	public void erstelleBrett() {
		if (brettZaehler == 0) {
			new Spielbrett();
		} else
			throw new RuntimeException("Es gibt schon ein Spielbrett!");
	}

	/**
	 * Gibt dem Spieler die Möglichkeit zu wuerfeln
	 * 
	 */
	@Override
	public void wuerfeln() {
		w.werfen();
	}

	/**
	 * Lässt das Spiel beginnen
	 * 
	 */
	@Override
	public void spielStarten() {
		if (spielerZaehler > 0 || brettZaehler == 1) {
			System.out.println("Das Spiel beginnt.");
			System.out.println("Spieler" + "" + "darf wuerfeln!");
			// zwischen die + + muss der akt Spieler eingefügt werden
		}

	}

	@Override
	public void entscheidungBeiSechs() {
		// Figur raus oder ziehen
		// und nochmal wuerfeln

	}

	@Override
	public void welcheSpielfigurNutzen() {
		// auswahl zwischen den verfügbaren figuren geben,
		// (darauf achten ob im startfeld array oder nicht?)

	}

	public void GegnerSchlagen() {
		// prüfen ob auch sicher Feindfigur
		// feindfigur zurückstellen
		//
	}

	// public int anzahlFigurenAufStartFeldern(FarbEnum farbe, ){
	// if(array[x] ==Sr1||==sr2.... dann Starfeld zaehler ++
	// return ;
	// }

}