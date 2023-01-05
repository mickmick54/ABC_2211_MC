package diviseurs3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		VARIABLES
		i : entier // iterateur
		n : entier // saisie de l'utilisateur
		
		DEBUT DU PROGRAMME
		ecrire "Donnez un nombre"
		lire n
		
		Pour i de 2 à n , i < n , i++
			Si n mod i == 0
				Ecrire i
			Fin Si
		Fin Pour
		
		FIN DU PROGRAMME
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un nombre");
		
		int n;
	
		n = sc.nextInt();
		
		System.out.println("Recherche des diviseurs de : " + n);
		
		/*
		for (int i = 2; i <= n / 2 ; i++) {
			
			if (n % i == 0) {
				
				System.out.println(i);
			}
		}
		*/
		
		/*
		for (int i = 2; i < n; i += 2) {
			
			if (n % i == 0) {
				
				System.out.println(i);
			}
		}
		*/
			
		for (int i = 2; i < n; i++) {
			
			if (n % i == 0) {
				
				System.out.println(i);
			}
		}
			
		sc.close();
	}

}
