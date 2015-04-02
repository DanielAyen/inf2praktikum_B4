/**
 * Die Klasse Spieler
 * 
 * @param name
 *            Name des Spielers
 * @param farbe
 *            Das FarbEnum
 * @param fig
 *            Die Spielfigur
 * @param w
 *            Der Wuerfel
 **/

public class Spieler {

	private String name;
	private FarbEnum farbe;
	private Spielfigur fig;
	private Wuerfel w;
	private Spieler s;
	

	// private KI ki;
	// private ArrayList<KI> ki = new ArrayList<KI>(); // fuer Komposition

	/**
	 * Konstruktor des Spielers
	 * 
	 * @param name
	 *            Name Des Spielers
	 * @param farbe
	 *            Das FarbEnum
	 **/
	public Spieler(String name, FarbEnum farbe) {
		setName(name);
		w = new Wuerfel();
		setFarbe(farbe);
		// ki.getSpieler();
		// ki.add(new KI(this)); // fuer Komposition
	}

	/**
	 * @return gibt gewuerfelte Zahl zurueck
	 */

	public void wuerfeln() {
		w.werfen();
	}

	/**
	 * @param name
	 *            Name des Spielers
	 * @throws RuntimeException
	 *             wenn kein Name oder ein zu kurzer Name eingegeben wurde
	 */
	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new RuntimeException(
					"Der Name ist zu kurz! Bitte mehr als zwei Zeichen eingeben.");
		} else {
			this.name = name;
		}

	}

	/** @return n gibt den Namen des Spielers zurueck **/
	public String getName() {
		return name;
	}

	/**
	 * @param f
	 *            Farbe des Spielers
	 */
	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
	}

	/** @return f gibt die Farbe des Spielers zurueck **/
	public FarbEnum getFarbe() {
		System.out.println("Du hast die Farbe " + farbe + " gewaehlt.");
		return farbe;
	}

	/** @return gibt Name, ID und Farbe des Spielers zurueck */
	@Override
	public String toString() {
		return "Spieler " + getName() + " mit der Farbe " + getFarbe();
	}

	/**
	 * @return Vergleicht (ueber eindeutigen Namen), ob Spieler wirklich DER
	 *         Spieler ist
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Spieler))
			return false;
		Spieler s = (Spieler) o;
		return (s.getName() == this.getName());
	}


	// public void spielerHinzufuegen(Spieler s){
	// if (anzSpieler>4){
	// throw new RuntimeException("Zu viele Spieler!");
	// }
	// for (int i=0; i<4;i++){
	// this.setS(s);
	// }
	// }

	public void setS(Spieler s) {
		this.s = s;
	}

	public Spieler getSpieler() {
		return s;

	}


}
