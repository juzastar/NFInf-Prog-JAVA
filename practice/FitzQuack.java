/*
  FitzQuack.java
  Author: SysPro
  
  Diese Klasse ermoeglicht es, natuerliche Zahlen von 1 aufwaerts ausgeben
  zu lassen, wobei die Aufzaehlung folgendem Abzaehlreim entspricht:
  - Ist die Zahl durch fuenf teilbar, so wird das Wort "Fitz" ausgegeben.
  - Ist die Zahl durch sieben teilbar, so wird das Wort "Quack" ausgegeben.
  - Ist die Zahl durch fuenf UND durch sieben teilbar, so wird das Wort 
    "FitzQuack" ausgegeben.
  - In jedem anderen Fall wird die Zahl selbst ausgegeben.
  
*/

public class FitzQuack 
{

    /*
      main()
      Die main-Methode beinhaltet die komplette Abzaehllogik. Sie zaehlt den
      Abzaehlreim bis zu der durch den 0. Arrayeintrag des Parameters args
      angegebenen Zahl.
      Ist das Array leer oder lasst sich der Arrayeintrag nicht zu einer 
      ganzen Zahl konvertieren, bricht das Programm mit einer Fehlermeldung ab.
      Parameter: args Kommandozeilenrest als Array von Strings.
      Rueckgabewert: keiner
      Seiteneffekte: Wenn sich das erste Element des Parameters als ganze Zahl
                     konvertieren laesst, wird der Abzaehlreim bis zu ihr auf
                     der Konsole ausgegeben.
      
    */
    public static void main (String[] args)
    {
	int upto = Integer.parseInt (args[0]);
	for (int i=1; i<=upto; i++) 
        {
	    if (((i % 5) == 0) && ((i % 7) == 0))
		System.out.print ("FitzQuack");
	    else 
		if ((i % 5) == 0)
		    System.out.print ("Fitz");
	    else
		if ((i % 7) == 0)
		    System.out.print ("Quack");
	    else
		System.out.print (i);
	    System.out.print (" ");
	} // for
	System.out.println();
    } // main
} // class
