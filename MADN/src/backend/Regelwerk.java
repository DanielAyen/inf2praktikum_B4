package backend;

import java.io.Serializable;

import backend.Spieler.Spielfigur;

/**
 * Klasse zur Verwaltung der Spielregeln
 * 
 * @author Judith, Michi,Tobi,Doerte
 *
 */

public class Regelwerk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Spiel spiel;

	/**
	 * Konstruktor des Regelwekes, bekommt das Spiel uebergeben
	 * 
	 * @param spiel
	 */

	public Regelwerk(Spiel spiel) {
		this.spiel = spiel;
	}

	/**
	 * Methode, um eine Spielfigur vom Startfeld auf ihr erstes Spielfeld zu
	 * setzten
	 * 
	 * @param spieler
	 * @param spielfigur
	 */

	public String[] aktionsWahl(Spieler spieler, Spielfigur spielfigur){ //int ergebnis) {
		if (spielfigur.getSpielfeld().getID().contains("S")) { // && ergebnis==6){
			return rauskommen(spieler, spielfigur);
		} else
			return figurZiehen(spieler, spielfigur);

	}

	public String [] rauskommen(Spieler spieler, Spielfigur spielfigur) {
		String [] res = new String [2];

		if (spieler.getFarbe().equals(FarbEnum.RED)) {
			// if (spieler.getWuerfel().getErgebnis() == 6) {
			if (spiel.getBrett().getSpielbrett()[0].getFelder()[0].getSpielfigur() == null) {
				spiel.getBrett().getSpielbrett()[0].getFelder()[spielfigur.getID()].setSpielfigur(null);
				spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[0].getFelder()[0]);
				spielfigur.getSpielfeld().setSpielfigur(spielfigur);
				res [0]= spiel.getBrett().getSpielbrett()[0].getFelder()[0].getID();
			} else if (spiel.getBrett().getSpielbrett()[0].getFelder()[0].getSpielfigur() != null) {
				if (spieler.getFarbe().equals(spiel.getBrett().getSpielbrett()[0].getFelder()[0].getSpielfigur().getFarbe())) {
					//!// System.out.println("Feld von eigener Spielfigur besetzt!");
				} else {
					res [1] = schlagen(spiel.getBrett().getSpielbrett()[0].getFelder()[0].getSpielfigur());
					spiel.getBrett().getSpielbrett()[0].getFelder()[spielfigur.getID()].setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[0].getFelder()[0]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res [0] = spiel.getBrett().getSpielbrett()[0].getFelder()[0].getID();
				}
			}
			// }
		}
		if (spieler.getFarbe().equals(FarbEnum.BLUE)) {
			// if (spieler.getWuerfel().getErgebnis() == 6) {
			if (spiel.getBrett().getSpielbrett()[10].getFelder()[0].getSpielfigur() == null) {
				spiel.getBrett().getSpielbrett()[10].getFelder()[spielfigur.getID()].setSpielfigur(null);
				spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[10].getFelder()[0]);
				spielfigur.getSpielfeld().setSpielfigur(spielfigur);
				res [0] = spiel.getBrett().getSpielbrett()[10].getFelder()[0].getID();
			} else if (spiel.getBrett().getSpielbrett()[10].getFelder()[0].getSpielfigur() != null) {
				if (spieler.getFarbe().equals(spiel.getBrett().getSpielbrett()[10].getFelder()[0].getSpielfigur().getFarbe())) {
					//!// System.out.println("Feld von eigener Spielfigur besetzt!");
				} else {
					res [1] = schlagen(spiel.getBrett().getSpielbrett()[10].getFelder()[0].getSpielfigur());
					spiel.getBrett().getSpielbrett()[10].getFelder()[spielfigur.getID()].setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[10].getFelder()[0]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res [0] = spiel.getBrett().getSpielbrett()[10].getFelder()[0].getID();
				}
			}
			// }
		}
		if (spieler.getFarbe().equals(FarbEnum.GREEN)) {
			// if (spieler.getWuerfel().getErgebnis() == 6) {
			if (spiel.getBrett().getSpielbrett()[20].getFelder()[0].getSpielfigur() == null) {
				spiel.getBrett().getSpielbrett()[20].getFelder()[spielfigur.getID()].setSpielfigur(null);
				spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[20].getFelder()[0]);
				spielfigur.getSpielfeld().setSpielfigur(spielfigur);
				res [0] = spiel.getBrett().getSpielbrett()[20].getFelder()[0].getID();
			} else if (spiel.getBrett().getSpielbrett()[20].getFelder()[0].getSpielfigur() != null) {
				if (spieler.getFarbe().equals(spiel.getBrett().getSpielbrett()[20].getFelder()[0].getSpielfigur().getFarbe())) {
					//!// System.out.println("Feld von eigener Spielfigur besetzt!");
				} else {
					res [1] = schlagen(spiel.getBrett().getSpielbrett()[20].getFelder()[0].getSpielfigur());
					spiel.getBrett().getSpielbrett()[20].getFelder()[spielfigur.getID()].setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[20].getFelder()[0]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res [0] = spiel.getBrett().getSpielbrett()[20].getFelder()[0].getID();
				}
			}
			// }
		}
		if (spieler.getFarbe().equals(FarbEnum.YELLOW)) {
			// if (spieler.getWuerfel().getErgebnis() == 6) {
			if (spiel.getBrett().getSpielbrett()[30].getFelder()[0].getSpielfigur() == null) {
				spiel.getBrett().getSpielbrett()[30].getFelder()[spielfigur.getID()].setSpielfigur(null);
				spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[30].getFelder()[0]);
				spielfigur.getSpielfeld().setSpielfigur(spielfigur);
				res [0] = spiel.getBrett().getSpielbrett()[30].getFelder()[0].getID();
			} else if (spiel.getBrett().getSpielbrett()[30].getFelder()[0].getSpielfigur() != null) {
				if (spieler.getFarbe().equals(spiel.getBrett().getSpielbrett()[30].getFelder()[0].getSpielfigur().getFarbe())) {
					//!// System.out.println("Feld von eigener Spielfigur besetzt!");
				} else {
					res [1] = schlagen(spiel.getBrett().getSpielbrett()[30].getFelder()[0].getSpielfigur());
					spiel.getBrett().getSpielbrett()[30].getFelder()[spielfigur.getID()].setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[30].getFelder()[0]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res [0] = spiel.getBrett().getSpielbrett()[30].getFelder()[0].getID();
				}
			}
			// }
		}

		spiel.setAmZug(spieler);
		return res;
	}


	/**
	 * Methode, um eine Spielfigur auf den Spielfeldern zu bewegen
	 * 
	 * @param spieler
	 * @param spielfigur
	 */

	public String[] figurZiehen(Spieler spieler, Spielfigur spielfigur) {
		String[] res = new String [2];
		if (spielfigur.istAufStartfeld()) {
			//!// System.out.println(spielfigur.toString() + " sitzt noch auf Startfeld!");
			return null;
		}

		int oldPos = spielfigur.getSpielfeld().getPosition() - 1;
		int newPos = oldPos + spieler.getWuerfel().getErgebnis();

		if (newPos >= 40) {
			spielfigur.setHatUmrundet(true);
			newPos -= 40;
		}

		if (spielfigur.hatUmrundet()) {
			switch (spielfigur.getFarbe()) {
			case RED:
				newPos++;
				if (newPos <= 4) {
					return insEndfeldLaufen(spieler, spielfigur, newPos);
				}
				break;
			case BLUE:
				if (newPos >= 10) {
					newPos -= 9;
					if (newPos <= 4) {
						return insEndfeldLaufen(spieler, spielfigur, newPos);
					}
				}
				break;
			case GREEN:
				if (newPos >= 20) {
					newPos -= 19;
					if (newPos <= 4) {
						return insEndfeldLaufen(spieler, spielfigur, newPos);
					}
				}
				break;
			case YELLOW:
				if (newPos >= 30) {
					newPos -= 29;
					if (newPos <= 4) {
						return insEndfeldLaufen(spieler, spielfigur, newPos);
					}
				}
				break;
			}
		}

		if (spiel.getBrett().getSpielbrett()[newPos].getFelder()[0].getSpielfigur() == null) {
			spielfigur.getSpielfeld().setSpielfigur(null);
			spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[newPos].getFelder()[0]);
			spielfigur.getSpielfeld().setSpielfigur(spielfigur);
			res [0] = spiel.getBrett().getSpielbrett()[newPos].getFelder()[0].getID();
		} else if (spiel.getBrett().getSpielbrett()[newPos].getFelder()[0].getSpielfigur() != null) {
			if (spieler.getFarbe().equals(spiel.getBrett().getSpielbrett()[newPos].getFelder()[0].getSpielfigur().getFarbe())) {
				//!// System.out.println("Feld von eigener Spielfigur besetzt!");
				return null;
			} else {
				res [1] = schlagen(spiel.getBrett().getSpielbrett()[newPos].getFelder()[0].getSpielfigur());
				spielfigur.getSpielfeld().setSpielfigur(null);
				spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[newPos].getFelder()[0]);
				spielfigur.getSpielfeld().setSpielfigur(spielfigur);
				res [0] = spiel.getBrett().getSpielbrett()[newPos].getFelder()[0].getID();
			}
		}

		if (spieler.getWuerfel().getErgebnis() != 6) {
			spiel.setNaechster(spieler);
		} else {
			spiel.setAmZug(spieler);
		}
		return res ;

	}
	/**
	 * 
	 * Methode, um die Spielfigur auf die Endfelder zu bewegen newPos ist die
	 * neue Position auf den Endfeldern
	 * 
	 * @param spieler
	 * @param spielfigur
	 * @param newPos
	 */

	private String[] insEndfeldLaufen(Spieler spieler, Spielfigur spielfigur, int newPos) {
		String [] res = new String [2];
		switch (spielfigur.getFarbe()) {
		case RED:
			for (int i = 1; i <= newPos; i++) {
				if (spiel.getBrett().getSpielbrett()[39].getFelder()[i].getSpielfigur() != null) {
					//!// System.out.println("Ueberspringen nicht moeglich");
					return null;
				}
			}
			spielfigur.getSpielfeld().setSpielfigur(null);
			spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[39].getFelder()[newPos]);
			spielfigur.getSpielfeld().setSpielfigur(spielfigur);
			res [0] = spiel.getBrett().getSpielbrett()[39].getFelder()[newPos].getID();
			break;
		case BLUE:
			for (int i = 1; i <= newPos; i++) {
				if (spiel.getBrett().getSpielbrett()[9].getFelder()[i].getSpielfigur() != null) {
					//!// System.out.println("Ueberspringen nicht moeglich");
					return null;
				}
			}
			spielfigur.getSpielfeld().setSpielfigur(null);
			spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[9].getFelder()[newPos]);
			spielfigur.getSpielfeld().setSpielfigur(spielfigur);
			res [0] = spiel.getBrett().getSpielbrett()[9].getFelder()[newPos].getID();
			break;
		case GREEN:
			for (int i = 1; i <= newPos; i++) {
				if (spiel.getBrett().getSpielbrett()[19].getFelder()[i].getSpielfigur() != null) {
					//!// System.out.println("Ueberspringen nicht moeglich");
					return null;
				}
			}
			spielfigur.getSpielfeld().setSpielfigur(null);
			spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[19].getFelder()[newPos]);
			spielfigur.getSpielfeld().setSpielfigur(spielfigur);
			res [0] = spiel.getBrett().getSpielbrett()[19].getFelder()[newPos].getID();
			break;
		case YELLOW:
			for (int i = 1; i <= newPos; i++) {
				if (spiel.getBrett().getSpielbrett()[29].getFelder()[i].getSpielfigur() != null) {
					//!// System.out.println("Ueberspringen nicht moeglich");
					return null;
				}
			}
			spielfigur.getSpielfeld().setSpielfigur(null);
			spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[29].getFelder()[newPos]);
			spielfigur.getSpielfeld().setSpielfigur(spielfigur);
			res [0] = spiel.getBrett().getSpielbrett()[29].getFelder()[newPos].getID();
			break;
		}

		if (spieler.getWuerfel().getErgebnis() != 6) {
			spiel.setNaechster(spieler);
		} else {
			spiel.setAmZug(spieler);
		}
		return res;
	}


	/**
	 * Methode ueberprueft, ob das neue Spielfeld frei oder besetzt ist, ist es
	 * besetzt von einer anderen Spielfigur, wird diese auf ihr Startfeld
	 * gesetzt
	 * 
	 * @param spielfigur
	 */
	private String schlagen(Spielfigur spielfigur) {
		String res = null;
		spielfigur.getSpielfeld().setSpielfigur(null);
		switch (spielfigur.getFarbe()) {
		case RED:
			for (int i = 0; i < spiel.getBrett().getSpielbrett()[0].getFelder().length; i++) {
				if (spiel.getBrett().getSpielbrett()[0].getFelder()[i].getSpielfigur() == null) {
					spielfigur.getSpielfeld().setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[0].getFelder()[i]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res = spiel.getBrett().getSpielbrett()[0].getFelder()[i].getID();
				}
			}
			//!// System.out.println(spielfigur.toString() + " Wurde auf Startfeld geschmissen");
			break;
		case BLUE:
			for (int i = 0; i < spiel.getBrett().getSpielbrett()[10].getFelder().length; i++) {
				if (spiel.getBrett().getSpielbrett()[10].getFelder()[i].getSpielfigur() == null) {
					spielfigur.getSpielfeld().setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[10].getFelder()[i]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res = spiel.getBrett().getSpielbrett()[10].getFelder()[i].getID();
				}
			}
			//!// System.out.println(spielfigur.toString() + " Wurde auf Startfeld geschmissen");
			break;
		case GREEN:
			for (int i = 0; i < spiel.getBrett().getSpielbrett()[20].getFelder().length; i++) {
				if (spiel.getBrett().getSpielbrett()[20].getFelder()[i].getSpielfigur() == null) {
					spielfigur.getSpielfeld().setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[20].getFelder()[i]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res =spiel.getBrett().getSpielbrett()[20].getFelder()[i].getID();
				}
			}
			//!// System.out.println(spielfigur.toString() + " Wurde auf Startfeld geschmissen");
			break;
		case YELLOW:
			for (int i = 0; i < spiel.getBrett().getSpielbrett()[30].getFelder().length; i++) {
				if (spiel.getBrett().getSpielbrett()[30].getFelder()[i].getSpielfigur() == null) {
					spielfigur.getSpielfeld().setSpielfigur(null);
					spielfigur.setSpielfeld(spiel.getBrett().getSpielbrett()[30].getFelder()[i]);
					spielfigur.getSpielfeld().setSpielfigur(spielfigur);
					res = spiel.getBrett().getSpielbrett()[30].getFelder()[i].getID();
				}
			}
			//!// System.out.println(spielfigur.toString() + " Wurde auf Startfeld geschmissen");
			break;
		}
		return res;
	}

	// TODO: Methode im Endfeld vorlaufen!

}
