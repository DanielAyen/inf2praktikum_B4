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
	private W�rfel w;
	private Spielfigur fig;
	//private KI ki = new KI;

	/** Konstruktor des Spielers **/
	public Spieler(String name, int ID) {
		setName(name);
		w = new W�rfel();
		this.ID = ID;
		//ki.add(new KI(this));
	}

	/**
	 * @return gibt gew�rfelte Zahl zur�ck
	 */
	public int werfen() {
		return (w.werfen());
	}

	/** 
	 * @return ID gibt die SpielerID zur�ck 
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

	/** @return n gibt den Namen des Spielers zur�ck **/
	public String getName() {
		return name;
	}

	/** @return f gibt die Farbe des Spielers zur�ck **/
	public FarbEnum getFarbe() {
		return f;
	}

	/** @return gibt Name, ID und Farbe des Spielers zur�ck */
	@Override
	public String toString() {
		return "Spieler" + getName() + "mit der ID" + getSpielerID()
				+ " und der Farbe " + getFarbe();
	}

	/** @return Vergleicht (�ber ID), ob Spieler wirklich DER Spieler ist */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Spieler))
			return false;
		Spieler s = (Spieler) o;
		return (s.getSpielerID() == this.getSpielerID());
	}


}
