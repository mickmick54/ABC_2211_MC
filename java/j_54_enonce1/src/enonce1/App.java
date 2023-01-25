package enonce1;

import java.util.Scanner;

public class App {
	
	/*
	 * 
	VARIABLES a, b
	DEBUT
    TEMP = a
    a = b
    b = TEMP
    FIN
    */

	public static void main(String[] args) {
		
		int a = 0;
		
		int b = 0;
		
		int tmp = 0;
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Lire 2 nombres entiers et les inverser");
		
		System.out.println("Saisir le nombre a");
		
		a = sc.nextInt();
		
		System.out.println("Saisir le nombre b");
		
		b = sc.nextInt();
		
		int temp = a;
		
	    a = b;
	    
	    b = temp;
	    
	    System.out.println(a + " " + b);
	}

}
