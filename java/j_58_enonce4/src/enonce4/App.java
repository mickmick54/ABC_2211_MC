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
	
	private static int annee;

	public void classVariables(int annee) {
		
		App.annee = annee;
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduisez l'année :");
		
		App.annee = sc.nextInt();
		
		if (annee % 4 == 0 && ((annee % 100 > 0) || (annee % 400 == 0))) {
			
			System.out.println("L'année " + annee + " est bissextile.");
			
		} else {
			
			System.out.println("L'année " + annee + " n'est pas bissextile.");
		}
		
		sc.close();
	}

}
