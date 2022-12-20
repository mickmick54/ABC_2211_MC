package aire;

import java.util.Scanner; // importation de l'objet scanner pour la saisie utilisateur

public class App {
	
	/*

	Ecrire « Donnez la valeur du rayon R »
	Lire R
	Aire  4 * PI * R^2
	Volume  4 / 3 * PI * R^3
	Ecrire « la valeur » Aire
	Ecrire « la valeur » Volume

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclaration des variables
		double pi = Math.PI; // utilisation de l'objet pi de la classe Java
		
		int rayon = 0;
		
		double aire; 
		
		double volume;
		
		// déclaration du scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcul de l'air et du volume d'une sphère");
		
		// on demande à l'utilisateur de saisir le rayon de la sphère
		System.out.println("Saisir la valeur du rayon");
		
		// on stocke la valeur saisie dans la variable rayon
		rayon = sc.nextInt(); 
		 
		System.out.println("Vous avez saisi : " + rayon);
		
		// on fait le calcul de l'aire et on stocke le résultat dans la variable aire
		aire = 4 * pi * Math.pow(rayon, 2); // utilisation de l'objet pow (puissance) de la classe math (1er paramètre : la variable 1er nombre, le 2eme l'exposant)
		
		// on fait le calcul de l'volume et on stocke le résultat dans la variable volume
		volume = 4 / 3d * pi * Math.pow(rayon, 3);
		
		// on affiche le résultat
		System.out.println("L'aire de la sphère est " + aire + ". Son volume est " + volume);
	}

}
