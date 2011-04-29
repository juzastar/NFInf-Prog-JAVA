package serie01;

public class SumIter {
	
	//Deklarierung und Initialisierung der statischen Integer Variable ergebnis
	public static int ergebnis;

	
	/*
	 * Iterative Methode sum, Summiert die zahlen von 1 bis zu dem als Argument 
	 * uebergebenen Wert x. 
	 */
	public static int sum(int x){
		while(x>0){
			ergebnis+=x;
			x--;
		}
		return ergebnis;
	}
	
	public static void main(String[] args) {
		/*
		 * Kommandozeilenargumente uebergeben in Eclipse!
		 * Run -> Run Configurations -> (x)=Arguments
		 * Dann bei Programm Arguments den Wert eingeben.
		 * Anschließend Apply und dann Run.
		 */
		System.out.println(sum(Integer.parseInt(args[0])));
	}

}
