package exercice1;

public class App {
	
	  public static void main(String[] args) {
		  
	    int paiementsCarteBleue = 5;
	    
	    int chequesEmis = 10;
	    
	    int virementsAutomatiques = 5;
	    
	    int totalPaiements = paiementsCarteBleue + chequesEmis + virementsAutomatiques;
	    
	    double pourcentageCarteBleue = (double) paiementsCarteBleue / totalPaiements * 100;
	    
	    double pourcentageCheques = (double) chequesEmis / totalPaiements * 100;
	    
	    double pourcentageVirements = (double) virementsAutomatiques / totalPaiements * 100;
	    
	    System.out.println("Pourcentage de paiements par Carte Bleue: " + pourcentageCarteBleue + "%");
	    
	    System.out.println("Pourcentage de paiements par cheques: " + pourcentageCheques + "%");
	    
	    System.out.println("Pourcentage de paiements par virement: " + pourcentageVirements + "%");
	  }
	}

