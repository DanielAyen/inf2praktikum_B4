
/**
 * Die Klasse Spieler
 * 
 * @param n
 *            Name des Spielers
 * @param ID
 *            ID des Spielers
 **/

public class Spieler {

	private Spieler s;
	private String n; // name
	private int ID; // SpielerID
	private Spielfeld sf;
	private Farb f;
	private Würfel w;

	// private Figur1 fig1;
	// private Figur2 fig2;
	// private Figur3 fig3;
	// private Figur4 fig4;
	/** Konstruktor des Spielers **/
	public Spieler(Spielfeld sf, Spieler s) {
		// this.sf=sf;
		this.s = s;

	}

	/** @return gibt die SpielerID zurück **/
	public int getSpielerID() {
		return ID;
	}

	public String getName() {
		return n;
	}

	public Farb getFarbe() {
		return f;
	}

	@Override
	public String toString() {
		return "Spieler" + getName() + "mit der ID" + getSpielerID()
				+ " und der Farbe " + getFarbe();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Spieler))
			return false;
		Spieler s = (Spieler) o;
		return (s.getSpielerID() == this.getSpielerID());
	}

}
