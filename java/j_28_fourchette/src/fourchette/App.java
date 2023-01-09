package fourchette;

import java.util.Random;

import java.util.Scanner;

public class App {
	
	// Initialisation du chiffre mystere
	static int chiffreMystere;

	public static void main(String[] args) {
		  // Generer un nombre aleatoire entre 0 et 100
	      Random aleatoire = new Random();
	      
	      chiffreMystere = aleatoire.nextInt(101);
	      
	      // Initialisation des variables 
	      int chiffreMin = 0;
	      
	      int chiffreMax = 100;
	      
	      // Creation d'un scanner pour l'entrée utilisateur
	      Scanner sc = new Scanner(System.in);
	      
	      // Nombre de suppositions
	      int nombreDeSuppoz = 0;
	      
	      // Boucle while
	      while (true) {
	    	  
	         System.out.println("Devinez un nombre entre " + chiffreMin + " et " + chiffreMax);
	         
	         int entree = sc.nextInt();
	         
	         nombreDeSuppoz++;
	         
	         if (entree == chiffreMystere) {
	        	 
	            System.out.println("Bravo ! Vous avez trouvé en " + nombreDeSuppoz + " essais");
	            
	            break;
	            
	         } else if (entree > chiffreMystere) {
	        	 
	        	 chiffreMax = entree - 1;
	            
	         } else {
	        	 
	        	 chiffreMin = entree + 1;
	         }
	      }
	}
}
