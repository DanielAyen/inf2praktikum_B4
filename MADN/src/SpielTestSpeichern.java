import java.io.IOException;
import java.util.Properties;

public class SpielTestSpeichern {

	public static void main(String[] args) throws IOException {
		iDatenzugriff serialisiert = new DatenzugriffSerialisiert();
		iDatenzugriff serialisiertCSV = new DatenzugriffSerialisiert();
		DatenzugriffSerialisiert dz;
		DatenzugriffCSV dzCSV;
		Properties p;

		serialisiert.oeffnen(p);
		serialisiertCSV.oeffnen(p);

		// dz.oeffnen(p);
		// dz.schreiben(null);
		// dz.schliessen(null);
		//
		// dzCSV.oeffnen(p);
		// dzCSV.schreiben(null);
		// dzCSV.schliessen(null);

		// DatenzugriffSerialisiert.serialize("madn.ser");

		// Spieler s1 = new Spieler("Billy", FarbEnum.BLAU);
		// iDatenzugriff dateiname;
		// dateiname = s1;
		// dateiname.serialize("madn.ser");

		// String dateiname = "madn.ser";
		//
		// DatenzugriffSerialisiert.serialize(dateiname);
		// Spieler s = new Spieler("Billy", null);
		//
		// iDatenzugriff dz;
		// dz = s;
		// dz.serialize(s);

	}

}
