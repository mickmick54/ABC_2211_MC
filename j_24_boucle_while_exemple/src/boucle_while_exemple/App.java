package boucle_while_exemple;

/*
VARIABLES

compteur est un entier

DEBUT DU PROGRAMME

compteur <-- 1

tant que compteur <= 50
ecrire compteur
compteur + 1
fin boucle tant que

FIN DU PROGRAMME

*/

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int compteur = 1;
		
		while (compteur < 50) {
			
			System.out.print(compteur + " ");
			
			compteur++;
		}
	}
}
