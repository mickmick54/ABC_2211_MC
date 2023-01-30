package triselection;

import java.util.Random;

public class App {
	
	public static void main(String[] args) {
		  
	    int n = 10;
	    
	    int[] t = new int[n];
	    
	    Random random = new Random();

	    for (int i = 0; i < n; i++) {
	    	
	      t[i] = random.nextInt(100);
	    }

	    System.out.println("Tableau non trié :");
	    
	    for (int i = 0; i < n; i++) {
	    	
	      System.out.print(t[i] + " ");
	      
	    }
	    
	    System.out.println();

	    selectionSort(t);

	    System.out.println("Tableau trié :");
	    
	    for (int i = 0; i < n; i++) {
	    	
	      System.out.print(t[i] + " ");
	      
	    }
	    
	    System.out.println();
	  }

	public static void selectionSort(int[] t) {
		
		  int n = t.length;
		  
		  for (int i = 0; i < n - 1; i++) {
			  
		    int posmax = i;
		    
		    for (int j = i + 1; j < n; j++) {
		    	
		      if (t[j] > t[posmax]) {
		    	  
		        posmax = j;
		      }
		    }
		    
		    int temp = t[posmax];
		    
		    t[posmax] = t[i];
		    
		    t[i] = temp;
		  }
	}
}
