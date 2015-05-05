package backend;

import java.io.IOException;
import java.util.Properties;

import frontend.iDatenzugriff;

/**
 * 
 * Die Klasse DatenzugriffPDF erzeugt eine PDF
 *
 */
public class DatenzugriffPDF implements iDatenzugriff {

//	/**
//	 * oeffnet die PDF
//	 */
//	@Override
//	public void oeffnen(Properties p) throws IOException {
//		// TODO Auto-generated method stub
//
//	}

	/**
	 * speichert / schreibt die PDF
	 */
	@Override
	public void speichern(String dateiname, String dateiende, Object o)
			throws IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * laedt / liest die PDF
	 */
	@Override
	public Object laden(String dateiname) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public void schreiben(Object object) throws IOException {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public Object lesen() throws IOException {
	// // TODO Auto-generated method stub
	// return null;
	// }

	/**
	 * schliesst die PDF
	 */
//	@Override
//	public void schliessen(Object object) throws IOException {
//		// TODO Auto-generated method stub
//
//	}

}
