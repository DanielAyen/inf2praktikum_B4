/**
 * Die Klasse W�rfel
 * 
 * es wird per Zufall eine Zahl zwischen 1 und 6 bestimmt
 **/
public class W�rfel {
	int w;

	/**
	 * @param w
	 *          Parameter f�r den W�rfel
	 **/
	public int werfen() {
		w = (int) ((Math.random() * 6) + 1); // Erg. wird zu int gecasted
		return w;
	}
}
