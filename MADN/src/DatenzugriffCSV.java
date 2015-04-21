import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Klasse DatenzugriffCSV implementiert das Interface iDatenzugriff
 */
public class DatenzugriffCSV implements iDatenzugriff {
	/**
	 * @param br
	 *            der buffered reader
	 * @param bw
	 *            der buffered writer
	 * @param farbeNamePosition
	 *            das Array der Spielfiguren
	 * @param spieler
	 *            der Spieler
	 */

	private BufferedReader br;
	private BufferedWriter bw;
	private Object[][][] farbeNamePosition;
	private ArrayList<Spieler> spieler;

	/**
	 * oeffnet die Datei
	 * 
	 * @param p
	 *            Properties
	 * @throws exception
	 *             wirft eine Exception, wenn neine Auswahl gewählt wurde
	 */
	@Override
	public void oeffnen(Properties p) throws IOException {
		String dateiname = "MADN";

		if ("schreiben".equals(p.getProperty("Auswahl"))) {
			bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(dateiname)));
		} else if ("lesen".equals(p.getProperty("Auswahl"))) {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					dateiname)));
		} else {
			throw new IOException("Auswahl wurde nicht definiert!");
		}

	}

	/**
	 * schreibt in die Datei und speichert sie
	 * 
	 * @param object
	 *            Object
	 * @throws exception
	 *             wirft eine Exception
	 */
	@Override
	public void schreiben(Object object) throws IOException {
				bw = new BufferedWriter(new FileWriter("MADN.txt"));
		PrintWriter pw = null;

		for (int h = 0; h < spieler.size(); h++) {

			spieler.get(h);

			bw.write(spieler.get(h) + ";");

		}

		for (int i = 0; i < farbeNamePosition.length; i++) {

			for (int j = 0; j < farbeNamePosition[i].length; j++) {

				for (int k = 0; k < farbeNamePosition[i][j].length; k++) {

					// if (zweiterWert) {
					// zweiterWert = false;
					// } else {
					// bw.write(";");
					// }
					//Object f = farbeNamePosition[i][j][k];

//					if (f == null) {
//						continue;
						String s = "";
						s += i + ";";
						s += j + ";";
						s += k + ";";
						bw.write(s);
						bw.newLine();
					

						bw.write(farbeNamePosition[i][j][k].toString());

						pw = new PrintWriter(new BufferedWriter(new FileWriter("MADN.txt")));
						pw.print(farbeNamePosition[i][j][k].toString());

//						farbeNamePosition[i][j][k]
//								.writeToStream(new PrintWriter(System.out));
					

				}

			}
		}

		bw.write("\n");
		bw.flush();
		bw.close();
	}

	/**
	 * liest die Datei aus
	 * 
	 * @throws exception
	 *             wirft eine Exception
	 */
	@Override
	public Object lesen() throws IOException {

		String farbe = "FarbEnum." + spieler;

		String line;
		ArrayList<String> auslesen = new ArrayList<String>();

		while ((line = br.readLine()) != null) {
			auslesen.add(line);
		}

		String[][] ausgabe = new String[auslesen.size()][];

		for (int i = 0; i < ausgabe.length; i++) {
			ausgabe[i] = auslesen.get(i).split(";");
		}
		return ausgabe;
	}

	/**
	 * schliesst die Datei und speichert sie
	 * 
	 * @param object
	 *            Object
	 * @throws exception
	 *             wirft eine Exception
	 * 
	 */
	@Override
	public void schliessen(Object object) throws IOException {
		if (bw != null) {
			bw.close();
			bw = null;
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}

}
