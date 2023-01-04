package tri1_correction;

import java.util.Scanner;

public class App {
	
	/*
		VARIABLES
			a est un entier
			b est un entier
		
		DEBUT DU PROGRAMME
			afficher "donnez un premier nombre"
			lire a
			afficher "donnez un deuxieme nombre"
			lire b
			
			DEBUT SI
				SI a > b
				ALORS
					afficher b puis a
				SINON
					afficher a puis b
			FIN SI
		
		FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez le premier nombre");
		a = sc.nextInt();
		
		System.out.println("Saisissez le deuxième nombre");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(b + ", " + a);
		} else {
			System.out.println(a + ", " + b);
		}
		sc.close();	
	}
}
