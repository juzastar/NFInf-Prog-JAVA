package practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* This document is intellectual content from Mr. F. Simon CAU Kiel */

public class stream {
	public static void main(String[] args){
		try{
			System.out.println("Bitte geben Sie einen Text ein");			
			/*
			 * System.in ist der Standerdinput (Tastatur) vom Typ InputStream.
			 * Um die Eingabe lesen zu koennen benotigen wir die Methode (read()), die von
			 * der Klasse InputstreamReader bereitgestellt wird. Wir uebergeben deshalb 
			 * System.in an ein Objekt vom Typ InputStreamReader. Da die Methode (read())
			 * nur Zeichenweise lesen kann und wir ganze Zeilen lesen wollen, benoetigen wir
			 * eine Methode, die ganze Zeilen liest. Dafuer haben wir die Methode (readline()),
			 * diese wird aber nur von der Klasse BufferedReader bereitgestellt, deshalb 
			 * uebergeben wir alles Vorherige an ein Objekt vom Typ BufferedReader und koennen
			 * nun die Methode (readline()) nutzen 
			 */
			BufferedReader tastatur = new BufferedReader(
								new InputStreamReader(System.in));
			/*
			 * Wir koennten statt der oberen zwei Zeilen auch folgendes schreiben:
			 * 
			 * // eingegebener Text wird in dem Objekt eingabe vom Typ InputStream gespeichert
			 * InputStream eingabe = System.in;
			 *
			 * // Wir erzeugen ein neues Objekt vom Typ InputStreamReader, nennen es Zeichenleser
			 * // und uebergeben diesem das Objekt eingabe
			 * // Auf das Objekt Zeichenleser koennen wir nur die Methode read() anwenden
			 * // zeichenleser.read();
			 * InputStreamReader Zeichenleser = new InputStreamReader(eingabe);
			 * 
			 * //Nun erzeugen wir ein Objekt vom Typ Bufferedreader nennen es Zeilenleser und uebergeben diesem
			 * //das Objekt Zeichenleser
			 * // Auf das Objekt Zeilenleser koennen wir nun die Methode readline() anwenden
			 * // Zeilenleser.readline();
			 * BufferedReader Zeilenleser = new BufferedReader(Zeichenleser);
			 */
			
			
			
			
			
			
			
			/*
			 * Hier wartet das Programm solange bis eine Eingabe erfolgt ist und
			 * mit Enter bestaetigt wurde
			 * Die Stringvariable s nimmt die Zeile auf, die gerade gelesen wird 
			 */
			String s = tastatur.readLine();
			System.out.println("Der eingegebene Text lautet " + s) ;
		}
		catch (Exception e) {
			
		}
	}

}
