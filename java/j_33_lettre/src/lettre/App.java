package lettre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		char target = 'a';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez une chaîne de caractères terminée par le caractère '.' : ");
		
		String input = scanner.nextLine();
		
		if (input.length() == 0 || (input.length() == 1 && input.charAt(0) == '.')) {
			
		    System.out.println("LA CHAINE EST VIDE");
		    
		} else {
			
		    for (int i = 0; i < input.length(); i++) {
		    	
		        if (input.charAt(i) == target) {
		        	
		            count++;
		        }
		    }
		    
		    System.out.println("Le nombre d'occurrences de la lettre '" + target + "' est : " + count);
		}
		
		scanner.close();
	}

}
