import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//implements iDatenzugriff
public class DatenzugriffSerialisiert {

	public static void serialize(String dateiname) {

		ObjectOutputStream oos = null;

		try {

			Spieler s1 = new Spieler("Billy", FarbEnum.BLAU);
			oos = new ObjectOutputStream(new FileOutputStream("madn.ser"));
			oos.writeObject(s1);
			System.out.println(s1);
		} catch (FileNotFoundException e1) {
			System.err.println("");
		} catch (IOException e) {
			System.err.println("" + e);
		} finally {
			try {
				oos.close();

			} catch (Exception e) {
				System.err.println("");
			}
		}

	}

	public static void deSerialize(String dateiname) throws IOException {

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