package comparaison_correction;

import java.util.Scanner;

public class App {
		
	/*
	 * VARIABLES
	 * 		entier <-- age
	 * 
	 * DEBUT
	 * 		afficher "Saisissez votre âge"
	 * 		lire age
	 * 		si age < 0
	 * 			alors afficher "Vous n'êtes pas encore né.e."
	 * 		
	 * 		sinon si age < 18
	 * 			alors afficher "Vous êtes mineur.e."
	 * 
	 * 		sinon afficher "Vous êtes majeur.e."
	 * 
	 * FIN
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez votre âge.");
		
		a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("Vous n'êtes pas encore né.e.");
		} else if (a < 18) {
			System.out.println("Vous êtes mineur.e.");
		} else {
			System.out.println("Vous êtes majeur.e.");
		}
		
		sc.close();
	}

}
