

/**
 * über das Interface iBediener
 * */

public interface iBediener {

	void spielStarten();
	void entscheidungBeiSechs();
	void welcheSpielfigurNutzen();
	
	void erstelleSpieler(String name, FarbEnum farbe);
	void erstelleBrett();
	void wuerfeln();
	
	
}
