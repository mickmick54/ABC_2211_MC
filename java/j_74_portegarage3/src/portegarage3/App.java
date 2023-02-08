package portegarage3;

public class App {
	
	public static void main(String[] arg) {
		
		PorteDeGarage abcd = new PorteDeGarage(); // déclarer porte par défaut
		
		PorteDeGarage crm = new PorteDeGarage("CRM", 0, 90, 0, false); // Construire une porte
		
		//String printAbcd = abcd.toString(); // afficher état porte par défaut
		//String printCrm = crm.toString(); // afficher état porte construite
		//System.out.println(printAbcd);
		//System.out.println(printCrm);
		
		// test ouverture partielle	
		//Boolean ouvertPartielAbcd = abcd.partiellementOuverte();
		//Boolean ouvertPartielCrm = crm.partiellementOuverte() ; 
		
		// test verrouiller
		//Boolean verrou = crm.verrouiller();
		
		// test deverouiller
		//Boolean deverrou = crm.deverrouiller();
		
		// test ouverture (avec paramètre)
		Boolean aReussiAOuvrir = crm.ouvrir(45);
		System.out.println(aReussiAOuvrir);
		System.out.println(crm);
		
		//Boolean aReussiAOuvrir2 = crm.ouvrir(90);
		//System.out.println(aReussiAOuvrir2);
		//System.out.println(crm);
		
		// test fermeture
		Boolean aReussiAFermer = crm.fermer(45);
		System.out.println(aReussiAFermer);
		System.out.println(crm);
		
		int i = 0;
	}

}
