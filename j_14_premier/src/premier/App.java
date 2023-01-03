package premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un nombre");
		
		int n = 0;
		
		int i = 0;
	
		n = sc.nextInt();
		
		for (i = 2; i <= n-1; i++) {
				
			if (i / n <= 0) {
				
				System.out.println(n + " n'est pas un nombre premier");
				
			} else {
				
				System.out.println(n + " est un nombre premier");
			}
	  
	    }
	}
}

