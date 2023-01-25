package bouteille2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	
	private static boolean isFull;
    private static boolean isOpen;

    public void bottle() {
        this.isFull = true;
        this.isOpen = false;
    }

    public static void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("La bouteille est ouverte.");
        } else {
            System.out.println("La bouteille est déjà ouverte.");
        }
    }

    public static void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("La bouteille est fermée.");
        } else {
            System.out.println("La bouteille est déjà fermée.");
        }
    }

    public static void fill() {
        if (!isFull) {
            isFull = true;
            System.out.println("La bouteille est remplie.");
        } else {
            System.out.println("La bouteille est déjà remplie.");
        }
    }

    public static void empty() {
        if (isFull) {
            isFull = false;
            System.out.println("La bouteille est vidée.");
        } else {
            System.out.println("La bouteille est déjà vide.");
        }
    }
	
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
  	
  	  System.out.println("Entrez une valeur entre 1, 2, 3 et 4 :");
  	
  	  int action = sc.nextInt();
  	  
  	  if (action == 1) {
  		  
  		  open();
  		  
	  } else if (action == 2) {
		  
		  close();
  		  
	  } else if (action == 3) {
		  
		  fill();
  		  
	  } else if (action == 4) {
		  
		  empty();
		  
	  } else {
		  
		  System.out.println("Veuillez absolument entrez une valeur entre 1, 2, 3 et 4 :");
		  
		  action = sc.nextInt();
	  }
  	  
	  // stock de bouteilles
  	  
	  Bouteille eauPetillante = new Bouteille("plastique", 0.5f, "verte");
	  Bouteille whisky = new Bouteille("verre", 1.5f, "transparent");
	  Bouteille the = new Bouteille("aluminium", 1f, "metalisé");

	  Bouteille[] stock = new Bouteille[1];
	  
	  stock[0] = eauPetillante;
	  
	  // étendre la taille du tableau
	  stock = Arrays.copyOf(stock, stock.length + 2);

	  // ajouter les nouveaux éléments
	  stock[1] = whisky;
	  stock[2] = the;

	  int index = 0;

	  // System.out.println("Le stock est de : " + Arrays.toString(stock) + " bouteilles");
	  System.out.println("Le stock est de : " + stock.length + " bouteilles");
	  //System.out.println(whisky.toString());
	  System.out.println("Matériau : " + whisky.getMaterial());
	  System.out.println("Contenance : " + whisky.getCapacity() + "L");
	  System.out.println("Couleur : " + whisky.getColor());

   }
}

