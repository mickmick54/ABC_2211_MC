package inversion;

import java.util.Scanner;

public class App {

	/*
	 
	1)	Lire a
	2)	Ecrire « Donnez la valeur de A » A
	3)	Lire b
	4)	Ecrire « Donnez la valeur de B » B
	5)	Temp  a
	6)	a  b
	7)	b  temp
	8)	Ecrire « A »
	9)	Ecrire « B »

	 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		
		int b = 0;
		
		int tmp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lire 2 nombres entiers et les inverser");
		
		System.out.println("Saisir le nombre a");
		
		a = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + a);
		
		System.out.println("Saisir le nombre b");
		
		b = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + b);
		
		System.out.println("Affichage de a : " + a);
		
		System.out.println("Affichage de b : " + b);
		
		tmp = a;
		
		a = b;
		
		b = tmp;
		
		System.out.println("Affichage de a : " + a);
		
		System.out.println("Affichage de b : " + b);
		
	}

}
