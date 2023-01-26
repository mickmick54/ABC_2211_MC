package enonce1;

import java.util.Scanner;

public class App {
	
	private static int a;
	private static int b;
	private static int tmp;

	/*
	 * 
	VARIABLES a, b
	DEBUT
    TEMP = a
    a = b
    b = TEMP
    FIN
    */
	
	public static void inversion() {
		
		tmp = a;
		
	    a = b;
	    
	    b = tmp;
		
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Lire 2 nombres entiers et les inverser");
		
		System.out.println("Saisir le nombre a");
		
		a = sc.nextInt();
		
		System.out.println("Saisir le nombre b");
		
		b = sc.nextInt();
		
		inversion();
	    
	    System.out.println(a + " " + b);
	    
	    sc.close();
	}

}
