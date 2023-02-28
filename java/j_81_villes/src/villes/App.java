package villes;

public class App {

	public static void main(String[] args) {

		// Ville ville = new Ville("Paris", 2000000, "France");
		
		/*
		Ville ville0 = new Ville();
		System.out.println(ville.nomVille);
		ville.nomVille = "Monaco";
		System.out.println(ville.nomVille);
		Ville ville1 = new Ville("Marseille", 1500000, "France");
		ville1.nomPays = "Portugal";
		System.out.println(ville1.nomPays);
		*/
		
		Ville ville = new Ville();
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse", 108038, "France");
		
		System.out.println("\n ville = "+ville.getNom()+" ville de"+ville.getNbHabitants()+" habitant(s) se situant en "+ville.getNomPays());
		System.out.println("\n ville1 = "+ville1.getNom()+" ville de"+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
		System.out.println("\n ville1 = "+ville2.getNom()+" ville de"+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays());
	}

}
