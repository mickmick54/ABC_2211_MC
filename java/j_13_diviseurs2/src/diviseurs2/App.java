package diviseurs2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un nombre");
		
		int n = 0;
	
		n = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + n);
		
		System.out.println("Recherche des diviseurs de : " + n);
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++){
				  
	            if (i * j == n){
	            	
	               System.out.println(i);

	            }
	        }
		}
		
		sc.close();
	}
}
