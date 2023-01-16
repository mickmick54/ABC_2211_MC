package conway;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Suite de Conway !!!");
		
		String valeurs = "11211";

		// System.out.println(valeurs.substring(1,4));
		
		String chiffre = valeurs.substring(0, 1); // lis le premier charactère de la chaine "valeurs"
		
		// char chiffre = valeurs.charAt(0);
		
		int occurences = 1;
		
		String resultat = "";
		
		for (int i = 1; i < valeurs.length(); i++) {
			
			// System.out.println(valeurs.substring(i, i + 1));
			
			String charactere = valeurs.substring(i, i + 1); // lis le charactere à la position "i"
			
			// char charactere = valeurs.charAt(i);
			
			if (chiffre.equals(charactere)) {
				
				++occurences; // incrémentation du nombre d'occurences du charactère courant
				
			} else {
				// changement de charactère
				
				resultat = resultat + "" + occurences + "" +  valeurs.substring(i - 1, i);
				
				chiffre = charactere; // on stocke le nouveau charactere
				
				occurences = 1; // réinitialise le compteur
			}
		}
		// ajout du nombre d'occurences du dernier charactere
		resultat = resultat + "" + occurences + "" + valeurs.charAt(valeurs.length()-1);
		
		// affichage du résultat
		System.out.println(resultat);
		
		System.out.println("Programme terminé !!!");
	}

}
