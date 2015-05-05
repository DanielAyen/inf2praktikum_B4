package backend;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import frontend.iAnzeige;
import frontend.iDatenzugriff;

/**
 * 
 * Die Klasse DatenzugriffPDF erzeugt eine PDF
 *
 */
public class DatenzugriffPDF implements iDatenzugriff {
	private iAnzeige logger;

	// private Document doc;
	// private String dateiname;

	// public void setDateiname(String dateiname) {
	// this.dateiname = dateiname;
	// }

	/**
	 * speichert / schreibt die PDF
	 * 
	 * @return
	 * @throws IOException
	 */
	@Override
	public void speichern(String dateiname, String dateiende, Object o)
			throws IOException {

		// try {
		// if (o instanceof Object[][]) {
		// Object[][] array = (Object[][]) o;
		// PdfPTable tabelle = new PdfPTable(array[0].length);
		// PdfPCell zelle;
		//
		// for (int i = 0; i < array.length; i++) {
		// for (int j = 0; j < array[i].length; j++) {
		// zelle = new PdfPCell(new Phrase(array[i][j].toString()));
		// tabelle.addCell(zelle);
		// }
		// }
		// doc.add(tabelle);
		// } else {
		// doc.add(new Paragraph(o.toString()));
		// }
		// } catch (DocumentException fehler) {
		// throw new IOException("PDF konnte nicht erstellt werden", fehler);
		// }

	}

	/**
	 * laedt / liest die PDF
	 */
	@Override
	public Object laden(String dateiname) {
		return dateiname;
	}

}
