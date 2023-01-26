package enonce3;

import java.util.Scanner;

public class App {
	
	/*
		VARIABLES
			n1 est un entier
			n2 est un entier
			moyenne est un entier double precision
		DEBUT
			Ecrire "Donnez un premier nombre"
			Lire n1
			Ecrire "Donnez un deuxieme nombre"
			Lire n2
			moyenne <-- n1 + n2 / 2
			Ecrire "Le résultat de la moyenne de" n1 " et " n2 " est : " moyenne
		FIN
	
	*/
	
	private static int n1;
	private static int n2;
	private static double moyenne;

	public void classVariables(int n1, int n2, double moyenne) {
		
		App.n1 = n1;
		
		App.n2 = n2;
        
		App.moyenne = moyenne;
	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Calcul de la moyenne de 2 nombres.");
		
		System.out.println("Entrez le 1er nombre : ");
		
		n1 = sc.nextInt();
		
		System.out.println("Entrez le 2eme nombre : ");
		
		n2 = sc.nextInt();
		
		moyenne = (n1 + n2) / 2d;
		
		System.out.println("Le résultat de la moyenne de " + n1 + " et de " + n2 + " est : " + moyenne);
		
		sc.close();
	}

}
