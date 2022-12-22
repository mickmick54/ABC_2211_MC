package tri1;

import java.util.Scanner;

public class App {

	/*
	 
	Ecrire « Donnez deux nombres »
	a  nombre1
	Lire a
	b  nombre2
	Lire b
	Si a > b
	Ecrire b a
	Sinon si a < b
	Ecrire a b

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un premier nombre");
		
		a = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + a);
		
		System.out.println("Donnez un deuxième nombre");
		
		b = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + b);
		
		if ( a > b ) {
			System.out.println( b + ", " + a );
		} else if ( a < b ) {
			System.out.println( a + ", " + b );
		}
	}

}
