/**
 * Die Klasse Spieler (Mensch vor dem PC)
 * 
 * @param n
 *            Name des Spielers
 * @param ID
 *            ID des Spielers
 **/

public abstract class Spieler {

	// private Spieler s;
	private String n; // name
	private int ID; // SpielerID
	// private Spielfeld sf;
	private FarbEnum f;
	private W�rfel w;
	private Spielfigur fig;

	/** Konstruktor des Spielers **/
	public Spieler() {
		w = new W�rfel();

	}
/**
 * @return gibt gew�rfelte Zahl zur�ck 
 **/
	public int werfen() {
		return (w.werfen());
	}

	/** @return ID gibt die SpielerID zur�ck **/
	public int getSpielerID() {
		return ID;
	}

	/** @return n gibt den Namen des Spielers zur�ck **/
	public String getName() {
		return n;
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
