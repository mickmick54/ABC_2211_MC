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
		
		System.out.println("\n ville = "+ville.getNom()+" ville de "+ville.getNbHabitants()+" habitant(s) se situant en "+ville.getNomPays());
		System.out.println("\n ville1 = "+ville1.getNom()+" ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
		System.out.println("\n ville1 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays());
		
		// Nous allons interchanger les villes 1 et 2 tout ça par l'intermédiaire d'un autre objet ville
		Ville temp = new Ville();
		temp = ville1;
		ville1 = ville2;
		ville2 = temp;
		System.out.println("\n ville1 = "+ville1.getNom()+" ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
		System.out.println("\n ville1 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays());
		
		// Nous allons maintenant interchanger leurs noms par le biais de leurs mutateurs
		ville1.setNom("Hong Kong");
		ville2.setNom("New York");
		System.out.println("\n ville1 = "+ville1.getNom()+" ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
		System.out.println("\n ville1 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays());
		
		System.out.println("\n\n"+ville1.decrisToi());
		System.out.println(ville.decrisToi());
		System.out.println(ville2.decrisToi()+"\n\n");
		System.out.println(ville1.comparer(ville2));
	}

}
