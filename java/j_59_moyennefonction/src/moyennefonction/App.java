package moyennefonction;

import java.util.Scanner;

public class App {
	
	private static int a;
	private static int b;
	
	public static double calculerMoyenne(double a, double b) {
		
	    return (a + b) / 2d;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Calcul de la moyenne de 2 nombres.");
		
		System.out.println("Entrez le 1er nombre : ");
		
		a = sc.nextInt();
		
		System.out.println("Entrez le 2eme nombre : ");
		
		b = sc.nextInt();
		
		double moyenne = calculerMoyenne((double) a, (double) b);
		
		System.out.println("Le résultat de la moyenne de " + a + " et de " + b + " est : " + moyenne);
		
		sc.close();
	}

}
