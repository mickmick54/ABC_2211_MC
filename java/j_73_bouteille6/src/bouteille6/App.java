package bouteille6;

public class App {
	
	public static void main(String[] args) {
	bouteille2 evian = new bouteille2("evian",0.5,1.0,true);
	
	/*boolean test = evian.remplir(0.8);
	boolean test2 = evian.remplir(0.3);
	
	boolean test3 =evian.viderTout();	
	*/
	
	boolean test4 = evian.vider(-3);
	}
}