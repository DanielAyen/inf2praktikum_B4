import javax.lang.model.element.Name;

/**
 * Die Klasse Spieler
 * 
 * @param n
 *            Name des Spielers
 * @param ID
 *            ID des Spielers
 **/

public class Spieler {

	private String name;
	private FarbEnum f;
	private Spielfigur fig;
	private Wuerfel w;
	private int ID; // SpielerID
	// private Spielfeld sf;
	//private KI ki = new KI;

	/** Konstruktor des Spielers **/
	public Spieler(String name, int ID, FarbEnum f) {
		setName(name);
		w = new Wuerfel();
		this.f=f;
		this.ID = ID;
		//ki.add(new KI(this));
	}

	/**
	 * @return gibt gewuerfelte Zahl zurueck
	 */
	public int werfen() {
		return (w.werfen());
	}

	/** 
	 * @return ID gibt die SpielerID zurueck 
	 */
	public int getSpielerID() {
		return ID;
	}

	/**
	 * @param name
	 *            Name des Spielers
	 * @throws RuntimeException
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

	/** @return n gibt den Namen des Spielers zurueck **/
	public String getName() {
		return name;
	}

	
	/**
	 * @param f Farbe des Spielers 
	 */
	public void setFarbe(FarbEnum f){
		this.f=f;
	}
	
	/** @return f gibt die Farbe des Spielers zurueck **/
	public FarbEnum getFarbe() {
		return f;
	}

	/** @return gibt Name, ID und Farbe des Spielers zurueck */
	@Override
	public String toString() {
		return "Spieler" + getName() + "mit der ID" + getSpielerID()
				+ " und der Farbe " + getFarbe();
	}

	/** @return Vergleicht (ueber ID), ob Spieler wirklich DER Spieler ist */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Spieler))
			return false;
		Spieler s = (Spieler) o;
		return (s.getSpielerID() == this.getSpielerID());
	}


}
