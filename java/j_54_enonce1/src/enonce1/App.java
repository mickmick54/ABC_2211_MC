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
	
	public static int a;
	public static int b;
	public static int tmp;

	public void classNombres(int a, int b, int tmp) {
		
		App.a = a;
		
		App.b = b;
		
		App.tmp = tmp;
	
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Lire 2 nombres entiers et les inverser");
		
		System.out.println("Saisir le nombre a");
		
		a = sc.nextInt();
		
		System.out.println("Saisir le nombre b");
		
		b = sc.nextInt();
		
		tmp = a;
		
	    a = b;
	    
	    b = tmp;
	    
	    System.out.println(a + " " + b);
	    
	    sc.close();
	}

}
