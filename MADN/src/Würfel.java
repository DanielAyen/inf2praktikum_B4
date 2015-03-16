/**
 * Die Klasse Würfel
 * 
 * es wird per Zufall eine Zahl zwischen 1 und 6 bestimmt
 **/
public class Würfel {
	int w;

	/**
	 * @param w
	 *          Parameter für den Würfel
	 **/
	public int werfen() {
		w = (int) ((Math.random() * 6) + 1); // Erg. wird zu int gecasted
		return w;
	}
}
