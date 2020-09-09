package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave4 {

	public static void main(String[] args) {

		int bruttoInntekt = parseInt(showInputDialog("Skriv inn inntekten din "));
		double trinnSkatt;
		String melding = " Må betale så mye trinnskatt: ";
		
		if (bruttoInntekt < 164100) {
			System.out.println("Betaler ingen trinnskatt");	
			}
		else if (bruttoInntekt <= 230950) {
			trinnSkatt = bruttoInntekt * 0.0093;
			System.out.println(melding + trinnSkatt + "kr");
		}
		else if (bruttoInntekt <= 580650) {
			trinnSkatt = bruttoInntekt * 0.0241;
			System.out.println(melding + trinnSkatt + "kr");
		}
		else if (bruttoInntekt <= 934050) {
			trinnSkatt = bruttoInntekt * 0.1152;
			System.out.println(melding + trinnSkatt + "kr");
		}
		else  {
			trinnSkatt = bruttoInntekt * 0.1452;
			System.out.println(melding + trinnSkatt + "kr");
		}
	}
}