package mois;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Les jours pairs des mois impairs et les jours impairs des mois pairs");

		// Déclarer les variables

		Scanner sc = new Scanner(System.in);

		int mois;
		Boolean valide = false;
		int index;
		

		// saisie valide ou invalide

		do {
			System.out.println("Saisissez un numéro de mois.");
			mois = sc.nextInt();

			if (mois > 0 && mois < 13) {
				valide = true;
			}

			else {
				System.out.println("Saisie invalide ! Veuillez recommencer.");
			}

		} while (valide == false);
		

		// corespondance numéro et mois
		
		
		String annee[] = new String[] {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "août", "sepetembre", "octobre", "novembre", "décembre"};
		
		index = mois-1;
		
		System.out.println("Le mois numéro : "+mois+ " est : "+annee[index]);
		
		
		
		
		// si février (année normale 28 jours)

		if (mois == 2) {

			System.out.println("les jours impairs de ce mois n'étant pas des multiples de 3 sont : ");

			for (int i = 1; i < 29; i++) {

				if (i % 2 == 1 && i % 3 != 0 && i != 25) {
					System.out.print(i + ", ");
				}
				
				else if (i == 25) {
					System.out.print(i);
				}
			}

		} // fin if février
		
		

		// si mois pair

		else if (mois % 2 == 0 && mois < 7) { // mois avril et juin 30 jours

			System.out.println("les jours impairs de ce mois n'étant pas des multiples de 3 sont : ");

			for (int i = 1; i < 31; i++) {

				if (i % 2 == 1 && i % 3 != 0 && i != 29) {
					System.out.print(i + ", ");
				}
				
				else if (i == 29) {
					System.out.print(i);
				}
			}

		} // fin if pair début année

		else if (mois % 2 == 0 && mois > 7) { // mois août, octobre, décembre 31 jours

			System.out.println("les jours impairs de ce mois n'étant pas des multiples de 3 sont : ");

			for (int i = 1; i < 32; i++) {

				if (i % 2 == 1 && i % 3 != 0 && i != 31) {
					System.out.print(i + ", ");
				}
				
				else if (i == 31) {
					System.out.print(i);
				}
			}

		} // fin if pair fin année
		
		

		// si mois impair

		else {

			System.out.println("les jours pairs de ce mois ne terminant pas par 0 sont : ");

			for (int i = 1; i < 31; i++) {

				if (i % 2 == 0 && i % 10 != 0 && i != 28) {
					System.out.print(i + ", ");
				}
				
				else if (i == 28) {
					System.out.print(i);
				}
			}

		} // fin if impair

		sc.close();
	} // avant dernier
} // dernier
