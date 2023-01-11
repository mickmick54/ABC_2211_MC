package for_testing;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Premier test
		for ( int i = 0; i < 10; i++) {
			
			// déclarations exécutées à chaque itération
			
			   if (i == 2 ||i == 5) {
				   
			   continue;
			   
			   }
			   
			System.out.println("Valeur de i : " + i + ".");
			
		}
		
		// Deuxieme test
		int [] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		for (int i = 0; i < myArray.length; i++) {
			
		   if (myArray[i] == 50) {
			   
		   System.out.println ("J’ai trouvé mon  " + myArray[i] + " !");
		   
		   break;
		   
		   }
		   
		System.out.println ("J’en suis à " + myArray[i] + " ...");
		}
		
		// Troisieme test
		for (int i = 0; i < 5; i++) {
			
            if (i == 4) {
            	
                continue;
            }
            
            System.out.println("I am having so much fun!");
        }
	}

}
