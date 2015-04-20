import java.util.Properties;

/**
 * Die Klasse SpielTestSpeichern
 *
 */
public class SpielTestSpeichern {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("Auswahl", "schreiben");
		Spiel s = new Spiel();

		s.spielSpeichern(p);
		s.spielSpeichernCSV(p);

	}

}
