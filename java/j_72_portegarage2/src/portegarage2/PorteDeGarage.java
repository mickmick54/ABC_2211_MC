package portegarage2;

public class PorteDeGarage {
	
    private String etat;
    private String comportement;
    private int ouverturePartielle;

    public PorteDeGarage() {
        this.etat = "Fermée";
        this.comportement = "Manuel";
    }

    public void ouvrir() {
        deverrouiller();
        if (comportement.equals("Automatique")) {
            System.out.println("La porte de garage s'ouvre automatiquement");
        }
        etat = "Ouverte";
        System.out.println("L'état actuel est : " + getEtat());
    }

    public void fermer(int pourcentage) {
        if (comportement.equals("Automatique")) {
            System.out.println("La porte de garage se ferme automatiquement");
        } else if (pourcentage >= 0 && pourcentage <= 0) {
            ouverturePartielle = pourcentage;
            etat = "Fermée";
            System.out.println("L'ouverture partielle est définie à " + pourcentage + "%");
        }
        etat = "Fermée";
        System.out.println("L'état actuel est : " + getEtat());
    }

    public void verrouiller() {
        etat = "Verrouillée";
    }

    public void deverrouiller() {
        etat = "Déverrouillée";
    }

    public void ouvrirPartiellement(int pourcentage) {
        if (pourcentage >= 0 && pourcentage <= 100) {
            ouverturePartielle = pourcentage;
            etat = "Partiellement ouverte";
            System.out.println("L'ouverture partielle est définie à " + pourcentage + "%");
        } else {
            System.out.println("La valeur d'ouverture doit être comprise entre 0 et 100");
        }
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    public String getEtat() {
        return etat;
    }

    public int getOuverturePartielle() {
        return ouverturePartielle;
    }

    public String getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return "PorteDeGarage [etat=" + etat + ", comportement=" + comportement + "]";
    }
}
