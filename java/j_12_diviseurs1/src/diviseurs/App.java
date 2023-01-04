package diviseurs;

import java.util.Scanner;

public class App {

	/*
	  Ecrire « Donnez un nombre »
			n  nombre entier
			Lire n
			i, s nombre entier
			Lire i, s
			s = n²
			Ecrire « recherche des diviseurs de » n
			i = 1
			Tant que i < s
				Si le reste de la division de n par i est nul alors
					Ecrire i
					Ecrire n / i
					i = i + 1 
				Si le reste de la division de n par s est nul alors
					Ecrire s
			Ecrire « Recherche des diviseurs terminée »
    */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un nombre");
		
		int n = 0;
		
		int s;
	
		n = sc.nextInt();
		
		int i = 0;
		
		s = (int) Math.pow(n, 2);
		
		i = 1;
		
		while (i < s) {

			if (i / n <= 0) {
				
				System.out.println( i );
				
				System.out.println( n / i );
				
				i = i + 1;
				
			} else if (i / n <= 0) {
				
				System.out.println( s );
			}
			
		}
	}
}

