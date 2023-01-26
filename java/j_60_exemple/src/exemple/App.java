package exemple;

import java.util.Scanner;

public class App {
	
	private static int addition(int nb1, int nb2) {
		
		int resultat = nb1 + nb2;
		
		return resultat;
	}
	
	private static void afficherResultat(int nombre1, int nombre2) {
		
		System.out.println(nombre1 + " + " + nombre2 + " = " + addition(nombre1, nombre2)); // appel de la fonction addition
	}

	public static void main(String[] args) {
		
		int saisie1;
		int saisie2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le premier nombre : ");
		saisie1 = sc.nextInt();
		System.out.println("Veuillez saisir le deuxième nombre : ");
		saisie2 = sc.nextInt();
		
		// appel de la procedure afficherResultat
		afficherResultat(saisie1, saisie2);
		
		int saisie3;
		int saisie4;
		
		System.out.println("Veuillez saisir le troisième nombre : ");
		saisie3 = sc.nextInt();
		System.out.println("Veuillez saisir le quatrième nombre : ");
		saisie4 = sc.nextInt();
		
		afficherResultat(saisie3, saisie4);
	}

}
