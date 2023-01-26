package enonce4;

import java.util.Scanner;

public class App {
	
	/*
		VARIABLES
			annee est un entier
		DEBUT
			écrire "Introduisez l'année :"
			lire annee
				SI (annee mod 4 = 0) et ((annee mod 100 > 0) ou (annee mod 400 = 0)) alors  
					écrire "L'année ", annee, "est bissextile."
					sinon  écrire "L'année ", annee, " n'est pas bissextile."
				FIN SI
		FIN
	*/
	
	public static boolean estBissextile(int annee) {
		
	    if (annee % 400 == 0) {
	    	
	        return true;
	        
	    } else if (annee % 100 == 0) {
	    	
	        return false;
	        
	    } else if (annee % 4 == 0) {
	    	
	        return true;
	        
	    } else {
	    	
	        return false;
	    }
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez une année :");
		
		int annee = sc.nextInt();
		
		if (estBissextile(annee)) {
			
		    System.out.println(annee + " est bissextile.");
		    
		} else {
			
		    System.out.println(annee + " n'est pas bissextile.");
		}
		
		sc.close();
	}

}
