package kilometres_correction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double m;
		
		double km;
		
		String quit = "q";
		
		String km_str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une distance en kilomètres (q pour quitter) : ");
		
		km_str = sc.nextLine();
		
		km = Double.parseDouble(km_str);
		
		if (km_str.equals(quit));
		
		while (true) {
			
	        if (0.01 <= km && km <= 1000000) {
	        	
	        	m = km * 0.621371;
	        	
	        	System.out.println(m);	
	        	
	        	break;
	        	
	        } else {
	        	
	            System.out.println("La distance doit être comprise entre 0.01 et 1 000 000");
	            
	            break;
	        } 
		}
		
		sc.close();
	} 
}
