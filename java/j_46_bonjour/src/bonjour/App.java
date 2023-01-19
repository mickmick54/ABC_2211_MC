package bonjour;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mesCollegues = {
							"Samba",
							"Mustapha",
							"Olivier",
							"Raphael",
							"Mickael",
							"Florian",
							"Guillaume",
							"Terence",
							"Natana",
							"Kevin",
							"Frederic",
							"Stephan"
						  };
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Quel est votre choix : (entre 1-12) ");
		
		int numero = clavier.nextInt();
		
		if (numero >= 1 && numero <= 12) {
			
		    System.out.println("Le prenom du stagiaire " + numero + " est " + mesCollegues[numero-1]);
		    
		    System.out.println("Bonjour " + mesCollegues[numero-1]);
		    
		} else {
			
		    System.out.println("Error 404 not found.");
		}
		
		clavier.close();
		
	}
	
}
