/**
 * Die Klasse W�rfel
 * 
 * es wird eine Zahl zwischen 1 und 6 bestimmt
 **/

public class W�rfel {

	/**
	 * @param w
	 *            Parameter f�r den W�rfel
	 * @return w gibt die Anzahl der gew�rfelten Augen aus
	 **/
	public int werfen() {
		int w;
		w = (int) ((Math.random() * 6) + 1); // Erg. wird zu int gecasted
		System.out.println("Es wurde die Zahl " + w + " gew�rfelt.");

		return w;
	}
}
