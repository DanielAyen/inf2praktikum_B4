package frontend;

import java.io.IOException;

public interface iBediener {
	
	/**
	 * Methode um einen Spieler hinzuzufuegen
	 * @param name des Spielers 
	 * @param farbe der gewaehlten Spilfigur 
	 */
	public void SpielerHinzufuegen(String name, String farbe, String ki);
	
	/**
	 * Methode um das Spiel zu initialisieren 
	 */
	public void initSpiel();
	
	public void zugDurchfuehren(int ID);



	Object laden(String dateiname, String dateiende);
	void Speichern(String dateiname, String dateiende) throws IOException;

	
//________________________TestSituationen___________________________________________________//
//	void initTestSpiel();
//	void initTestSpielZugAggressiv();
//	void initTestSpielZugDefensiv();
//	public void zugDurchfuehrenSchmeissenTest(int ID);
//	public void zugDurchfuehrenEndfeldTest(int ID);

	
//___________________________________________________________________________________________--
	public Object getSpieler();
	
	
	
}
