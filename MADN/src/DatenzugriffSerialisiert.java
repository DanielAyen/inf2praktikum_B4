import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DatenzugriffSerialisiert implements iDatenzugriff {
	private static ObjectOutputStream oos = null;
	private static ObjectInputStream ois = null;

	@Override
	public void oeffnen(Object o) throws IOException {
		try {
			oos = new ObjectOutputStream(new FileOutputStream("madn.ser"));
			ois = new ObjectInputStream(new FileInputStream("madn.ser"));
		} catch (FileNotFoundException e) {
			System.err.println("Datei konnte nicht geoeffnet werden");
		}
	}

	@Override
	public void schliessenSchreiben(Object o) {
		try {
			oos.close();

		} catch (Exception e) {
			System.err.println("Datei konnte nicht geschlossen werden");
		}
	}

	@Override
	public void schliessenLesen(Object o) {
		try {
			ois.close();

		} catch (Exception e) {
			System.err.println("Datei konnte nicht geschlossen werden");
		}
	}

	@Override
	public void schreiben(Object o) {

		ObjectOutputStream oos = null;

		try {

			Spieler s1 = new Spieler("Billy", FarbEnum.BLAU);
			oeffnen(null);
			oos.writeObject(s1);
			System.out.println(s1);

			schliessenLesen(null);
		} catch (Exception e) {
			System.err.println("Datei konnte nicht geschrieben werden.");
		}

	}

	@Override
	public void lesen(Object o) throws IOException {

		try {
			oeffnen(null);
			Spieler s = (Spieler) ois.readObject();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			System.err.println("Konnte 'madn.ser' nicht holen");
		} catch (ClassNotFoundException e) {
			System.err.println("Konnte Klasse nicht finden");
		}
		schliessenLesen(null);
	}
}