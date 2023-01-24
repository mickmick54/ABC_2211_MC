package bouteille1;

import java.util.Scanner;

import bouteille1.MaClasse;

public class App {
   public static void main(String[] args) {
      // Création d'une instance de la classe "App"
      App maClasse = new App();
      
      Scanner sc = new Scanner(System.in);
  	
  	  System.out.println("Entrez une valeur entre 1, 2, 3 et 4 :");
  	
  	  int action = sc.nextInt();
  	  
  	  if (action == 1) {
  		  
  		  MaClasse.open();
  		  
	  } else if (action == 2) {
		  
		  MaClasse.close();
  		  
	  } else if (action == 3) {
		  
		  MaClasse.fill();
  		  
	  } else if (action == 4) {
		  
		  MaClasse.empty();
		  
	  } else {
		  
		  System.out.println("Veuillez absolument entrez une valeur entre 1, 2, 3 et 4 :");
		  
		  action = sc.nextInt();
	  }
   }
}

