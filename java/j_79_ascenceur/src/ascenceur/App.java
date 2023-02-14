package ascenceur;

public class App {

	public static void main(String[] args) {
		
		Ascenseur ascenseur = new Ascenseur();

		// Ajouter des personnes
		if (ascenseur.ajouterPersonnes(10)) {
		    System.out.println("10 personnes ont été ajoutées.");
		} else {
		    System.out.println("Impossible d'ajouter 10 personnes : capacité maximale atteinte.");
		}

		// Fermer la porte
		ascenseur.fermerPorte();

		// Monter à l'étage suivant
		ascenseur.monter();

		// Afficher l'état de l'ascenseur
		ascenseur.afficherEtat();
		
		Scanner sc = new Scanner(System.in);
        System.out.println("L'ascenseur est actuellement à l'étage " + ascenseur.getEtageActuel());

        int etage = demanderEtageDestination(sc);
        ascenseur.allerAEtage(etage);

        sc.close();

	}

	public static int demanderEtageDestination(Scanner sc) {
        System.out.print("Entrez l'étage de destination (0-7) : ");
        return sc.nextInt();
    }

}
