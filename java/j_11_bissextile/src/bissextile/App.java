package bissextile;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez une année");
		
		a = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + a);
		
			if ((a % 100 != 0)&&(a % 4 == 0)) {
				System.out.println("Cette année est bissextile");
			} else /*if (a % 400 == 0)*/ {
				System.out.println("Cette année n'est pas bissextile");
			}	
	}
}

