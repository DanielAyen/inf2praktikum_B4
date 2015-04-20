import java.util.Properties;

public class SpielTestSpeichern {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("Auswahl", "schreiben");
		Spiel s = new Spiel();
	
		s.spielSpeichern(p);
		s.spielSpeichernCSV(p);

	}

}
