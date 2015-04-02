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
	 *             Exception wenn die Max Spielerzahl �berschritten wird
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
	 *             Exception wenn die Max Anzahl an Spielbretter �berschritten
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
	 * Gibt dem Spieler die M�glichkeit zu wuerfeln
	 * 
	 */
	@Override
	public void wuerfeln() {
		w.werfen();
	}

	/**
	 * L�sst das Spiel beginnen
	 * 
	 */
	@Override
	public void spielStarten() {
		if (spielerZaehler > 0 || brettZaehler == 1) {
			System.out.println("Das Spiel beginnt.");
			System.out.println("Spieler" + "" + "darf wuerfeln!");
			// zwischen die + + muss der akt Spieler eingef�gt werden
		}

	}

	@Override
	public void entscheidungBeiSechs() {
		// Figur raus oder ziehen
		// und nochmal wuerfeln

	}

	@Override
	public void welcheSpielfigurNutzen() {
		// auswahl zwischen den verf�gbaren figuren geben,
		// (darauf achten ob im startfeld array oder nicht?)

	}

	public void GegnerSchlagen() {
		// pr�fen ob auch sicher Feindfigur
		// feindfigur zur�ckstellen
		//
	}

	// public int anzahlFigurenAufStartFeldern(FarbEnum farbe, ){
	// if(array[x] ==Sr1||==sr2.... dann Starfeld zaehler ++
	// return ;
	// }

}