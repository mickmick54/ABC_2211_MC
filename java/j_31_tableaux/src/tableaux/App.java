package tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] array = {1, 3, 5, 7, 9}; // tableau trié par ordre croissant
		 
		 int n = 0; // Initialisation de la variable nombre

		 int index = search(array, n); // appelle de la fonction de recherche
		 
		 Scanner sc = new Scanner(System.in);
	        
	     System.out.println("Entrez un nombre");
			
	     n = sc.nextInt(); // nombre à chercher

		 if (index != -1) { // si le nombre a été trouvé
		    	
			 System.out.println("Le nombre " + n + " a été trouvé à l'indice " + index);
		      
		 } else { // sinon
		    	
		     System.out.println("404 Not found");
		      
		    }
		 sc.close();
	     }

		  public static int search(int[] array, int n) {
			  
		    // Recherche dichotomique
		    int left = 0;
		    
		    int right = array.length - 1;
		    
		    while (left <= right) {
		    	
		      int middle = left + (right - left) / 2;
		      
		      if (array[middle] == n) {
		    	  
		        return middle; // nombre a été trouvé, on retourne l'indice
		        
		      } else if (array[middle] < n) {
		    	  
		        left = middle + 1;
		        
		      } else {
		    	  
		        right = middle - 1;
		      }
		    }
		    
		    return -1; // nombre n'a pas été trouvé, on retourne -1
		 }
		
}
