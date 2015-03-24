import java.util.ArrayList;

/**
 * Die Klasse Spielfigur
 * 
 * @param farbe
 *            Farbe der Figur
 * @param FeldID
 *            ID des Spielfeldes
 * @param anzFarbe
 *            Anzahl der Spielfigurenfarbe, die jede Figur hat
 * @param spielFeldArray
 *            Felder des Spielfeldes
 * @param startFeldArray
 *            Felder der Startfelder
 * @param endFeldArray
 *            Felder der Endfelder
 * @param w
 *            Parameter fuer den Wuerfel
 **/

public class Spielfigur {

	private FarbEnum farbe;
	private static final int anzFarbe = 4;
	private Spielfeld feld;
	private int[] spielFeldArray;
	private String[][] startFeldArray;
	private String[][] endFeldArray;
	private Wuerfel w;

	/** Konstruktor der Spielfigur **/
	public Spielfigur(FarbEnum farbe) {
		this.setFarbe(farbe);
		w = new Wuerfel();

	}

	/**
	 * @param f
	 *            Farbe der Spielfigur
	 */
	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
	}

	/** @return f gibt die Farbe der Spielfigur zurueck **/
	public FarbEnum getFarbe() {
		return farbe;
	}

	/** @return endFeldArray gibt diePosition der Spielfigur zurueck **/
	public String[][] getPosi() {
		return endFeldArray;

	}

	/** @return spielFeldArray gibt diePosition der Spielfigur zurueck **/
	public int[] getPos() {
		return spielFeldArray;
	}

	public void vor() {
		getPos(); // Position der Figur und dann das Würfelergebnis
					// draufaddieren

	}

	//
	// public void gegnerSchlagen(){
	//
	// }
	//
	// public void feldBetreten(){
	// }

	//
	// public void aufStartfeldSetzen(){
	//
	// }
}
