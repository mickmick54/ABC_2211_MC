package barnabe;

import java.util.Scanner;

public class App {
	
	/*
		DEBUT
		  magasins <- 0
		  solde <- S
		  TANT QUE solde > 0 FAIRE
		    magasins <- magasins + 1
		    solde <- solde - (solde / 2 + 1)
		  FIN TANT QUE
		  AFFICHER magasins
		FIN
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int solde = 0; 
        
        int numMagasins = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez la somme avec laquelle Barnabé à commencé à faire ses courses");
		
		solde = sc.nextInt();

		while (solde > 0) {
			
			numMagasins = numMagasins + 1;
			
			solde = solde - (solde / 2 + 1);
		}
		
        // affiche le nombre de magasins dans lesquels Barnabé a fait ses achats
        System.out.println("Barnabé a fait ses courses dans " + numMagasins + " magasins.");
	}

}
