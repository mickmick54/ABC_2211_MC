package interet;

import java.util.Scanner;

public class App {

	/*

	1)	Ecrire « Donnez la somme »
	2)	Lire S
	3)	Ecrire « Donnez l’intérêt »
	4)	Lire i
	5)	Ecrire « Donnez le nombre d’années »
	6)	Lire N
	7)	Somme1  S ( 1 + N * i )
	8)	Somme2  S ( 1 + i )N
	9)	Ecrire « La valeur avec un intérêt simple est » somme1
	10)	Ecrire « La valeur avec un intérêt composé est » somme2s

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int S = 0;
		
		int N = 0;
		
		int i = 0;
		
		double resultatsimple;
		
		double resultatcompose;
		
		Scanner sc = new Scanner(System.in);
		
		// INTERET SIMPLE
		System.out.println("Calcul d'un intérêt simple");
		
		System.out.println("Saisir la somme du compte en banque");
		
		S = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + S);
		
		System.out.println("Saisir le nombre d'années");
		
		N = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + N);
		
		System.out.println("Saisir l'intérêt");
		
		i = sc.nextInt();
		
		resultatsimple = S * ( 1 + N * i ) / 100;
		
		resultatcompose = Math.pow(S * ( 1 + i ), N) / 100;
		
		System.out.println("L'intérêt simple est de " + resultatsimple);
		
		System.out.println("L'intérêt composé est de " + resultatcompose);
		
		
	}

}
