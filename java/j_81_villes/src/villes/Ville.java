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
	
	// Mutateurs
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	public void setNomPays(String pNomPays) {
		nomPays = pNomPays;
	}
	public void setNbHabitants(int nbre) {
		nbHabitants = nbre;
	}
		
	// constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville par défaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
	}
	
	// constructeur classique avec paramètres
	// J'ai ajouté un << p >> en 1ère lettre des paramètres
	// Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	public Ville(String pNom, int nbre, String pNomPays) {
		System.out.println("Creation d'une ville avec des paramètres");
		nomVille = pNom;
		nomPays = pNomPays;
		nbHabitants = nbre;
	}
}
