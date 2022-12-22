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

		double a = 0;
		
		double b = 0;
		
		double c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un premier nombre");
		
		a = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + a);
		
		System.out.println("Donnez un deuxième nombre");
		
		b = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + b);
		
		System.out.println("Donnez un troisième nombre");
		
		c = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + c);
		
		if (a < b) {
			if (b < c) {
				System.out.println(a + b + c);
					} else if (a < c) {
						System.out.println(c + a + b);
					} else {
						System.out.println(a + c + b);
					} 
				   } else if (b > a) {
						System.out.println(b + c + a);
					} else  {
						System.out.println(c + b + a);
					} if (c < a) {
						System.out.println(b + a + c);
					}
			}
	    }
		

