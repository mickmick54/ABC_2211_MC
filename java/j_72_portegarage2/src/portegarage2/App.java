package portegarage2;

public class App {

	public static void main(String[] args) {
	
		PorteDeGarage porte = new PorteDeGarage();
		
		System.out.println(porte.toString());
		
		porte.ouvrir();
        System.out.println("État: " + porte.getEtat());
        porte.fermer(0);
        System.out.println("État: " + porte.getEtat());
        porte.verrouiller();
        System.out.println("État: " + porte.getEtat());
        porte.ouvrirPartiellement(100);
        System.out.println("État: " + porte.getEtat());
	}
}
