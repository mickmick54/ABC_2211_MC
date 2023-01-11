package moyenne;

import java.util.Scanner;

public class App {
	
	/*

	VARIABLES
		nombre1 est un ENTIER
		nombre2 est un ENTIER
		moyenne est un REEL double précision
	DEBUT PROGRAMME
		Ecrire « Introduisez le premier nombre »
		Lire nombre1
		Ecrire « Introduisez le deuxième nombre »
		Lire nombre2
		Lire moyenne des deux nombres
		Moyenne  (nombre1 + nombre2) / 2
		Ecrire « Le résultat de la moyenne de » nombre1 « et » nombre2 « est : » moyenne
	FIN PROGRAMME

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VARIABLES
		
		int nombre1; // déclaration d'une variable nommée "nombre1" et de type "entier"
		int nombre2; // déclaration d'une variable nommée "nombre2" et de type "entier"
		double moyenne; // déclaration d'une variable "moyenne" de type "réel double précision"
		
		// création d'un scanner (voir le PDF JAVA 03)
		Scanner sc = new Scanner(System.in); // permet de lire les saisies utilisateur
		
		// DEBUT PROGRAMME
		
		System.out.println("Calcul de la moyenne de 2 nombres");
		
		System.out.println("Saisir le premier nombre");
		
		nombre1 = sc.nextInt(); // appelle l'utilisateur à saisir un nombre entier dans la console
		
		System.out.println("Vous avez saisi : " + nombre1);
		
		nombre2 = sc.nextInt(); // appelle l'utilisateur à saisir un nombre entier dans la console
		
		System.out.println("Vous avez saisi : " + nombre2);
		
		moyenne = (nombre1 + nombre2) / 2D; // opération mathématique (2F, 2D, 2d)
		
		System.out.println("La moyenne des 2 nombres est " + moyenne);
	}

}
