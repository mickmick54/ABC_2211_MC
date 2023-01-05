package tri3_correction;

import java.util.Scanner;

public class App {
	
	
	/*
	
	VARIABLES
	a est un réel
	b est un réel
	c est un réel
	
	DEBUT DU PROGRAMME
	Ecrire "Saisir un nombre a : "
	Lire a
	Ecrire "Saisir un nombre b : "
	Lire b
	Ecrire "Saisir un nombre c : "
	Lire c
	
	Si a < b
		si b < c
			Ecrire a , "<" , b , "<" , c
			
		Sinon // b <= a
			Si a < c
				Ecrire a , "<" , c , "<" , b
			Sinon // c <= a
				Ecrire c , "<" , a , "<" , b
			Fin Si
		Fin Si
	Sinon // b <= a
		Si a < c
			Ecrire b , "<" , a , "<" , c
		Sinon // c <= a
			Si b < c
				Ecrire b , "<" , c , "<" , a
			Sinon // c <= b
				Ecrire c , "<" , b , "<" , a
			Fin Si
		Fin Si
	Fin Si
	
	FIN DU PROGRAMME
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DECLARATION DES VARIABLES
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT DU PROGRAMME
		
		System.out.println("Saisir un nombre a : ");
		a = sc.nextDouble();
		
		System.out.println("Saisir un nombre b : ");
		b = sc.nextDouble();
		
		System.out.println("Saisir un nombre c : ");
		c = sc.nextDouble();
		
		if (a < b) {
			if (b < c) {
				System.out.println(a + " < " + b + " < " + c);
			}
			else {
				if (a < c) {
					System.out.println(a + " < " + c + " < " + b);
				}
				else {
					System.out.println(c + " < " + a + " < " + b);
				}
			}
		}
		else {
			if (a < c) {
				System.out.println(b + " < " + a + " < " + c);
			}
			else {
				if (b < c) {
					System.out.println(b + " < " + c + " < " + a);
				}
				else {
					System.out.println(c + " < " + b + " < " + a);
				}
			}
		}
	}
}
