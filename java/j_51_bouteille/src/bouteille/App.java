package bouteille;

import java.util.Scanner;

public class App {
	
    private boolean isFull;
    private boolean isOpen;

    public void bottle() {
        this.isFull = true;
        this.isOpen = false;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("La bouteille est ouverte.");
        } else {
            System.out.println("La bouteille est déjà ouverte.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("La bouteille est fermée.");
        } else {
            System.out.println("La bouteille est déjà fermée.");
        }
    }

    public void fill() {
        if (!isFull) {
            isFull = true;
            System.out.println("La bouteille est remplie.");
        } else {
            System.out.println("La bouteille est déjà remplie.");
        }
    }

    public void empty() {
        if (isFull) {
            isFull = false;
            System.out.println("La bouteille est vidée.");
        } else {
            System.out.println("La bouteille est déjà vide.");
        }
    }
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Entrez une valeur entre 1 et 2 :");
    	
    	int action = sc.nextInt();
    	
    	if (action == 1) {
    		System.out.println(open());
    	}
    }
}
