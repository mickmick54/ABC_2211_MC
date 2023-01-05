package premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un nombre");
		
		int n;
		
		int reste;
	
		n = sc.nextInt();
		
		for (int i = 2; i < n; i++) {
			
			reste = n % i;
				
			if (reste == 0) {
				
				System.out.println(n + " n'est pas un nombre premier");
				
			} else {
				
				System.out.println(n + " est un nombre premier");
			}
		
		break;
			
	    }
	}
}

