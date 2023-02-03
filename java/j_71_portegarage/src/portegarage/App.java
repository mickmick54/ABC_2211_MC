package portegarage;

public class App {

	public static void main(String[] args) {
	
		porte b = new porte();
		
		System.out.println(b.toString());
		
		App app = new App();
        app.ouvert();
        System.out.println("State: " + app.getEtat());
        app.ferme();
        System.out.println("State: " + app.getEtat());
        app.verrouille();
        System.out.println("State: " + app.getEtat());
        app.partiellementOuvert();
        System.out.println("State: " + app.getEtat());
        
	    
	    }

	private void partiellementOuvert() {
		return;
	}

	private void verrouille() {
		return;
	}

	private void ferme() {
		return;
	}

	private String getEtat() {
		return porte.getState();
	}

	private void ouvert() {
		
	}

}
