package tri;

import java.util.Scanner;

public class App {
	
  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in);
    
    int Nb, i;
    
    boolean Flag;
    
    int[] T;

    System.out.print("Enter the number of values: ");
    
    Nb = input.nextInt();
    
    T = new int[Nb];

    for (i = 0; i < Nb; i++) {
    	
      System.out.print("Enter number " + (i + 1) + ": ");
      
      T[i] = input.nextInt();
      
    }

    Flag = true;
    
    i = 1;
    
    while (T[i] == T[i - 1] + 1 && i < Nb - 1) {
    	
      i++;
    }

    if (T[i] == T[i - 1] + 1) {
    	
      System.out.println("Numbers are consecutive");
      
    } else {
    	
      System.out.println("Numbers are not consecutive");
    }
  }
}

