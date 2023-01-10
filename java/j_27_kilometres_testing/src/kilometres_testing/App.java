package kilometres_testing;

import java.util.Scanner;

public class App {

	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
			
			double m;

	        while (true) {
	        	
	            System.out.print("Entrez une distance en kilomètres (q pour quitter) : ");
	            
	            String distance = sc.nextLine();
	            
	            if (distance.equals("q")) {
	            	
	                break;
	            }
	            
	            try {
	                double distanceDouble = Double.parseDouble(distance);
	                
	                if (0.01 <= distanceDouble && distanceDouble <= 1000000) {
	                	
	                	m = distanceDouble * 0.621371;
	                	
	                	System.out.println(m);
	                
	                    break;
	                    
	                } else {
	                	
	                    System.out.println("La distance doit être comprise entre 0.01 et 1 000 000");
	                }
	                
	            } catch (NumberFormatException e) {
	            	
	                System.out.println("La distance doit être un nombre valide");
	            }
	        }
	        
	        sc.close();
	    }
}
