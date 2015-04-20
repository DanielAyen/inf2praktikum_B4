import java.util.Properties;

/**
 * Die Klasse SpielTestLaden
 *
 */
public class SpielTestLaden {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("Auswahl", "lesen");
		Spiel s = new Spiel();

		s.spielLaden(p);
		s.spielLadenCSV(p);
	}

}
