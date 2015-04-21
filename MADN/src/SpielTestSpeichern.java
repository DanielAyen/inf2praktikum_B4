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
	
		
		Spiel spiel=new Spiel();
		spiel.erstelleSpieler("asde",FarbEnum.BLAU);
		
		
		Properties p = new Properties();
		p.setProperty("Auswahl", "schreiben");


		spiel.spielSpeichern(p);
		//spiel.spielSpeichernCSV(p);

	}

}
