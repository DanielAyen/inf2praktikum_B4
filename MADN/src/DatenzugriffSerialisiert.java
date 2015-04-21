import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 * Diese Klassse DatenzugriffSerialisiert
 */
public class DatenzugriffSerialisiert implements iDatenzugriff {
	/**
	 * @param ois
	 *            ObjectInputStream
	 * @param oos
	 *            ObjectOutputStream
	 */

	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	/**
	 * oeffnet die Date
	 * 
	 * @param p
	 *            Properties
	 * @throws exception
	 *             wirft eine Exception, wenn Auswahl nicht definiert wurde oder
	 *             falsch ist
	 */
	@Override
	public void oeffnen(Properties p) throws IOException {
		String dateiname = "MADN";
		if ("schreiben".equals(p.getProperty("Auswahl"))) {
			oos = new ObjectOutputStream(new FileOutputStream(dateiname));
		} else if ("lesen".equals(p.getProperty("Auswahl"))) {
			ois = new ObjectInputStream(new FileInputStream(dateiname));
		} else {
			throw new IOException("Auswahl wurde nicht oder falsch definiert");
		}
	}

	/**
	 * schreibt in die Datei
	 * 
	 * @param object
	 *            Object
	 * @throws exception
	 *             wirft eine Exception, wenn Stream nicht zum schreiben
	 *             geoeffnet ist
	 */
	@Override
	public void schreiben(Object object) throws IOException { // speichern
		if (oos == null) {
			throw new IOException("Stream ist nicht zum Schreiben geoeffnet!");
		} else {
			oos.writeObject(object);
		}
	}

	/**
	 * liest aus der Datei
	 * 
	 * @throws exception
	 *             wirft eine Exception, wenn Stream nicht gelesen wurden konnte
	 * @throws exception
	 *             wenn Deserialisierung nicht funktioniert hat
	 */
	@Override
	public Object lesen() throws IOException { // laden
		if (ois == null) {
			throw new IOException(
					"Stream ist leider nicht zum lesen geoeffnet!");
		}

		try {
			Object o = ois.readObject();
			return o;
		} catch (ClassNotFoundException fehler) {
			throw new IOException("Konnte nicht deserialisieren!");
		}
	}

	/**
	 * schliesst die Datei
	 *  @param object Object
	 * @throws exception
	 *             wirft eine Exception
	 */
	@Override
	public void schliessen(Object object) throws IOException {
		if (ois != null) {
			ois.close();
			ois = null;
		}

		if (oos != null) {
			oos.close();
			oos = null;
		}
	}
}