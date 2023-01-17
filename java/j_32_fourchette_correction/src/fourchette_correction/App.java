package fourchette_correction;

import java.util.Random;
import java.util.Scanner;

public class App {
	
	/*
	 VARIABLES
	 	min est un entier
	 	max est un entier
	 	nb est un entier générer aléatoirement
	 	nbJoueur est un entier saisie par le joueur
	 	borneMin est un entier
	 	borneMax est un entier
	 	nbEssais est un entier
	 
	 DEBUT DU PROGRAMME
	 
	 	Tant que nb est différent de nbJoueur 
	 		Faire
	 			Ecrire "Choisissez un nombre entre ",borneMin," et ",borneMax
	 			Lire nbJoueur
	 			Si nb est egale à nbJoueur 
	 				Alors
	 					Ecrire "Vous avez gagné en " ,nbEssais, " essais"
	 			Fin si
	 			Si nb est inférieur à nbJoueur
	 				Alors
	 					Ecrire "C'est moins"
	 					borneMax = nbJoueur - 1
	 			Fin Si
	 			Si nb est supèrieur à nbJoueur
	 				Alors
	 					Ecrire "C'est plus"
	 					borneMin = nbJoueur + 1
	 			Fin Si
	 			nbEssais + 1
	 	Fin Tant que
	 
	 FIN DU PROGRAMME
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb;
		int nbJoueur = 0;
		int borneMin = 0;
		int borneMax = 100;
		int nbEssais = 0;
		
		Random aleatoire = new Random();
	      
	    nb = aleatoire.nextInt(101);
		
		Scanner sc = new Scanner(System.in);
		
		while (nb != nbJoueur) {
			
			System.out.println("Choisissez un nombre entre " + borneMin + " et " + borneMax);
			
			nbJoueur = sc.nextInt();
			
			if (nb == nbJoueur) {
				System.out.println("Vous avez gagné en " + nbEssais + " essais");
			}
			else if (nb < nbJoueur) {
				System.out.println("C'est moins");
				borneMax = nbJoueur - 1;
			}
			else {
				System.out.println("C'est plus");
				borneMin = nbJoueur + 1;
			}
			nbEssais++;
		}
		sc.close();
	}
}
