import java.io.IOException;


public interface iDatenzugriff {

	void oeffnen(Object o) throws IOException;
	 //Vergesst diesen scheiﬂ Spieler serialize(Spieler s);

	void schliessenSchreiben(Object o);

	void schliessenLesen(Object o);

	void schreiben(Object o);

	void lesen(Object o) throws IOException;
	
	

	
	
	//klasse+- .lesen(null)
}
