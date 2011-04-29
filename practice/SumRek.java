package serie01;

public class SumRek {
	
	//Deklarierung und Initialisierung der statischen Integer Variable ergebnis
	public static int ergebnis = 0;
	
	/*
	 * Rekursive Methode sum, Summiert die zahlen von 1 bis zu dem als Argument 
	 * uebergebenen Wert x. 
	 */
	
	public static int sum(int x){
		
		if(x == 0){
			return ergebnis;
		}
		else{
			ergebnis += x;
			//erneuter Aufruf von sum, wobei der Wert von x 
		    //um 1 reduziert als Argument uebergeben wird!
			return sum(x-1);
		}
		
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
