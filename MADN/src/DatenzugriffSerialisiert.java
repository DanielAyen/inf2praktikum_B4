import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//implements iDatenzugriff
public class DatenzugriffSerialisiert {
	private static ObjectOutputStream oos = null;

	public static void oeffnen(Object o) throws IOException {
		try {
			oos = new ObjectOutputStream(new FileOutputStream("madn.ser"));
		} catch (FileNotFoundException e) {
			System.err.println("Datei konnte nicht geoeffnet werden");
		}
	}

	public static void schliessen(Object o) {
		try {
			oos.close();
		} catch (Exception e) {
			System.err.println("Datei konnte nicht geschlossen werden");
		}
	}

	public static void schreiben(Object o) {

		ObjectOutputStream oos = null;

		try {

			Spieler s1 = new Spieler("Billy", FarbEnum.BLAU);
			oeffnen(null);
			oos.writeObject(s1);
			System.out.println(s1);

			schliessen(null);
		} catch (Exception e) {
			System.err.println("Datei konnte nicht geschrieben werden.");
		}

	}

	public static void lesen(String dateiname) throws IOException {

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("madn.ser"));
			Spieler s = (Spieler) ois.readObject();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			System.err.println("Konnte 'madn.ser' nicht holen");
		} catch (ClassNotFoundException e) {
			System.err.println("Konnte Klasse nicht finden");
		}
	}
}