package evaluation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Saississez un numéro de mois (entre 1-12) : ");
		
		String [] myArray = { "janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre" };
		
		int mois = clavier.nextInt();
		
		for (int i = 0; i < myArray.length; i++) {
			   
			while (mois >= 1 && mois <= 12) {
				
				   if (mois % 2 == 0 - 1) {
						
					    System.out.println("Le mois de " + myArray[i] +  " " + mois + " est pair.");
					    
					    System.out.println("Les jours pairs du mois sont : " + mois % 0);
						
					} else { 
						
						System.out.println("Le mois de " + myArray[i] + " " + mois + " est impair.");
						
						System.out.println("Les jours pairs du mois sont : " + mois % 1);
						
					} 
					
				   break;
			   }

			  if (mois <= 0 || mois >= 13) {
					
					System.out.println("Numéro de mois invalide, veuillez recommencer :");
					
					mois = clavier.nextInt();
			  }
			  
		}
		
		clavier.close();
	}	
}
