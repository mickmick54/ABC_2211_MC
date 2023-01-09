package kilometres_correction2;

import java.util.Scanner;

/*
 VARIABLES
 	km est un reel
 	miles est un reel
 	fermeture_prog est un boolean
 	quit est une chaine de caractère
 	saisie_utilisateur est une chaine de caractère
 
 DEBUT DU PROGRAMME
 
 	Tant que fermeture_prog est faux 
 	Faire
 		Ecrire "Veuillez saisir une valeur en km comprise entre 0,01 et 1000000"
 		lire saisie utilisateur
 			Si saisie_utilisateur est egale à quit
 				Alors fermeture_prog est vraie
 			Sinon
 				km<-- conversion en reel de saisie utilisateur
 				Si km est inférieur à 0,01 ou supèrieur à 1000000
 					Alors 
 						Ecrire "Veuillez saisir une valeur en km comprise entre 0,01 et 1000000"
 						lire saisie utilisateur
 					Sinon
 						miles = km/1,609
 						Ecrire km + " kilomètres valent : "+miles+" miles"
 				Fin Si
 			Fin Si
 	Fin Tant que
 
 FIN DU PROGRAMME
 
 */

public class App {

	public static void main(String[] args) {
		
		double km; 
		
		double miles;
		
		String quit = "q";
		
		String saisie_utilisateur;
		
		boolean fermeture_prog = false;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(!fermeture_prog)
	    {
	        System.out.println("Veuillez saisir une valeur en km comprise entre 0,01 et 1000000 :");
	        
	        	saisie_utilisateur = sc.nextLine();
	        	
	        	if(saisie_utilisateur.equals(quit)) {
	        		
		        	fermeture_prog = true;
		        }
	        	
		        else {
		        	
		            km = Double.parseDouble(saisie_utilisateur);
		            
			            if(km < 0.01 || km > 1000000) {
			            	
			            	System.out.println("Veuillez saisir une valeur en km comprise entre 0,01 et 1000000 :");
			            	
			            	saisie_utilisateur = sc.nextLine();
			            	
			            } else {
			            	miles = km/1.609;
			            	
			            	System.out.println(km + " kilomètres valent : "+ miles + " miles");
			            	
			            }
		        }
		 }     
	}
}

