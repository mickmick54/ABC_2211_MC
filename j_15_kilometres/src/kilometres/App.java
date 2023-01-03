package kilometres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un kilometrage");
		
		int k = 0;
		
		double m = 0;
	
		k = sc.nextInt();
		
		m = k * 0.621371;
		
		System.out.println(m);
		
		while (m > 0.01) {
			
			if (m > 1000000) {
				
				System.out.println("Saisissez une nouvelle valeur");
				
			} 
			
		break;	
		
		}	
	}
}
