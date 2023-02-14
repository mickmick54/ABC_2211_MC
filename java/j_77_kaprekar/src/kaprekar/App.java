package kaprekar;

public class App {
    public static void main(String[] args) {
    	
        int num = 495; // Le nombre à tester
        
        int square = num * num; // Calculer le carré du nombre
        
        String squareStr = Integer.toString(square); // Convertir le carré en chaîne de caractères
        
        int numDigits = Integer.toString(num).length(); // Compter le nombre de chiffres dans le nombre initial
        
        if (squareStr.length() % 2 == 0) {
        	
            squareStr = "0" + squareStr; // Si le nombre de chiffres du carré est pair, ajouter un zéro à gauche
        }
        
        String leftStr = squareStr.substring(0, squareStr.length() / 2); // Extraire la moitié gauche du carré
        
        String rightStr = squareStr.substring(squareStr.length() / 2); // Extraire la moitié droite du carré
        
        int left = Integer.parseInt(leftStr); // Convertir la moitié gauche en entier
        
        int right = Integer.parseInt(rightStr); // Convertir la moitié droite en entier
        
        if (left + right == num) {
        	
            System.out.println(num + " est un nombre de Kaprekar"); // Si la somme de la moitié gauche et de la moitié droite est égale au nombre initial, alors c'est un nombre de Kaprekar
            
        } else {
        	
            System.out.println(num + " n'est pas un nombre de Kaprekar"); // Sinon, ce n'est pas un nombre de Kaprekar
        }
    }
}

