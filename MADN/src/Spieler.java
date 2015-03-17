import javax.lang.model.element.Name;

/**
 * Die Klasse Spieler (Mensch vor dem PC)
 * 
 * @param n
 *            Name des Spielers
 * @param ID
 *            ID des Spielers
 **/

public class Spieler {

	private String name;
	private int ID; // SpielerID
	// private Spielfeld sf;
	private FarbEnum f;
	private Würfel w;
	private Spielfigur fig;
	//private KI ki = new KI;

	/** Konstruktor des Spielers **/
	public Spieler(String name, int ID) {
		setName(name);
		w = new Würfel();
		this.ID = ID;
		//ki.add(new KI(this));
	}

	/**
	 * @return gibt gewürfelte Zahl zurück
	 */
	public int werfen() {
		return (w.werfen());
	}

	/** 
	 * @return ID gibt die SpielerID zurück 
	 */
	public int getSpielerID() {
		return ID;
	}

	/**
	 * @param name
	 *            Name des Spielers
	 * @exception RuntimeException
	 *                wenn kein Name oder ein zu kurzer Name eingegeben wurde
	 */
	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new RuntimeException(
					"Der Name ist zu kur! Bitte mehr als zwei Zeichen eingeben.");
		} else {
			this.name = name;
		}

	}

	/** @return n gibt den Namen des Spielers zurück **/
	public String getName() {
		return name;
	}

	/** @return f gibt die Farbe des Spielers zurück **/
	public FarbEnum getFarbe() {
		return f;
	}

	/** @return gibt Name, ID und Farbe des Spielers zurück */
	@Override
	public String toString() {
		return "Spieler" + getName() + "mit der ID" + getSpielerID()
				+ " und der Farbe " + getFarbe();
	}

	/** @return Vergleicht (über ID), ob Spieler wirklich DER Spieler ist */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Spieler))
			return false;
		Spieler s = (Spieler) o;
		return (s.getSpielerID() == this.getSpielerID());
	}


}
