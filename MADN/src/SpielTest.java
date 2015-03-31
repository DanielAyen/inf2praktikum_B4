public class SpielTest {

	/**
	 * Die Klasse SpielTest
	 * 
	 */

	public static void main(String[] args) {
/**
 * 
 * @param brett Spielbrett erstellen 
 * 
 * @param spieler1 Spieler erstellen
 * 
 *  @param spieler1 Spieler erstellen
 *  
 * 
 */
		Spielbrett brett = new Spielbrett();

		Spieler spieler1 = new Spieler("Billy", FarbEnum.BLAU,1);
		Spieler spieler2 = new Spieler("Fred", FarbEnum.GELB,2);
//		Spieler spieler3 = new Spieler("Mike", FarbEnum.GRUEN,3);
//		Spieler spieler4 = new Spieler("Holly", FarbEnum.ROT,4);
		
//		Spieler spieler5 = new Spieler("Bad", FarbEnum.ROT,5);

	
/**
 * Spieler1 wuerfelt
 */
		spieler1.wuerfeln();
//		spieler2.wuerfeln();
	
	/**
	 * Spieler werden ausgegeben
	 * 
	 */
		System.out.println(spieler1);
		System.out.println(spieler2);
//		System.out.println(spieler3);
//		System.out.println(spieler4);
//		System.out.println(spieler5);
	}

}