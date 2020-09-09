package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave5 {

	public static void main(String[] args) {
		int poengsum = 0;
		int n = 10;
		for (int i = 1; i<=n; i++) {
		poengsum = parseInt(showInputDialog("din poengsum på prøven"));
		
		
		if (poengsum>100 || poengsum<0) {
			showMessageDialog(null, "ugyldig verdi");
			n++;
		}
		
		else if (poengsum >= 90 && poengsum <= 100) {
			System.out.println("Karakter: A");
		}
		else if (poengsum >= 80) {
			System.out.println("Karakter: B");
		}
		else if (poengsum >= 60) {
			System.out.println("Karakter: C");
		}
		else if (poengsum >= 50) {
			System.out.println("Karakter: D");
		}
		else if (poengsum >= 40) {
			System.out.println("Karakter: E");
		}
		else if (poengsum >= 0) {
			System.out.println("Karakter: F");
		}
		
		

}
}
}