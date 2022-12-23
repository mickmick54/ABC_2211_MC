package tri2;

import java.util.Scanner;

public class App {

	/*
	 
	Ecrire « Donnez trois nombres »
	a  nombre1
	Lire a
	b  nombre2
	Lire b
	c nombre3
	Lire c
	Si a < b
		Si b < c
			Afficher a b c
				Sinon Si a < c
						Afficher a c b
					Sinon
						Afficher c a b
				Sinon Si  b > a
						Afficher b c a
					Sinon
						Afficher c b a
				Sinon Si c < a
						Afficher b a c

	 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Nbr1, Nbr2, Nbr3;

		double a = 0;
		
		double b = 0;
		
		double c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un premier nombre");
		
		Nbr1 = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + Nbr1);
		
		System.out.println("Donnez un deuxième nombre");
		
		Nbr2 = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + Nbr2);
		
		System.out.println("Donnez un troisième nombre");
		
		Nbr3 = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + Nbr3);
		
		/*
		if (a < b) {
			if (b < c) {
				System.out.println(a + ", " + b + ", " + c);
					} else if (a < c) {
						System.out.println(c + ", " + a + ", " + b);
					} else {
						System.out.println(a + ", " + c + ", " + b);
					} 
			} else if (b > a) {
						System.out.println(c + ", " + b + ", " + a);
					} else  {
						System.out.println(b + ", " + c + ", " + a);
					} if (c < a) {
						System.out.println(b + ", " + a + ", " + c);
					}
		*/
		
		/*
		if (a < b && b > c)	{
			a = c;
			b = b;
			c = a;	
			System.out.println(c + ", " + b + ", " + a);
		}	
		else if (a > b && a > c && c > b) {
			a = a;
			c = b;
			b = c;
			System.out.println(a + ", " + b + ", " + c);
		}
		else if (b > a && a > c) {
			b = c;
			a = b;
			c = a;
			System.out.println(b + ", " + a + ", " + c);
		}
		else if (b > a && b > c && c > b) {
			b = c;
			a = a;
			c = b;
			System.out.println(c + ", " + a + ", " + b);
		}
		*/
		
		if (Nbr1 < Nbr2 && Nbr2 > Nbr3)	{
			a = Nbr1;
			b = Nbr2;
			c = Nbr3;	
		}	
		else if (Nbr1 > Nbr3 && Nbr3 > Nbr2) {
			a = Nbr1;
			b = Nbr3;
			c = Nbr2;
		}
		else if (Nbr2 > Nbr1 && Nbr1 > Nbr3) {
			a = Nbr2;
			b = Nbr1;
			c = Nbr3;
		}
		else if (Nbr2 > Nbr3 && Nbr3 > Nbr1) {
			a = Nbr2;
			b = Nbr3;
			c = Nbr1;
		}
		else if (Nbr3 > Nbr1 && Nbr1 > Nbr2) {
			a = Nbr3;
			b = Nbr1;
			c = Nbr2;
		}
		else if (Nbr3 > Nbr1 && Nbr2 > Nbr1) {
			a = Nbr3;
			b = Nbr2;
			c = Nbr1;
		}
		else {
			System.out.println("Il y a une erreur, des nombres sont identique.");
		}
		
		if (a != 0) {
			System.out.println("Voici les nombres dans l'ordre croisant : " + c + ", " + b + ", " + a);
		}
		
		
		/*
		if ((a < b) && (b > c))	{
			System.out.println(b + ", " + c + ", " + a);
		}	
		else if ((a > b) && (a > c) && (c > b)) {
			System.out.println(a + ", " + b + ", " + c);
		}
		else if ((b > a) && (a > c)) {
			System.out.println(b + ", " + a + ", " + c);
		}
		else if ((b > a) && (b > c) && (c > b)) {
			System.out.println(b + ", " + c + ", " + a);
		}
		
		*/
		
		
		
			}
	    }
		

