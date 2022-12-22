package age;

import java.util.Scanner;

public class App {
	
	/*
	 
	Ecrire « Donnez votre âge »
	a  0
	Lire a
	Si a > 17
	Ecrire « Vous êtes majeur »
	Sinon si a < 1
	Ecrire « Vous n’êtes pas encore né »
	Sinon
	Ecrire « Vous êtes mineur »

	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez votre âge");
		
		a = sc.nextInt();
		
		if ( a > 17 ) {
			System.out.println("Vous êtes majeur");
		} else if ( a < 1 ) {
			System.out.println("Vous n'êtes pas encore né");
		}  else {
			System.out.println("Vous êtes mineur");
		}
		
	}

}
