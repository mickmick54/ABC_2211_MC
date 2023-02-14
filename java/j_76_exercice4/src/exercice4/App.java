package exercice4;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    Random aleatoire = new Random();
	    
	    int borneMin = 0;
	    int borneMax = 100;
	    int nbEssaisMax = 10;
	    int nbEssais = 0;
	    int nbJoueur;
	    int nbOrdinateur = aleatoire.nextInt(borneMax - borneMin + 1) + borneMin;
	    
	    System.out.println("Bienvenue dans le jeu de la fourchette !");
	    System.out.println("Vous devez deviner le nombre choisi par l'ordinateur");
	    System.out.println("Le nombre est compris entre " + borneMin + " et " + borneMax);
	    System.out.println("Vous avez " + nbEssaisMax + " essais pour trouver le nombre");
	    System.out.println("----------------------------------------");
	    
	    do {
	        System.out.println("Essai n°" + (nbEssais + 1) + "/" + nbEssaisMax);
	        System.out.print("Choisissez un nombre : ");
	        nbJoueur = sc.nextInt();
	        
	        if (nbJoueur < nbOrdinateur) {
	            System.out.println("C'est plus !");
	            borneMin = nbJoueur + 1;
	        } else if (nbJoueur > nbOrdinateur) {
	            System.out.println("C'est moins !");
	            borneMax = nbJoueur - 1;
	        } else {
	            System.out.println("Bravo ! Vous avez trouvé le nombre en " + (nbEssais + 1) + " essais !");
	            break;
	        }
	        nbEssais++;
	    } while (nbEssais < nbEssaisMax);
	    
	    if (nbEssais == nbEssaisMax) {
	        System.out.println("Dommage, vous avez perdu !");
	        System.out.println("Le nombre à trouver était : " + nbOrdinateur);
	    }
	    
	    System.out.println("----------------------------------------");
	    System.out.print("Voulez-vous rejouer ? (O/N) : ");
	    String reponse = sc.next();
	    
	    if (reponse.equals("O") || reponse.equals("o")) {
	        main(null);
	    } else {
	        System.out.println("Au revoir !");
	        System.exit(0);
	    }
	    
	    sc.close();
	}


}
