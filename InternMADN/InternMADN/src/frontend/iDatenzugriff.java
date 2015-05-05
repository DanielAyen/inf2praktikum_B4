package frontend;

import java.io.IOException;
import java.util.Properties;



public interface iDatenzugriff {

	
	void speichern(String dateiname, String dateiende, Object o) throws IOException;
	
	Object laden(String dateiname);
	
	//void oeffnen(Properties p) throws IOException;
	//void schreiben(Object object) throws IOException; --> speichern
	//Object lesen() throws IOException; --> laden
	//void schliessen(Object object) throws IOException;


}
