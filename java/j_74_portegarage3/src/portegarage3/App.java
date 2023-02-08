package portegarage3;

public class App {
	
	public static void main(String[] arg) {
		
		PorteDeGarage abcd = new PorteDeGarage(); // déclarer porte par défaut
		
		PorteDeGarage crm = new PorteDeGarage("CRM", 0, 90, 0, false); // Construire une porte
		
		String printAbcd = abcd.toString(); // afficher état porte par défaut
		String printCrm = crm.toString(); // afficher état porte construite
		System.out.println(printAbcd);
		System.out.println(printCrm);
		
		// test ouverture partielle	
	//	Boolean ouvertPartielAbcd = abcd.partiellementOuverte();
		Boolean ouvertPartielCrm = crm.partiellementOuverte() ; 
		
		// test verrouiller
		Boolean verrou = crm.verrouiller();
		
		
		
		int i =0;
	}

}
