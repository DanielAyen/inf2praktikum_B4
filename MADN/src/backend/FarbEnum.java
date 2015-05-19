package backend;

import java.io.Serializable;

/**
 * Enumerator fuer moegliche Farben
 * @author Judith, Michi, Doerte, Tobi
 * 
 */

public enum FarbEnum implements Serializable {
	
	RED, BLUE, GREEN, YELLOW;
	
	public String getCapital(){
		if (this == RED){
			return "R";
		} else if (this == BLUE){
			return "B";
		} else if (this == GREEN){
			return "G";
		} else if(this == YELLOW){
			return "Y";
		} else return null;
	}
}
