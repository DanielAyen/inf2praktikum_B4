
public class W�rfel2 {
	public static void main(String[] args) {
	int w;
	w = (int) ((Math.random() * 6) + 1); // Erg. wird zu int gecasted
		System.out.println("Es wurde eine " + w + " gew�rfelt.");

	}
}
