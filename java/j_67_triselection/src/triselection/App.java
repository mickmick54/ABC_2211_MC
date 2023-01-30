package triselection;

public class App {

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
