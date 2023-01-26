package enonce2;

import java.lang.Math;

import java.util.Scanner;

public class App {

	/*
	Procédure triangle(a, b, c)
  	p = a + b + c
  	aire = ((p/2-a)(p/2-b)(p/2-c))1/2
  	Afficher "Périmètre : ", p
  	Afficher "Aire : ", aire
	Fin de la procédure
	Appeler la procédure triangle(3, 4, 5)
	
	*/
	
	private static double a;
	private static double b;
	private static double c;
	private static double p;
	private static double area;

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le coté a");
		
		a = sc.nextDouble();
		
		System.out.println("Saisir le coté b");
		
		b = sc.nextDouble();
		
		System.out.println("Saisir le coté c");
		
		c = sc.nextDouble();
		
		if (isValidTriangle(a, b, c)) {
			
		    p = perimetre(a, b, c);
		    
		    area = aire(a, b, c, p);
		    
		    System.out.println("Perimetre: " + p);
		    
		    System.out.println("Aire: " + area);
		    
		} else {
			
		    System.out.println("Les côtés saisis ne forment pas un triangle valide");
		}
        
        sc.close();

	}
	
	public static boolean isValidTriangle(double a, double b, double c) {
		
	    if (a + b > c && a + c > b && b + c > a) {
	    	
	        return true;
	    }
	    
	    return false;
	}
	
	public static double perimetre(double a, double b, double c) {
		
        return a + b + c;
    }

    public static double aire(double a, double b, double c, double p) {
    	
        double s = p / 2;
        
        return Math.sqrt( s * (s-a) * (s-b) * (s-c));
    }

}
