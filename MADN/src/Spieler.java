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
	private Würfel w;
	private Spielfigur fig;

	/** Konstruktor des Spielers **/
	public Spieler() {
		w = new Würfel();

	}
/**
 * @return gibt gewürfelte Zahl zurück 
 **/
	public int werfen() {
		return (w.werfen());
	}

	/** @return ID gibt die SpielerID zurück **/
	public int getSpielerID() {
		return ID;
	}

	/** @return n gibt den Namen des Spielers zurück **/
	public String getName() {
		return n;
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
