package kaprekar2;

public class App {
	
	/*
	 
	 la méthode isKaprekar vérifie si un nombre est un nombre de Kaprekar en utilisant l'algorithme de Kaprekar. 
	 La méthode main utilise ensuite une boucle for pour tester chaque nombre entre 1 et 9999 et afficher les nombres de Kaprekar trouvés. 
	 La méthode isKaprekar est définie comme une méthode séparée pour améliorer la lisibilité et la réutilisabilité du code.
	 
	 */
	
    public static void main(String[] args) {
    	
        int min = 1; // La borne inférieure de la recherche
        
        int max = 9999; // La borne supérieure de la recherche
        
        System.out.println("Les nombres de Kaprekar entre " + min + " et " + max + " sont :");
        
        for (int i = min; i <= max; i++) {
        	
            if (isKaprekar(i)) {
            	
                System.out.println(i);
            }
        }
    }
    
    public static boolean isKaprekar(int num) {
    	
        int square = num * num; // Calculer le carré du nombre
        
        String squareStr = Integer.toString(square); // Convertir le carré en chaîne de caractères
        
        int numDigits = Integer.toString(num).length(); // Compter le nombre de chiffres dans le nombre initial
        
        if (squareStr.length() % 2 == 0) {
        	
            squareStr = "0" + squareStr; // Si le nombre de chiffres du carré est pair, ajouter un zéro à gauche
        }
        
        String leftStr = squareStr.substring(0, squareStr.length() / 2); // Extraire la moitié gauche du carré
        
        String rightStr = squareStr.substring(squareStr.length() / 2); // Extraire la moitié droite du carré
        
        int left = (leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr)); // Convertir la moitié gauche en entier, ou 0 si la chaîne est vide
        
        int right = Integer.parseInt(rightStr); // Convertir la moitié droite en entier
        
        return (left + right == num); // Retourner true si la somme de la moitié gauche et de la moitié droite est égale au nombre initial, sinon retourner false
    }
}


