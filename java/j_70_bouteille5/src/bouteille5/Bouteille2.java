package bouteille5;

public class Bouteille2 {
	
	private static boolean estPleine;
    private static boolean estOuverte;
    private static double capaciteEnL;
    private static double contenanceEnL;
    private static String nom;

    public Bouteille2() {
        estPleine = true;
        estOuverte = false;
        capaciteEnL = 1.5;
        contenanceEnL = 1.5;
        nom = "eau" ;
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

    public static boolean remplir(double contenanceEnL ) {
        if (estOuverte && contenanceEnL <= capaciteEnL) {
            contenanceEnL = 1.5;
            System.out.println("La bouteille " + nom + " est remplie avec " + contenanceEnL + "L.");
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

    public static boolean vider(double contenanceEnL) {
        if (estOuverte && contenanceEnL >= 0) {
            contenanceEnL = 0;
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
	
	@Override 
	public String toString() {
		return "Nom : " + nom + ", est pleine : " + estPleine + ", est ouverte : " + estOuverte + ", capacité en L : " + capaciteEnL + ", contenance en L : " + contenanceEnL;
	}
	
	
}
