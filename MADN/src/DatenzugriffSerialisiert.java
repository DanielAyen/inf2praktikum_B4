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
	 * Diese Methode oeffnet die Serialisierungs - Datei
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
	 * Diese Methode schreibt in die Datei.
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
	 * Diese Methode liest aus der Datei
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
			throw new IOException("Konnte nicht desrialisieren!");
		}
	}

	/**
	 * Diese Methode schliesst die Datei
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