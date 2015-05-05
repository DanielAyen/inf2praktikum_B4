package frontend;

import java.io.IOException;
import java.util.Properties;



public interface iDatenzugriff {

	
	void speichern(String dateiname, String dateiende, Object o) throws IOException;
	
	Object laden(String dateiname);
	


}
