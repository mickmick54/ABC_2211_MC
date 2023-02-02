package portegarage;

public class App {
    private String state;
    private String behavior;

    public App() {
        this.state = "Fermée";
        this.behavior = "Manuel";
    }

    public void open() {
    	unlock();
        if (behavior.equals("Automatique")) {
            System.out.println("La porte de garage s'ouvre automatiquement");
        }
        state = "Ouverte";
        System.out.println("Le statut actuel est : " + state);
    }

    public void close() {
        if (behavior.equals("Automatique")) {
            System.out.println("La porte de garage se ferme automatiquement");
        }
        state = "Fermée";
        System.out.println("Le statut actuel est : " + state);
    }

    public void lock() {
        this.state = "Verrouillée";
    }

    public void unlock() {
        this.state = "Déverrouillée";
    }

    public void partiallyOpen() {
        this.state = "Partiellement ouverte";
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getState() {
        return state;
    }

    public String getBehavior() {
        return behavior;
    }

    public static void main(String[] args) {
        App app = new App();
        app.open();
        System.out.println("State: " + app.getState());
        app.close();
        System.out.println("State: " + app.getState());
        app.lock();
        System.out.println("State: " + app.getState());
        app.partiallyOpen();
        System.out.println("State: " + app.getState());
    }
}

