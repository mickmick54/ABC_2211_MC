package exercice3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a;
	
	int b;
	
	System.out.println("Donnez un nombre");

	a = sc.nextInt();
	
	System.out.println("Donnez un deuxième nombre");

	b = sc.nextInt();
	
	boolean divisible = estDivisible(a, b);
	
    if (divisible) {
    	
        System.out.println("Le premier nombre est divisible par le deuxième.");
        
    	} else {
    	
        System.out.println("Le premier nombre n'est pas divisible par le deuxième.");
        
    	}
	
	}
	
	public static boolean estDivisible(int a, int b) {
		
	    if (a % b == 0) {
	    	
	        return true;
	        
	    } else {
	    	
	        return false;
	    }
	}
}
