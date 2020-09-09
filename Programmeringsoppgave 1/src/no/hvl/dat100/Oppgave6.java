package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave6 {

	public static void main(String[] args) {

		int n = parseInt(showInputDialog("skriv inn tall for n "));
		int sum = 1;
		for (int i = 1; i <= n; i++) {
		sum = sum * i;
	}
		System.out.println(sum);
		

}
}
