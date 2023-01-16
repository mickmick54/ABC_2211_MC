package boucles;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int indice = 1;
		
		while (indice >= 1 && indice <= 100) {
			
			if (indice % 7 == 0) {
				
				System.out.println("bzz");
				
			} else if (indice % 5 == 0) { 
				
				System.out.println("biz");
				
			} else {
				
				System.out.println(indice);
			}
			indice++;
		}
	}

}
