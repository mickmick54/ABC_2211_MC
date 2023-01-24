package bouteille1;

public class MaClasse {

	public static final int maPropriete = 0;

	private static boolean isFull;
    private static boolean isOpen;

    public void bottle() {
        this.isFull = true;
        this.isOpen = false;
    }

    public static void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("La bouteille est ouverte.");
        } else {
            System.out.println("La bouteille est déjà ouverte.");
        }
    }

    public static void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("La bouteille est fermée.");
        } else {
            System.out.println("La bouteille est déjà fermée.");
        }
    }

    public static void fill() {
        if (!isFull) {
            isFull = true;
            System.out.println("La bouteille est remplie.");
        } else {
            System.out.println("La bouteille est déjà remplie.");
        }
    }

    public static void empty() {
        if (isFull) {
            isFull = false;
            System.out.println("La bouteille est vidée.");
        } else {
            System.out.println("La bouteille est déjà vide.");
        }
    }
}
