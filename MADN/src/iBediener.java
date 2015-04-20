import java.util.Properties;



/**
 * über das Interface iBediener
 * */

public interface iBediener {

	void spielStarten();
	void entscheidungBeiSechs();
		void erstelleSpieler(String name, FarbEnum farbe);
	void erstelleBrett();
	void wuerfeln();
	int aufStartSpielfeld();
	void welcheSpielfigurNutzen(FarbEnum farbe, Object[][][] farbeNamePosition,
			int w);
	void spielSpeichern(Properties p);
	void spielLaden(Properties p);
	
	
}
