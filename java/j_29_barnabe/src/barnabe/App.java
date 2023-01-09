package barnabe;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = 0; 
		
        int p = 0;
        
        int numMagasins = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez la somme avec laquelle Barnabé à commencé à faire ses courses");
		
		s = sc.nextInt();

        if (s > 1){
        	
            p = s / 2;
            
            do {
            	
                p = p + 1;
                
                s = s - p;
                
                numMagasins++;
            }
            
            while (s > 1);
        }
        // affiche le nombre de magasins dans lesquels Barnabé a fait ses achats
        System.out.println("Barnabé a fait ses courses dans " + numMagasins + " magasins.");
	}

}
