package portegarage;

public class App {
    private String state;
    private String behavior;

    public App() {
        this.state = "Fermée";
        this.behavior = "Manuel";
    }

    public void ouvert() {
    	deverouille();
        if (behavior.equals("Automatique")) {
            System.out.println("La porte de garage s'ouvre automatiquement");
        }
        state = "Ouverte";
        System.out.println("Le statut actuel est : " + state);
    }

    public void ferme() {
        if (behavior.equals("Automatique")) {
            System.out.println("La porte de garage se ferme automatiquement");
        }
        state = "Fermée";
        System.out.println("Le statut actuel est : " + state);
    }

    public void verrouille() {
        this.state = "Verrouillée";
    }

    public void deverouille() {
        this.state = "Déverrouillée";
    }

    public void partiellementOuvert() {
        this.state = "Partiellement ouverte";
    }

    public void setComportement(String behavior) {
        this.behavior = behavior;
    }

    public String getEtat() {
        return state;
    }

    public String getComportement() {
        return behavior;
    }

    public static void main(String[] args) {
        App app = new App();
        app.ouvert();
        System.out.println("State: " + app.getEtat());
        app.ferme();
        System.out.println("State: " + app.getEtat());
        app.verrouille();
        System.out.println("State: " + app.getEtat());
        app.partiellementOuvert();
        System.out.println("State: " + app.getEtat());
    }
}

