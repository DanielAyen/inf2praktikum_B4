import java.io.IOException;
import java.util.Properties;

/**
 * Dieses Interface beinhaltet die Methoden zum oeffnen, schreiben,
 * lesen und schliessen von Dateien.
 */
public interface iDatenzugriff {
	
	
	
	public void oeffnen(Properties p) throws IOException;
    
	public void schreiben(Object object) throws IOException;

	public Object lesen() throws IOException;
    
	public void schliessen(Object object)throws IOException;

	


	
}