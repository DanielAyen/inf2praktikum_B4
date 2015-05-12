package frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFileChooser;

import backend.Spiel;

/**
 * Die Klasse EventHandler
 *
 */
public class EventHandler implements ActionListener {
	private GUI gui; // kenntnisbeziehung herstellen!!!
	// private iBediener bediener = new Spiel();
	private int i = 0;

	/**
	 * 
	 * @param gui
	 */
	public EventHandler(GUI gui) {
		this.setGUI(gui);
	}

	/**
	 * 
	 * @param gui
	 */
	private void setGUI(GUI gui) {
		this.gui = gui;

	}

	/**
 * 
 */
	public void actionPerformed(ActionEvent ae) {
		switch (ae.getActionCommand()) {
		case "OK":
			gui.log("Spieler erstellen: Spielerzahl waehlen");
			gui.setSpAnzahl(((Number) gui.getSpinner().getValue()).intValue());
			gui.log("gewaehlter Spielerzahl:" + gui.getSpAnz());
			gui.nameFarbeArtAbfrage();
			gui.getFrame().dispose();
			i= gui.getSpAnz()-1;
			break;
		case "Bestätigen":
			gui.setSpielerName(gui.getFeld01().getText());
			// Radio Button Abfrage Farbe
			if(gui.getRBRED().isSelected()==true ||gui.getRBGREEN().isSelected()==true||gui.getRBBLUE().isSelected()==true||gui.getRBYELLOW().isSelected() == true){

			if (gui.getRBRED().isSelected() == true) {
				gui.setSpielerFarbe("RED");
				gui.getFarbe().add("RED");
				gui.setButtonIconRot();
			}
			if (gui.getRBGREEN().isSelected() == true) {
				gui.setSpielerFarbe("GREEN");
				gui.getFarbe().add("GREEN");
				gui.setButtonIconGruen();
			}
			if (gui.getRBBLUE().isSelected() == true) {
				gui.setSpielerFarbe("BLUE");
				gui.getFarbe().add("BLUE");
				gui.setButtonIconBlau();
			}
			if (gui.getRBYELLOW().isSelected() == true) {
				gui.setSpielerFarbe("YELLOW");
				gui.getFarbe().add("YELLOW");
				gui.setButtonIconGelb();
			}

			// Radio Button Abfrage Art
			if (gui.getMensch().isSelected() == true) {
				gui.setSpielerArt(null);
			}
			if (gui.getKIa().isSelected() == true) {
				gui.setSpielerArt("AGGRESIV");
			}
			if (gui.getKId().isSelected() == true) {
				gui.setSpielerArt("DEFENSIV");
			}
			gui.getFrame02().dispose();
			if(i!=0){
				gui.nameFarbeArtAbfrage();
				i--;
//				gui.getFrame02().dispose();
				if(gui.getFarbe().contains("RED")){
					gui.getRBRED().setEnabled(false);
					if(gui.getFarbe().contains("BLUE")){
						gui.getRBBLUE().setEnabled(false);
					}
					if(gui.getFarbe().contains("YELLOW")){
						gui.getRBYELLOW().setEnabled(false);
					}
					if(gui.getFarbe().contains("GREEN")){
						gui.getRBGREEN().setEnabled(false);
					}
				}
				if(gui.getFarbe().contains("BLUE")){
					gui.getRBBLUE().setEnabled(false);
					if(gui.getFarbe().contains("RED")){
						gui.getRBRED().setEnabled(false);
					}
					if(gui.getFarbe().contains("YELLOW")){
						gui.getRBYELLOW().setEnabled(false);
					}
					if(gui.getFarbe().contains("GREEN")){
						gui.getRBGREEN().setEnabled(false);
					}	
				}	
				if(gui.getFarbe().contains("GREEN")){
					gui.getRBGREEN().setEnabled(false);
					if(gui.getFarbe().contains("RED")){
						gui.getRBRED().setEnabled(false);
					}
					if(gui.getFarbe().contains("YELLOW")){
						gui.getRBYELLOW().setEnabled(false);
					}
					if(gui.getFarbe().contains("BLUE")){
						gui.getRBBLUE().setEnabled(false);
					}	
				}
				if(gui.getFarbe().contains("YELLOW")){
					gui.getRBYELLOW().setEnabled(false);
					if(gui.getFarbe().contains("RED")){
						gui.getRBRED().setEnabled(false);
					}
					if(gui.getFarbe().contains("GREEN")){
						gui.getRBGREEN().setEnabled(false);
					}
					if(gui.getFarbe().contains("BLUE")){
						gui.getRBBLUE().setEnabled(false);
					}	
				}
			}
			gui.getBediener().SpielerHinzufuegen(gui.getSpielerName(), gui.getSpielerFarbe(), gui.getSpielerArt());
			gui.log("SpielerName: "+ gui.getSpielerName() + "\n"+ "SpielerFarbe:" + gui.getSpielerFarbe() + "\n"+ "SpielerArt:" + gui.getSpielerArt());
			
			}else gui. log("Bitte Farbe Wählen");
			break;
		case "neues Spiel erstellen":
			gui.anzahlSpielerDieSpielenWollenAbfrage();
			break;
case "Wuerfeln" : 
			
			gui.Wuerfeln();
			switch (gui.getBediener().wurf()){
			case 1:
				gui.log("Eins wurde gewuerfelt");
				gui.getWuerfelL().setIcon(gui.getEins());
				break;
			case 2:
				gui.log("Zwei wurde gewuerfelt");
				gui.getWuerfelL().setIcon(gui.getZwei());
				break;
			case 3:
				gui.log("Drei wurde gewuerfelt");
				gui.getWuerfelL().setIcon(gui.getDrei());
				break;
			case 4:
				gui.log("Vier wurde gewuerfelt");
				gui.getWuerfelL().setIcon(gui.getVier());
				break;
			case 5:
				gui.log("Fuenf wurde gewuerfelt");
				gui.getWuerfelL().setIcon(gui.getFuenf());
				break;
			case 6:
				gui.log("Sechs wurde gewuerfelt");
				gui.getWuerfelL().setIcon(gui.getSechs());
				break;
			}
			gui.getButtonVor().setEnabled(true);
			gui.getButtonWurf().setEnabled(false);
		break;
		case "Figur vor" : 
			gui.getBediener().getAmZug();
			gui.getBediener().getRegelwerk().aktionsWahl(gui.getBediener().getAmZug(), gui.getBediener().getAmZug().getSpielfigur(i));
			gui.getButtonWurf().setEnabled(true);
			gui.getButtonVor().setEnabled(false);
			break;
		case "Screenshot":
			gui.screenshotErstellen();
			break;
		case "als PDF speichern":
			try {
				gui.screenshotErstellen();
				gui.spielSpeichern();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;
		case "Spiel laden":
			gui.spielLaden();
			break;
		case "Mail senden":
			gui.mailAbfrage();
			break;
		case "senden":
			//gui.mailSenden();
			gui.log("mailing...");
			gui.getMailFrame().dispose();
			break;

		}
	}
}
