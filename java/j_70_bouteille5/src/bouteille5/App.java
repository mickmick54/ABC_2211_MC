package bouteille5;

import java.util.Scanner;

public class App {

    private static boolean estPleine;
    private static boolean estOuverte;
    private static double capaciteEnL;
    private static double contenanceEnL;
    private static String nom;

    public void Bouteille(String nom) {
        this.nom = nom;
        estPleine = true;
        estOuverte = false;
        capaciteEnL = 1.5;
        contenanceEnL = 0;
    }

    public static boolean ouvrir() {
        if (!estOuverte) {
            estOuverte = true;
            System.out.println("La bouteille " + nom + " est ouverte.");
            return true;
        } else {
            System.out.println("La bouteille " + nom + " est déjà ouverte.");
            return false;
        }
    }

    public static boolean fermer() {
        if (estOuverte) {
            estOuverte = false;
            System.out.println("La bouteille " + nom + " est fermée.");
            return true;
        } else {
            System.out.println("La bouteille " + nom + " est déjà fermée.");
            return false;
        }
    }

    public static boolean remplirTout() {
        if (estOuverte && contenanceEnL < capaciteEnL) {
            contenanceEnL = capaciteEnL;
            System.out.println("La bouteille " + nom + " est remplie.");
            return true;
        } else {
            System.out.println("La bouteille " + nom + " est déjà remplie ou non ouverte.");
            return false;
        }
    }

    public static boolean remplir(double quantiteEnL) {
        if (estOuverte && contenanceEnL + quantiteEnL <= capaciteEnL) {
            contenanceEnL += quantiteEnL;
            System.out.println("La bouteille " + nom + " est remplie avec " + quantiteEnL + "L.");
            return true;
        } else {
            System.out.println("La bouteille " + nom + " est déjà remplie ou non ouverte.");
            return false;
        }
    }

    public static boolean viderTout() {
        if (estOuverte && contenanceEnL > 0) {
            contenanceEnL = 0;
            System.out.println("La bouteille " + nom + " est vidée.");
            return true;
        } else {
            System.out.println("La bouteille " + nom + " est déjà vide ou non ouverte.");
            return false;
        }
    }

    public static boolean vider(double quantiteEnL) {
        if (estOuverte && contenanceEnL - quantiteEnL >= 0) {
            contenanceEnL -= quantiteEnL;
            System.out.println("La bouteille " + nom + " est vidée.");
            return true;
        } else {
            System.out.println("La bouteille " + nom + " est déjà vide ou non ouverte.");
            return false;
        }
    }
    
    public static boolean encoursOuverte(boolean b) {
		return estOuverte;
	}

	public boolean estdejaOuverte(boolean estOuverte) {
		this.estOuverte = estOuverte;
		return estOuverte;
	}
	
	public String nomBouteille()
	{
		return this.nom;		
	}
	
	public void Bouteille()
	{
		capaciteEnL = 1;
		contenanceEnL = 0;
		estdejaOuverte(false);
		nom = "eau" ;
	}
	
	public void Bouteille(double _capaciteEnL , double _contenanceEnL , boolean _estOuverte , String _nom)
	{
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estdejaOuverte(_estOuverte);
		this.nom = _nom;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez une valeur entre 1, 2, 3, 4, 5 et 6:");
      	
        int action = sc.nextInt();

        while (true) {

            if (action == 1) {
                ouvrir();
                System.out.println("Rechoisissez entre 1, 2, 3, 4, 5 et 6 :");
        		action = sc.nextInt();
            } else if (action == 2) {
                fermer();
                System.out.println("Rechoisissez entre 1, 2, 3, 4, 5 et 6 :");
        		action = sc.nextInt();
            } else if (action == 3) {
                remplirTout();
                System.out.println("Rechoisissez entre 1, 2, 3, 4, 5 et 6 :");
        		action = sc.nextInt();
            } else if (action == 4) {
                remplir(contenanceEnL);
                System.out.println("Rechoisissez entre 1, 2, 3, 4, 5 et 6 :");
        		action = sc.nextInt();
            } else if (action == 5) {
                viderTout();
                System.out.println("Rechoisissez entre 1, 2, 3, 4, 5 et 6 :");
        		action = sc.nextInt();
            } else if (action == 6) {
                vider(contenanceEnL);
                System.out.println("Rechoisissez entre 1, 2, 3, 4, 5 et 6 :");
        		action = sc.nextInt();
            } else {
                System.out.println("Veuillez entrer une valeur valide.");
                continue;
            }
        }
	}
}
