package portegarage;

public class PorteDeGarage {
    private String etat;
    private String comportement;

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

    public void fermer() {
        if (comportement.equals("Automatique")) {
            System.out.println("La porte de garage se ferme automatiquement");
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

    public void ouvrirPartiellement() {
        etat = "Partiellement ouverte";
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    public String getEtat() {
        return etat;
    }

    public String getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return "PorteDeGarage [etat=" + etat + ", comportement=" + comportement + "]";
    }
}
