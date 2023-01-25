package bouteille2;

public class Bouteille {
	
	String nom;
	
	String recipient;
	
	float volume;
	
	String couleur;

	public Bouteille(String nom, String recipient, float volume, String couleur) {
		
		this.nom = nom;
		
		this.recipient = recipient;
        
        this.volume = volume;
        
        this.couleur = couleur;
    }
	
	public String getName() {

		return nom;
	}

	public String getMaterial() {

		return recipient;
	}

	public float getCapacity() {

		return volume;
	}

	public String getColor() {

		return couleur;
	}

}
