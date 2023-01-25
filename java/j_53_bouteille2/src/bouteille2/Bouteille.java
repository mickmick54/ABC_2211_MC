package bouteille2;

public class Bouteille {
	
	String recipient;
	
	float volume;
	
	String couleur;

	public Bouteille(String recipient, float volume, String couleur) {
		
        this.recipient = recipient;
        
        this.volume = volume;
        
        this.couleur = couleur;
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
