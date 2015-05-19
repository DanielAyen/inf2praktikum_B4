package frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
			i = gui.getSpAnz() - 1;
			break;
		case "Best‰tigen":
			gui.setSpielerName(gui.getFeld01().getText());
			// Radio Button Abfrage Farbe
			if (gui.getRBRED().isSelected() == true
					|| gui.getRBGREEN().isSelected() == true
					|| gui.getRBBLUE().isSelected() == true
					|| gui.getRBYELLOW().isSelected() == true) {

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
				if (i != 0) {
					gui.nameFarbeArtAbfrage();
					i--;
					// gui.getFrame02().dispose();
					if (gui.getFarbe().contains("RED")) {
						gui.getRBRED().setEnabled(false);
						if (gui.getFarbe().contains("BLUE")) {
							gui.getRBBLUE().setEnabled(false);
						}
						if (gui.getFarbe().contains("YELLOW")) {
							gui.getRBYELLOW().setEnabled(false);
						}
						if (gui.getFarbe().contains("GREEN")) {
							gui.getRBGREEN().setEnabled(false);
						}
					}
					if (gui.getFarbe().contains("BLUE")) {
						gui.getRBBLUE().setEnabled(false);
						if (gui.getFarbe().contains("RED")) {
							gui.getRBRED().setEnabled(false);
						}
						if (gui.getFarbe().contains("YELLOW")) {
							gui.getRBYELLOW().setEnabled(false);
						}
						if (gui.getFarbe().contains("GREEN")) {
							gui.getRBGREEN().setEnabled(false);
						}
					}
					if (gui.getFarbe().contains("GREEN")) {
						gui.getRBGREEN().setEnabled(false);
						if (gui.getFarbe().contains("RED")) {
							gui.getRBRED().setEnabled(false);
						}
						if (gui.getFarbe().contains("YELLOW")) {
							gui.getRBYELLOW().setEnabled(false);
						}
						if (gui.getFarbe().contains("BLUE")) {
							gui.getRBBLUE().setEnabled(false);
						}
					}
					if (gui.getFarbe().contains("YELLOW")) {
						gui.getRBYELLOW().setEnabled(false);
						if (gui.getFarbe().contains("RED")) {
							gui.getRBRED().setEnabled(false);
						}
						if (gui.getFarbe().contains("GREEN")) {
							gui.getRBGREEN().setEnabled(false);
						}
						if (gui.getFarbe().contains("BLUE")) {
							gui.getRBBLUE().setEnabled(false);
						}
					}
				}
				gui.getBediener().SpielerHinzufuegen(gui.getSpielerName(),
						gui.getSpielerFarbe(), gui.getSpielerArt());
				gui.log("SpielerName: " + gui.getSpielerName() + "\n"
						+ "SpielerFarbe:" + gui.getSpielerFarbe() + "\n"
						+ "SpielerArt:" + gui.getSpielerArt());

			} else
				gui.log("Bitte Farbe W‰hlen");
			break;
		case "neues Spiel erstellen":
			gui.anzahlSpielerDieSpielenWollenAbfrage();
			break;
		case "Wuerfeln":

			gui.Wuerfeln();
			switch (gui.getBediener().wurf()) {
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
			break;
		case "Screenshot":
			gui.screenshotErstellen();
			break;
		case "als PDF speichern":
			try {
				gui.screenshotErstellen();
				gui.spielSpeichern();
				gui.log("Spiel wurde gespeichert (PDF)");

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
			String an = gui.getEmpfaenger();

			final String username = "madnb4@gmail.com";
			final String password = "DanielJudithVerena";

			Properties p = new Properties();
			p.put("mail.smtp.auth", "true");
			p.put("mail.smtp.starttls.enable", "true");
			p.put("mail.smtp.host", "smtp.gmail.com");
			p.put("mail.smtp.port", "587");

			Session session = Session.getInstance(p,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username,
									password);
						}
					});

			// if (anhangPfad1 == null) { // pdf & ser
			// p.put("anhangPfad1", "MADN Spiel PDF.pdf");
			// } else {
			// p.put("anhangPfad1", anhangPfad1);
			// }
			// if (anhangName1 == null) {
			// p.put("anhangName1", "MADN Spiel PDF");
			// } else {
			// p.put("anhangName1", anhangName1);
			// }
			// if ("SpielSerialisiert.ser" == null) {
			// p.put("anhangPfad2", "");
			// } else {
			// p.put("anhangPfad2", "SpielSerialisiert.ser");
			// }
			// if ("MADN Spiel Serialisiert" == null) {
			// p.put("anhangNam2", "");
			// } else {
			// p.put("anhangNam2", "MADN Spiel Serialisiert");
			// }

			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("madnb4@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(an));
				message.setSubject("Mensch aergere dich nicht - Spielstand");

				Multipart mp = new MimeMultipart();
				MimeBodyPart text = new MimeBodyPart();
				text.setText("Lieber Spieler! \nIm Anhang findest du deinen Spielstand als PDF oder in serialisierter Form. \nViel Spaﬂ weiterhin beim Spielen.");

				MimeBodyPart anhangPDF = new MimeBodyPart();
				try {
					anhangPDF.attachFile("MADN Spiel PDF.pdf");
				} catch (IOException e) {
					e.printStackTrace();
				}

				MimeBodyPart anhangSer = new MimeBodyPart();
				try {
					anhangSer.attachFile("SpielSerialisiert.ser");
				} catch (IOException e) {
					e.printStackTrace();
				}

				mp.addBodyPart(text);
				mp.addBodyPart(anhangPDF);
				mp.addBodyPart(anhangSer);

				message.setContent(mp);

				Transport.send(message);



			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}

			gui.log("E-Mail wurde gesendet.");
			gui.getMailFrame().dispose();
			break;

		case "als CSV speichern":

			try {
				gui.spielSpeichernCSV();
				gui.log("Spiel wurde gespeichert (CSV) ");

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;

		case "Serialisiert speichern":

			try {
				gui.spielSpeichernSER();
				gui.log("Spiel wurde gespeichert (SER) ");

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;

		default:
			JButton b = (JButton) ae.getSource();
			for (int i = 0; i < gui.getButtonArray().length; i++) {
				if (gui.getButtonArray()[i] == b) {
					if (gui.compareIcon((ImageIcon) b.getIcon())) {
						String ID_old = "";
						if (i <= 15) {
							ID_old += "S" + (i % 4 + 1);
						} else if (i > 15 && i < 56) {
							ID_old += i - 15;
						} else if (i >= 56) {
							ID_old += "E" + (i % 4 + 1);
						}
						gui.playerIcons(
								gui.getBediener().zugDurchfuehren(ID_old), i);

						break;
					}
				}
			}

		}
	}
}
