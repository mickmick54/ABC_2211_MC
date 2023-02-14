package ascenceur;

public class Ascenseur {
    private int etageActuel;
    private int capaciteMax;
    private int nbPersonnes;
    private boolean porteOuverte;
    
    public Ascenseur() {
        this.etageActuel = 0;
        this.capaciteMax = 20;
        this.nbPersonnes = 0;
        this.porteOuverte = true; // Initialement ouverte
    }
    
    public void ouvrirPorte() {
        this.porteOuverte = true;
    }
    
    public void fermerPorte() {
        this.porteOuverte = false;
    }
    
    public void monter() {
        if (!this.porteOuverte && this.etageActuel < 7) {
            this.etageActuel++;
        }
    }
    
    public void descendre() {
        if (!this.porteOuverte && this.etageActuel > 0) {
            this.etageActuel--;
        }
    }
    
    public boolean ajouterPersonnes(int nb) {
        if (this.nbPersonnes + nb <= this.capaciteMax) {
            this.nbPersonnes += nb;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean enleverPersonnes(int nb) {
        if (this.nbPersonnes - nb >= 0) {
            this.nbPersonnes -= nb;
            return true;
        } else {
            return false;
        }
    }
    
    public void allerAEtage(int etage) {
        if (etage < 0 || etage > 7) {
            System.out.println("L'étage demandé n'existe pas.");
            return;
        }
        if (!this.porteOuverte) {
            if (etage > this.etageActuel) {
                System.out.println("Ascenseur en mouvement : montée vers l'étage " + etage);
                while (this.etageActuel < etage) {
                    this.etageActuel++;
                    System.out.println("Etage actuel : " + this.etageActuel);
                }
                System.out.println("Ascenseur arrivé à l'étage " + etage);
            } else if (etage < this.etageActuel) {
                System.out.println("Ascenseur en mouvement : descente vers l'étage " + etage);
                while (this.etageActuel > etage) {
                    this.etageActuel--;
                    System.out.println("Etage actuel : " + this.etageActuel);
                }
                System.out.println("Ascenseur arrivé à l'étage " + etage);
            } else {
                System.out.println("L'ascenseur est déjà à l'étage demandé.");
            }
        } else {
            System.out.println("La porte est ouverte, impossible de bouger l'ascenseur.");
        }
    }
    
    // Pour afficher l'état de l'ascenseur
    public void afficherEtat() {
        System.out.println("Etage actuel : " + this.etageActuel);
        System.out.println("Nombre de personnes : " + this.nbPersonnes);
        System.out.println("Porte ouverte : " + (this.porteOuverte ? "oui" : "non"));
    }

	public String getEtageActuel() {
		return String.valueOf(this.etageActuel);
	}
}

