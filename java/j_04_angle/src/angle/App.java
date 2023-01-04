package angle;

import java.util.Scanner;

public class App {

	/*
	 
	Ecrire « Donnez la valeur du rayon R d’un cercle et l’angle A»
	Lire R
	Lire A
	Aire  ( PI * R^2 )* A / 360
	Ecrire « la valeur » Aire

	 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = Math.PI;
		
		int rayon = 0;
		
		int angle = 0;
		
		double aire;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcul de l'air de l'angle en degrés");
		
		System.out.println("Saisir la valeur du rayon");
		
		rayon = sc.nextInt(); 
		
		System.out.println("Vous avez saisi : " + rayon);
		
		System.out.println("Saisir la valeur de l'angle");
		
		angle = sc.nextInt(); 
		
		System.out.println("Vous avez saisi : " + angle);
		
		aire = ( pi * Math.pow(rayon, 2)) * angle / 360;
		
		System.out.println("La surface de l'angle est " + aire );
		
		sc.close();
		
	}

}
