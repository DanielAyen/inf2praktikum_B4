/**
 * Die Klasse Wuerfel
 * 
 * es wird eine Zahl zwischen 1 und 6 bestimmt
 **/

public class Wuerfel {

	/**
	 * @param w
	 *            Parameter fuer den Wuerfel
	 * @return w gibt die Anzahl der gewuerfelten Augen aus
	 **/
	
	private int w;
	
	public Wuerfel (){
		werfen();
	}

	public int werfen() {
		
		w = (int) ((Math.random() * 6) + 1); // Erg. wird zu int gecasted
		System.out.println("Es wurde die Zahl " + w + " gewuerfelt.");

		return w;
	}
	
	
}

