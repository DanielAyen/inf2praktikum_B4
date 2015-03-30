import java.util.ArrayList;

/**
 * über das Interface iBediener
 * */

public interface iBediener {

	ArrayList<Spieler> getSpieler();

	Spieler aktiverSpieler();

	void zaehlerSpielerMax(int spielerAnz);

	Spieler reihenfolgeSpieler();

	void nochmalWuerfeln();

	void entscheidungBeiSechs();

	int aufStartSpielfeld();

	void gegnerSchlagen();

	boolean istFeldBelegt();

	void welcheSpielfigurNutzen();

	boolean istZielfeldEndfeld();

	int figurenEinerFarbeAufFeld();

}
