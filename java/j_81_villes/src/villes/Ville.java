package villes;

public class Ville {

	// stocke le nom de la ville
	private String nomVille;
	// stocke le nom du pays de la ville
	private String nomPays;
	// stocke le nombre d'habitant de la ville
	private int nbHabitants;	
	
	// Accesseurs
	public String getNom() {
		return nomVille;
	}
	public String getNomPays() {
		return nomPays;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public char getCategories() {
		return categories;
	}
	
	// Mutateurs
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	public void setNomPays(String pNomPays) {
		nomPays = pNomPays;
	}
	public void setNbHabitants(int nbre) {
		nbHabitants = nbre;
		this.setcategorie();
	}
		
	// constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville par défaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
		this.setcategorie();
	}
	
	// constructeur classique avec paramètres
	// J'ai ajouté un << p >> en 1ère lettre des paramètres
	// Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	public Ville(String pNom, int nbre, String pNomPays) {
		System.out.println("Creation d'une ville avec des paramètres");
		nomVille = pNom;
		nomPays = pNomPays;
		nbHabitants = nbre;
		this.setcategorie();
	}
	
	// Définit la categorie de la ville
	private void setcategorie( ) {
		int bornesSuperieurs [] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories [] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		
		while (i < bornesSuperieurs.length && this.nbHabitants > bornesSuperieurs[i]) {
			i++;
		}
		this.categories = categories[i];
	}
	
}
