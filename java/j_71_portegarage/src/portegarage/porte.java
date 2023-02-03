package portegarage;

public class porte {
    private static String state;
    private String comportement;

    public porte() {
        this.setState("Fermée");
        this.comportement = "Manuel";
    }

    public void ouvert() {
    	deverouille();
        if (comportement.equals("Automatique")) {
            System.out.println("La porte de garage s'ouvre automatiquement");
        }
        setState("Ouverte");
        System.out.println("Le statut actuel est : " + getState());
    }

    public void ferme() {
        if (comportement.equals("Automatique")) {
            System.out.println("La porte de garage se ferme automatiquement");
        }
        setState("Fermée");
        System.out.println("Le statut actuel est : " + getState());
    }

    public void verrouille() {
        this.setState("Verrouillée");
    }

    public void deverouille() {
        this.setState("Déverrouillée");
    }

    public void partiellementOuvert() {
        this.setState("Partiellement ouverte");
    }

    public void setComportement(String behavior) {
        this.comportement = behavior;
    }

    public String getEtat() {
        return getState();
    }

    public String getComportement() {
        return comportement;
    }

	public static String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
