package tri3;

import java.util.Scanner;

public class App {

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
		
		
		if (a < b && a < c && b < c) {
			System.out.println(a + ", " + b + ", " + c);
		}
		else if (a < b && a < c && c < b) {
			System.out.println(a + ", " + c + ", " + b);
		}
		if (b < a && b < c && a < c) {
			System.out.println(b + ", " + a + ", " + c);
		}
		else if (b < a && b < c && c < a) {
			System.out.println(b + ", " + c + ", " + a);
		}
		if (c < a && c < b && a < b) {
			System.out.println(c + ", " + a + ", " + b);
		}
		else if (c < a && c < b && b < a) {
			System.out.println(c + ", " + b + ", " + a);
		}
		/*
		else {
			System.out.println("Il y a une erreur, des nombres sont identique.");
		}
		*/
		
	}

}
