package tribulle;

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

    bubbleSort(t);

    System.out.println("Tableau trié :");
    
    for (int i = 0; i < n; i++) {
    	
      System.out.print(t[i] + " ");
      
    }
    
    System.out.println();
  }

  public static void bubbleSort(int[] t) {
	  
    int n = t.length;
    
    for (int i = 0; i < n - 1; i++) {
    	
      for (int j = 0; j < n - i - 1; j++) {
    	  
        if (t[j] > t[j + 1]) {
        	
          int temp = t[j];
          
          t[j] = t[j + 1];
          
          t[j + 1] = temp;
        }
      }
    }
  }
}
