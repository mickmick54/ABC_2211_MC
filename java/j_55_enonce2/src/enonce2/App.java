package enonce2;

import java.lang.Math;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 3;
		
        double b = 4;
        
        double c = 5;
        
        double p = perimetre(a, b, c);
        
        double area = aire(a, b, c, p);
        
        System.out.println("Perimetre: " + p);
        
        System.out.println("Aire: " + area);	
	}
	
	public static double perimetre(double a, double b, double c) {
		
        return a + b + c;
    }

    public static double aire(double a, double b, double c, double p) {
    	
        double s = p / 2;
        
        return Math.sqrt( s * (s-a) * (s-b) * (s-c));
    }

}
