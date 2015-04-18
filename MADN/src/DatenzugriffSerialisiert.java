import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;



/**
 * Diese Klassse bereitet das Serialisieren vor.
 *
 */
public class DatenzugriffSerialisiert implements iDatenzugriff {

	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	/**
	 * Diese Methode oeffnet die Serialisierungs  - Datei
	 */
	@Override
	public void oeffnen(Properties p) throws IOException {
		String dateiName = p.getProperty("Dateiname");
		
		if(dateiName == null) {
			throw new IOException("Dateiname wurde nicht definiert");
		}
		
		if("s".equals(p.getProperty("Modus"))) {
			oos = new ObjectOutputStream(new FileOutputStream(dateiName));
		} else if("l".equals(p.getProperty("Modus"))) {
			ois = new ObjectInputStream(new FileInputStream(dateiName));
		} else {
			throw new IOException("Modus wurde nicht oder falsch definiert");
		}
	}

	/**
	 * Diese Methode schreibt in die Datei.
	 */
	@Override
	public void schreiben(Object object) throws IOException {
		if(oos == null) {
			throw new IOException("Stream ist nicht zum Schreiben geöffnet!");
		} else {
			oos.writeObject(object);
		}
	}

	/**
	 * Diese Methode liest aus der Datei
	 */
	@Override
	public Object lesen() throws IOException {
		if(ois == null) {
			throw new IOException("Stream ist nicht zum lesen geöffnet!");
		}
		
		try {
			Object o = ois.readObject();
			return o;
		} catch(ClassNotFoundException fehler) {
			throw new IOException("Konnte nicht desrialisieren!");
		}
	}

	/**
	 * Diese Methode schließt die Datei
	 */
	@Override
	public void schliessen(Object object) throws IOException {
		if(ois != null) {
			ois.close();
			ois = null;
		}
		
		if(oos != null) {
			oos.close();
			oos = null;
		}
	}
}