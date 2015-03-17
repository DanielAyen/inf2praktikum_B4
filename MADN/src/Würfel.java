/**
 * Die Klasse Würfel
 * 
 * es wird eine Zahl zwischen 1 und 6 bestimmt
 **/

public class Würfel {

	/**
	 * @param w
	 *            Parameter für den Würfel
	 * @return w gibt die Anzahl der gewürfelten Augen aus
	 **/
	public int werfen() {
		int w;
		w = (int) ((Math.random() * 6) + 1); // Erg. wird zu int gecasted
		System.out.println("Es wurde die Zahl " + w + " gewürfelt.");

		return w;
	}
}
