public class SpielTest {

	/**
	 * Die Klasse SpielTest
	 * 
	 */

	public static void main(String[] args) {

		Spielbrett brett = new Spielbrett();

		Spieler spieler1 = new Spieler("Billy", FarbEnum.BLAU);
		Spieler spieler2 = new Spieler("Fred", FarbEnum.GELB);
		System.out.println(spieler1);
		System.out.println(spieler2);

		spieler1.wuerfeln();
		spieler2.nochmalWuerfeln();

//		 getSpieler();
		//figurenEinerFarbeAufFeld();
	}
}