package exercice2;

public class App {
	
	static int trouveNombreGrand(int[] array) {
		
	    int grand = array[0];
	    
	    for (int i = 1; i < array.length; i++) {
	    	
	        if (array[i] > grand) {
	        	
	            grand = array[i];
	        }
	    }
	    
	    return grand;
	}

	public static void main(String[] args) {
		
		int[] tab = {1, 2, 9, 4, 10, 1999};
		
		int top = trouveNombreGrand(tab);
		
		System.out.println("Le plus grand nombre est : " + top);


	}

}
