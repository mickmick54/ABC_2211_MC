package taxes;

import java.util.Scanner;

public class App {

	/* *  
	    Variables nb, pht, ttva, pttc
		Ecrire "Entrez le prix hors taxes"
		Lire pht
		Ecrire "Entrez le nombre d'articles"
		Lire nb
		Ecrire "Entrez le taux de TVA"
		Lire ttva
		pttc <- nb * pht * (1+ ttva)
		Ecrire "Le prix de toutes taxes est :", pttc
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb = 0;
		double pht = 0;
		double ttva = 0;
		double pttc;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrez le prix hors taxes :");
		pht = clavier.nextInt();
		
		System.out.println("Entrez le nombre d'articles :");
		nb = clavier.nextInt();
		
		System.out.println("Entrez le taux de TVA :");
		ttva = clavier.nextInt();
		
		pttc = nb * pht * (1 + ttva);
		
		System.out.println("Le prix de toutes taxes est : " + pttc);
	}

}
